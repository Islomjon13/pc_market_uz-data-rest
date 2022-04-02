package com.example.lesson2_task2_pcmarket_uz.repository;

import com.example.lesson2_task2_pcmarket_uz.entity.Laptop;
import com.example.lesson2_task2_pcmarket_uz.projections.CustomLaptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "laptop",excerptProjection = CustomLaptop.class)
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}