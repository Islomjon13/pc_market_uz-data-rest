package com.example.lesson2_task2_pcmarket_uz.entity.base;

import com.example.lesson2_task2_pcmarket_uz.enums.ComputerType;
import lombok.*;

import javax.persistence.*;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Computer extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private ComputerType computerType;


    private String cpu;
    private String gpu;
    private String coolingSystem;
    private String ram;
    private String ssd;
    private String operationSystem;


}
