package com.example.lesson2_task2_pcmarket_uz.repository;

import com.example.lesson2_task2_pcmarket_uz.entity.MonoBlock;
import com.example.lesson2_task2_pcmarket_uz.projections.CustomMonoBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "monoBlock",excerptProjection = CustomMonoBlock.class)
public interface MonoBlockRepository extends JpaRepository<MonoBlock, Long> {
}