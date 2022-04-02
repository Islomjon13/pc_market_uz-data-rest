package com.example.lesson2_task2_pcmarket_uz.repository;

import com.example.lesson2_task2_pcmarket_uz.entity.Monitor;
import com.example.lesson2_task2_pcmarket_uz.projections.CustomMonitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "monitor",excerptProjection = CustomMonitor.class)
public interface MonitorRepository extends JpaRepository<Monitor, Long> {
}