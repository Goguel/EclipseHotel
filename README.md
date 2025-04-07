# 🌙 Eclipse Hotel API

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Postgresql](https://img.shields.io/badge/postgres-%23316192.svg?&style=for-the-badge&logo=postgresql&logoColor=white) ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)


API RESTful desenvolvida em **Java com Spring Boot**, focada no gerenciamento de um hotel fictício chamado **Eclipse Hotel**.  
Ela oferece operações CRUD para as entidades: **Clientes**, **Quartos** e **Reservas**.

> ⚙️ Ideal para estudos, experimentação com Spring, e projetos base de arquitetura RESTful.

---

## ✨ Funcionalidades

✔️ Cadastro, edição, listagem e remoção de **clientes**  
✔️ Gerenciamento completo de **quartos**  
✔️ Controle de **reservas**, com vínculo entre clientes e quartos  
✔️ Integração com banco de dados **PostgreSQL**  
✔️ Conversão entre entidades e DTOs com **ModelMapper**  
✔️ API documentada com **Swagger/OpenAPI**

---

## 🚀 Tecnologias Utilizadas

- 🧠 **Java 17+**
- 🌱 **Spring Boot 3.x**
- 🧰 **Spring Data JPA**
- 🐘 **PostgreSQL**
- 📦 **Maven**
- 🛠️ **ModelMapper**
- 🧾 **Swagger UI / OpenAPI**
- ✍️ **Lombok**
- 🐍 **Hibernate**

---

## 📘 Documentação da API

A API está totalmente documentada com Swagger. Após subir o projeto, acesse:

🔗 [`http://localhost:8080/swagger-ui.html`](http://localhost:8080/swagger-ui.html)

### 🛣️ Endpoints Principais

| Entidade    | Rota Base           | Operações Disponíveis    |
|-------------|---------------------|--------------------------|
| Clientes    | `/api/customers`    | `GET`, `POST`, `PUT`, `DELETE` |
| Quartos     | `/api/rooms`        | `GET`, `POST`, `PUT`, `DELETE` |
| Reservas    | `/api/reservations` | `GET`, `POST`, `PUT`, `DELETE` |

---

## 👤 Autor

Desenvolvido por **[Seu Nome Aqui]**  
📬 GitHub: [https://github.com/seu-usuario](https://github.com/seu-usuario)

---

> ⭐ Se você curtiu este projeto, deixe uma estrela no repositório!

