package com.example.lesson2_task2_pcmarket_uz.projections;

import com.example.lesson2_task2_pcmarket_uz.entity.Laptop;
import com.example.lesson2_task2_pcmarket_uz.enums.ComputerType;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Laptop.class)
public interface CustomLaptop {
    Long getId();
    String getName();
    Double getPrice();

    String getComputerType();

    String getCpu();
    String getGpu();
    String getCoolingSystem();
    String getRam();
    String getSsd();
    String getOperationSystem();

    Double getScreenDiagonal();
    Double getScreenResolution();

    String getDescription();
    String videoLink();
    Double warrantyYear();
}
