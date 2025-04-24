package com.example.demo.repository;

import com.example.demo.repository.TarefaRepository;
import com.example.demo.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TarefaRepository extends JpaRepository<Tarefa, Long> {}