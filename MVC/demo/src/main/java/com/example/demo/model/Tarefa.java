package com.example.demo.model;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@Document(collection = "tarefas") // Para MongoDB
public class Tarefa {
    @Id
    private String id;

    @NotNull
    @Size(min = 3, max = 100)
    private String titulo;

    @Size(max = 500)
    private String descricao;

    @NotNull
    private String status; // Exemplo: "Em andamento", "Concluído"

    private LocalDateTime dataCriacao;
}
