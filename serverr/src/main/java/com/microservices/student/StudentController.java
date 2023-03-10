package com.microservices.student;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping
public class StudentController {
    private final StundentService service;

    @GetMapping("/student/{id}")
    public Student findById(@PathVariable int id){
        return service.findById(id);
    }
    @GetMapping("/students")
    public List<StudentDTO>getStudents(){
        return service.getStudents();
    }
    @PostMapping("/add-com.microservices.com.microservices.student")
    public void addStudent(@RequestBody Student student) {
        service.addStudent(student);
    }

    @PostMapping("/add-student-list")
    public void addStudentList(@RequestBody List<Student>students){
        service.addStudents(students);
    }

    @PutMapping("/update-student/{id}")
    public void updateStudent(@PathVariable int id, @RequestBody Student student){
        Student studentToEdit = service.findById(id);
        studentToEdit.setName(student.getName());
        studentToEdit.setSurname(student.getSurname());
        service.addStudent(studentToEdit);
    }
    @GetMapping("/delete/{id}")
    public void deleteStudent(@PathVariable int id){
        service.deleteStudent(id);
    }

}
