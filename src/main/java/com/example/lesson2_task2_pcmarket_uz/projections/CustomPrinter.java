package com.example.lesson2_task2_pcmarket_uz.projections;

import com.example.lesson2_task2_pcmarket_uz.entity.Pc;
import com.example.lesson2_task2_pcmarket_uz.entity.Printer;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Printer.class)
public interface CustomPrinter {
    Long getId();
    String getName();
    Double getPrice();

    String getBrand();
    String getColor();
    String getFeature();
    String getPrintTechnology();
    Double getMaxFormat();
    boolean isDoubleSidePrinting();
    String getConnectivity();
    Double getBlackPrintSpeed();
    Double getColorPrintSpeed();

    String getDescription();
    String videoLink();
    Double warrantyYear();
}
