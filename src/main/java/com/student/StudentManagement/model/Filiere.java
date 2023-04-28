package com.student.StudentManagement.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.util.List;


@Entity(name = "filiere")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id ;
    private String name ;
   //@OneToMany(mappedBy = "filiere",cascade = CascadeType.ALL)
  // private List<Student> students ;
   @OneToMany
   private List<ModuleF> modules;


}
