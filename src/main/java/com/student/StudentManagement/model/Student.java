package com.student.StudentManagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.student.StudentManagement.enumurations.Diplomat;
import com.student.StudentManagement.enumurations.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "student")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    @Column(unique=true)

    private String cin ;
    @Column(unique=true)
    private Long apogee;
    private String nom ;
    private String prenom ;
    @Column(unique=true)
    private String cne ;
    @Column(unique=true)
    private String email ;
    private String phone;
    private Date dateNaissance ;
    private String lieuNaissance ;
    private String adresse ;
    private Gender genre ;
    @Enumerated(EnumType.STRING)
    private Diplomat diplomat ;
   // new

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "filiere_id", nullable = true)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Filiere filier;

//    @ManyToMany
//    private List<Carriere> carrieres;
}
