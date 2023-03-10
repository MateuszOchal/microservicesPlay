package com.microservices.student;


import com.microservices.supervisor.SupervisorDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTO {
    int id;
    String name;
    String surname;
    SupervisorDTO supervisor;

    public StudentDTO(int id, String name, String surname, SupervisorDTO supervisor) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.supervisor = supervisor;
    }

    public StudentDTO(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}
