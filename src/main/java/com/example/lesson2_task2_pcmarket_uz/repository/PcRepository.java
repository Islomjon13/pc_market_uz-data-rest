package com.example.lesson2_task2_pcmarket_uz.repository;

import com.example.lesson2_task2_pcmarket_uz.entity.Pc;
import com.example.lesson2_task2_pcmarket_uz.projections.CustomPc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "pc",excerptProjection = CustomPc.class)
public interface PcRepository extends JpaRepository<Pc, Long> {
}