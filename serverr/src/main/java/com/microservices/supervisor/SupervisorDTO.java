package com.microservices.supervisor;


import com.microservices.student.StudentDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SupervisorDTO {
    private int id;
    private String name;
    private String surname;
    private List<StudentDTO> studentDTOS;

    public SupervisorDTO(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public SupervisorDTO(int id, String name, String surname, List<StudentDTO> studentDTOS) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.studentDTOS = studentDTOS;
    }
}
