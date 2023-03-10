package com.microservices.student;


import com.microservices.supervisor.SupervisorDTO;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StundentService {
    private final StudentRepository repo;
    public void addStudent (Student student){
        repo.save(student);
    }
    @Transactional
    public void addStudents(List<Student>students){
        repo.saveAll(students);
    }
    public List<StudentDTO>getStudents(){
      List<Student>students =  repo.findAll();
      List<StudentDTO>studentDTO = students.stream().map(n->createDTO(n)).collect(Collectors.toList());
      return studentDTO;
    }
    public List<StudentDTO>getStudentsWithoutSupervisor(){
        List<Student>students = repo.findAll();
        List<StudentDTO>studentsWOutSupervisor = new ArrayList<>();
        for(int i =0; i<students.size(); i++){
            studentsWOutSupervisor.add(new StudentDTO(students.get(i).getId(), students.get(i).getName(), students.get(i).getSurname()));
        }return studentsWOutSupervisor;
    }

    public void updateStudent(Student student) {
        repo.save(student);
    }
    public Student findById(int id){
        return repo.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public void deleteStudent(int id) {
        repo.deleteById(id);
    }

    private StudentDTO createDTO(Student student){
        SupervisorDTO supervisorDTO = new SupervisorDTO(student.getSupervisor().getId(), student.getSupervisor().getName(), student.getSupervisor().getSurname());
        return new StudentDTO(student.getId(), student.getName(), student.getSurname(), supervisorDTO);
    }

}
