package com.microservices.student;



import com.microservices.supervisor.Supervisor;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "students", schema = "public")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String surname;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supervisor_id")
    Supervisor supervisor;

    public Student(String name, String surname, Supervisor supervisor) {
        this.name = name;
        this.surname = surname;
        this.supervisor = supervisor;
    }
}
