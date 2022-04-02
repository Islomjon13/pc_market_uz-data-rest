package com.example.lesson2_task2_pcmarket_uz.projections;

import com.example.lesson2_task2_pcmarket_uz.entity.MonoBlock;
import com.example.lesson2_task2_pcmarket_uz.entity.Pc;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Pc.class)
public interface CustomPc {
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

    String getCorpse();

    String getDescription();
    String videoLink();
    Double warrantyYear();
}
