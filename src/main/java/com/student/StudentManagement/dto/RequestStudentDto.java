package com.student.StudentManagement.dto;

import com.student.StudentManagement.enumurations.Gender;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
@Builder
public class RequestStudentDto {
    private String cin ;
    private long apogee;
    private String nom ;
    private String prenom ;
    private String cne ;
    private String email ;
    private String phone;
    private Date dateNaissance ;
    private String lieuNaissance ;
    private String adresse ;
    private Gender genre ;
}
