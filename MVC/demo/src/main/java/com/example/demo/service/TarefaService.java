package com.example.demo.service;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Tarefa;
import com.example.demo.repository.repositoryy;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private repositoryy tarefaRepository;

    public List<Tarefa> listar() {
        return tarefaRepository.findAll();
    }

    public Tarefa criar(@Valid Tarefa tarefa) {
        tarefa.setDataCriacao(java.time.LocalDateTime.now());
        return tarefaRepository.save(tarefa);
    }

    public Tarefa atualizar(String id, @Valid Tarefa tarefaAtualizada) {
        Optional<Tarefa> tarefaOptional = tarefaRepository.findById(id);
        if (tarefaOptional.isEmpty()) {
            throw new RuntimeException("Tarefa não encontrada!");
        }
        Tarefa tarefa = tarefaOptional.get();
        tarefa.setTitulo(tarefaAtualizada.getTitulo());
        tarefa.setDescricao(tarefaAtualizada.getDescricao());
        tarefa.setStatus(tarefaAtualizada.getStatus());
        return tarefaRepository.save(tarefa);
    }

    public void excluir(String id) {
        tarefaRepository.deleteById(id);
    }
}