# 🌱 Workshop Spring Boot & JPA / Hibernate

<p align="center">
  API RESTful desenvolvida com <strong>Spring Boot</strong> e <strong>Spring Data JPA</strong> para gerenciamento de pedidos, produtos, usuários e categorias.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring Data JPA" />
  <img src="https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white" alt="Hibernate" />
</p>

---

## 🛠️ Tecnologias e Arquitetura

- **Camada de Recursos (Controllers):** disponibilização dos endpoints RESTful.
- **Camada de Serviços (Services):** implementação das regras de negócio e validações.
- **Camada de Acesso a Dados (Repositories):** persistência e consultas utilizando Spring Data JPA.
- **Tratamento Global de Exceções:** utilização de `@ControllerAdvice` e `StandardError` para padronização das respostas de erro.
- **Bancos de Dados:** H2 em memória para desenvolvimento e testes, com suporte ao PostgreSQL.

---

## 🚀 Como Executar

### Pré-requisitos

- [JDK 17 ou superior](https://www.oracle.com/java/technologies/downloads/).
- [Maven](https://maven.apache.org/) instalado ou utilização do Maven Wrapper incluído no projeto.
- Git instalado para clonar o repositório.

### Passos

**1. Clone o repositório**

```bash
git clone https://github.com/joaoVitor1009/workshhop-springboot-jpa.git
cd workshhop-springboot-jpa
```

**2. Execute a aplicação**

No Linux ou macOS:

```bash
./mvnw spring-boot:run
```

No Windows, utilizando o Prompt de Comando ou PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

A API estará disponível em:

`http://localhost:8080`

---

## 👨‍💻 Autor

Desenvolvido por **João Vitor**.

- GitHub: [@joaoVitor1009](https://github.com/joaoVitor1009)
- Repositório: [Workshop Spring Boot & JPA / Hibernate](https://github.com/joaoVitor1009/workshhop-springboot-jpa)
