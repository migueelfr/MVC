
## 📌 **Persistência de Dados com Spring Boot (MariaDB, H2 e MongoDB)**  

## ⚠️ **Aviso Importante**
**📁 Este repositório corresponde à aplicação com persistência em MariaDB e MongoDB.**
**Se você está procurando a versão com persistência em MongoDB, acesse a pasta: MVC/demo**
**Se você está procurando a versão com persistência em MongoDB, acesse a pasta: Persistencia de Dados**

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7-green?style=flat&logo=spring)  
![Java](https://img.shields.io/badge/Java-21-orange?style=flat&logo=java)  
![MariaDB](https://img.shields.io/badge/MariaDB-10-blue?style=flat&logo=mariadb)  
![MongoDB](https://img.shields.io/badge/MongoDB-6.0-green?style=flat&logo=mongodb)  

Este projeto é uma aplicação web no modelo **MVC** utilizando **Spring Boot**, com **persistência de dados** em **MariaDB, H2 e MongoDB.**.

---

## 📂 **Estrutura do Projeto**
O projeto segue uma arquitetura em camadas para facilitar a organização e manutenção do código:

```
📁 src/main/java/com/exemplo/tarefas
├── 📂 controller  # Controladores (endpoints da API)
├── 📂 model       # Entidades (Tarefa, etc.)
├── 📂 repository  # Interfaces para acessar os bancos (MariaDB e MongoDB)
│   ├── jpa       # Repositório JPA (MariaDB/H2)
│   ├── mongo     # Repositório MongoDB
├── 📂 service     # Regras de negócio
└── 📂 config      # Configurações gerais
```

---

## 🛠 **Tecnologias Utilizadas**
- **Java 17**
- **Spring Boot**
  - Spring Web (para criar API REST)
  - Spring Data JPA (para MariaDB e H2)
  - Spring Data MongoDB (para MongoDB)
  - Lombok (reduzir boilerplate no código)
  - Validation (validação de dados)
- **Banco de Dados**
  - **MariaDB** (produção)
  - **H2** (para testes)
  - **MongoDB** (não relacional)
- **Ferramentas**
  - **VS Code** (IDE)
  - **HeidiSQL** (gerenciamento do MariaDB)




![image](https://github.com/user-attachments/assets/e43d012a-1579-4809-968c-bad6e37d51e6)
![image](https://github.com/user-attachments/assets/c2f08ab2-0131-4ecc-8bb6-bb6be2cb6ed4)
