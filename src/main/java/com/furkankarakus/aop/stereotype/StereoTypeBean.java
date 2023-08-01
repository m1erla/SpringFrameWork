package com.furkankarakus.aop.stereotype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MineStereoType
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StereoTypeBean {
    private Long id;
    private String name = "Hello Beans";
    private String trade;
}
