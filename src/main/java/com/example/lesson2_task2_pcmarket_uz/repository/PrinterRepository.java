package com.example.lesson2_task2_pcmarket_uz.repository;

import com.example.lesson2_task2_pcmarket_uz.entity.Printer;
import com.example.lesson2_task2_pcmarket_uz.projections.CustomPrinter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "printer",excerptProjection = CustomPrinter.class)
public interface PrinterRepository extends JpaRepository<Printer, Long> {
}