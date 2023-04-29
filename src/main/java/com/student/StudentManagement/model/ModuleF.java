package com.student.StudentManagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "module")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ModuleF {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "filiere_id", nullable = true)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Filiere filiere;

}
