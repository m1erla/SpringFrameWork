package com.furkankarakus;

import lombok.*;
// Data Transfer Object = DTO
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDto {

    private Long studendId;
    private String studentName;
    private String studentSurname;
}
