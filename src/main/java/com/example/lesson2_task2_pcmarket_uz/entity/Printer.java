package com.example.lesson2_task2_pcmarket_uz.entity;

import com.example.lesson2_task2_pcmarket_uz.entity.base.BaseEntity;
import com.example.lesson2_task2_pcmarket_uz.enums.ComputerType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Printer extends BaseEntity {

    private String brand;
    private String color;
    private String feature;
    private String printTechnology;
    private Double maxFormat;
    private boolean DoubleSidePrinting;
    private String connectivity;
    private Double blackPrintSpeed;
    private Double colorPrintSpeed;

}
