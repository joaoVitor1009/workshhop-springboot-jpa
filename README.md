# ðŸŒ± Workshop Spring Boot & JPA / Hibernate

<p align="center">
  API RESTful desenvolvida com <strong>Spring Boot</strong> e <strong>Spring Data JPA</strong> para gerenciamento de pedidos, produtos, usuÃ¡rios e categorias.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white" />
  <img src="https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white" />
</p>

---

## ðŸ› ï¸ Tecnologias & Arquitetura

- **Camada de Recursos (Controllers):** Endpoints RESTful
- **Camada de ServiÃ§os (Services):** Regras de negÃ³cio e validaÃ§Ãµes
- **Camada de Acesso a Dados (Repositories):** Spring Data JPA
- **Tratamento de ExceÃ§Ãµes Global:** `@ControllerAdvice` e `StandardError`
- **Banco em MemÃ³ria (H2) & PostgreSQL**

---

## ðŸš€ Como Executar

### PrÃ©-requisitos
- [JDK 17+](https://www.oracle.com/java/technologies/downloads/)
- [Maven](https://maven.apache.org/) (ou utilize o wrapper `./mvnw`)

```bash
# Clonar o repositÃ³rio
git clone https://github.com/joaoVitor1009/workshhop-springboot-jpa.git
cd workshhop-springboot-jpa

# Executar a aplicaÃ§Ã£o
./mvnw spring-boot:run
```
A API estarÃ¡ acessÃ­vel em `http://localhost:8080`.

---

## ðŸ‘¨â€ðŸ’» Autor

Desenvolvido por **JoÃ£o Vitor** â€” [@joaoVitor1009](https://github.com/joaoVitor1009)