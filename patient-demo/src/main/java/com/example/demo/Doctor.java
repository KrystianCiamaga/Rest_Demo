package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String first_name;

    private String last_name;

    private long phone_number;


    private String email;

    private String specialization;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "doctors_patients",
            joinColumns = @JoinColumn (name = "doctor_id"),inverseJoinColumns = @JoinColumn(name = "patient_id"))
    private List<Patient> patientList;

}

