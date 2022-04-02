package com.example.lesson2_task2_pcmarket_uz.entity;

import com.example.lesson2_task2_pcmarket_uz.entity.base.Computer;
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
public class Pc extends Computer {

    private String corpse;
}
