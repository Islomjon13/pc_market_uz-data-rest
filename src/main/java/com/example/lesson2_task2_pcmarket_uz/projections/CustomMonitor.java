package com.example.lesson2_task2_pcmarket_uz.projections;

import com.example.lesson2_task2_pcmarket_uz.entity.Laptop;
import com.example.lesson2_task2_pcmarket_uz.entity.Monitor;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Monitor.class)
public interface CustomMonitor {
    Long getId();
    String getName();
    Double getPrice();

    String getBrand();
    String getScreenResolution();
    String getVga();
    String getMatrix();
    Double getScreenDiagonal();
    boolean isCurvedScreen();
    int getScreenRefreshRate();
    Double getResponseTime();

    String getDescription();
    String videoLink();
    Double warrantyYear();
}
