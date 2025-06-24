# Projeto Login

Projeto backend em Java com Spring Boot para gerenciamento simples de usuários e autenticação.

## Tecnologias usadas

- Java 17+
- Spring Boot 3.x
- Hibernate / JPA
- MySQL / MariaDB
- Maven
- Jakarta Validation

## Funcionalidades

- Página de login: GET `/login`
- Página de cadastro de usuário: GET `/cadastroUsuario`
- Cadastro de usuário: POST `/cadastroUsuario` (com validação)
- Autenticação de usuário: POST `/login` (retorna texto simples "sucesso" ou "erro")

## Como rodar

1. Configure o banco de dados MySQL/MariaDB e crie o banco chamado `login` (ou ajuste o application.properties).
2. Configure as credenciais no arquivo `src/main/resources/application.properties`.
3. Execute o projeto:

VIDEO UTILIZADO

6. JAVA com SPRING BOOT do ZERO | LOGIN E CADASTRO [GUIA PRÁTICO]
Tácio | Dev para Iniciantes
https://www.youtube.com/watch?v=BhQBW_fGcX0


FEITO POR

👨‍💻 Saylon 



```bash
mvn spring-boot:run
Ou execute a classe principal:

bash
Copiar
Editar
br.appLogin.logi.LogiApplication
Endpoints principais
Método	URL	Descrição
GET	/login	Exibe página de login
GET	/cadastroUsuario	Exibe página de cadastro
POST	/cadastroUsuario	Registra novo usuário
POST	/login	Autentica usuário (retorna texto simples)

Observações
A autenticação atual retorna "sucesso" ou "erro" em texto simples.

Validações são feitas no cadastro via Jakarta Validation.

As páginas login.html e cadastro.html devem estar na pasta src/main/resources/static.

Contribuições
Sinta-se à vontade para abrir issues e pull requests!

Licença
MIT License




