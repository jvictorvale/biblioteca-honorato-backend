# 📚 Biblioteca Honorato — Back-end API

API RESTful desenvolvida em **Java 21** e **Spring Boot 3** para gerenciamento da biblioteca pessoal e wishlist da **[@bibliotecahonorato](https://www.instagram.com/bibliotecahonorato/)**.

O projeto conta com arquitetura multi-visão (Pública, Amigos/Presentes e Administração), integração com a **Google Books API** para auto-completar metadados e capas, além de importador automatizado de planilhas Excel (`.xlsx`).

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java 21
- **Framework:** Spring Boot 3.3+
- **Segurança:** Spring Security + JWT
- **Persistência:** Spring Data JPA / Hibernate
- **Banco de Dados:** PostgreSQL 16
- **Database Migrations:** Flyway
- **Integração Externa:** Google Books API (via Spring `RestClient`)
- **Containers:** Docker & Docker Compose
- **Documentação:** OpenAPI 3 / Swagger UI

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
- **JDK 21** instalado
- **Docker** e **Docker Compose** instalados
- **Maven** (opcional, pode usar o `./mvnw` incluído)

### 1. Clonar o repositório
```bash
git clone [https://github.com/SEU_USUARIO/biblioteca-honorato-backend.git](https://github.com/SEU_USUARIO/biblioteca-honorato-backend.git)
cd biblioteca-honorato-backend
```

### 2. Subir o banco de dados PostgreSQL no Docker
```bash
docker compose up -d
```

### 3. Executar a aplicação Spring Boot
```bash
./mvnw spring-boot:run
```

A API estará disponível em `http://localhost:8080`.

---

## 📑 Documentação da API (Swagger)

Com a aplicação rodando, acesse:
`http://localhost:8080/swagger-ui.html`