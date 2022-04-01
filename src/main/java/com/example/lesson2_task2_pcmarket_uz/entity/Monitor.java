package com.example.lesson2_task2_pcmarket_uz.entity;

import com.example.lesson2_task2_pcmarket_uz.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Monitor extends BaseEntity {
    
    private String brand;
    private String screenResolution;
    private String vga;
    private String matrix;
    private Double screenDiagonal;
    private boolean curvedScreen;
    private int screenRefreshRate;
    private Double responseTime;

}
