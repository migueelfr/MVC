package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Tarefa;

public interface repositoryy extends MongoRepository<Tarefa, String> {
    
}
