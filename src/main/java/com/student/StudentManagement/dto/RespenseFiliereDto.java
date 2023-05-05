package com.student.StudentManagement.dto;

import com.student.StudentManagement.model.ModuleF;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class RespenseFiliereDto {
    private String name ;
    private List<ModuleF> modules;
}
