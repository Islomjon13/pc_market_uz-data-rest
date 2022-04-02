package com.example.lesson2_task2_pcmarket_uz.projections;

import com.example.lesson2_task2_pcmarket_uz.entity.Monitor;
import com.example.lesson2_task2_pcmarket_uz.entity.MonoBlock;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = MonoBlock.class)
public interface CustomMonoBlock {
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
