package com.microservices.supervisor;


import com.microservices.student.StudentDTO;
import com.microservices.student.StundentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SupervisorService {
    private final SupervisorRepository repository;
    private final StundentService service;
    public List<SupervisorDTO> getSupervisors() {
        List<Supervisor>supervisor = repository.findAll();
        List<SupervisorDTO>supervisorDTO=supervisor.stream().map(n->createDTO(n)).collect(Collectors.toList());
        return supervisorDTO;
    }
    private SupervisorDTO createDTO(Supervisor supervisor){
        List<StudentDTO>students = service.getStudentsWithoutSupervisor();
        return new SupervisorDTO(supervisor.getId(), supervisor.getName(), supervisor.getSurname(), students);
    }

}
