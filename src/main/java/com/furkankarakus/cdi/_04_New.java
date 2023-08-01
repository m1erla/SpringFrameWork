package com.furkankarakus.cdi;

import com.furkankarakus.StudentDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.New;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.*;

import java.io.Serializable;

@Named(value = "newtuto")
@ApplicationScoped

public class _04_New extends StudentDto{
    // produced
    @Produces
    public String producedData(@New StudentDto studentDto){
        studentDto = StudentDto.builder()
                .studendId(0L)
                .studentName("student name")
                .build();
        return studentDto.getStudentName();
    }
    @Getter
    @Inject
    private String consumingData;
}
