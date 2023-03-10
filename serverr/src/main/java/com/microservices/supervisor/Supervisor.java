package com.microservices.supervisor;

import com.microservices.student.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name="supervisor", schema = "public")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Supervisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String surname;
    @OneToMany(mappedBy = "supervisor", fetch = FetchType.LAZY)
    List<Student> students;

    public Supervisor(String name, String surname, List<Student> students) {
        this.name = name;
        this.surname = surname;
        this.students = students;
    }
}
