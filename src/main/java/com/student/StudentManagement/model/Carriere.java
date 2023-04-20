package com.student.StudentManagement.model;

import com.student.StudentManagement.enumurations.Diplomat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "carriere")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Carriere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;
    @Enumerated(EnumType.STRING)
    private Diplomat diplomat;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Student> students;





}
