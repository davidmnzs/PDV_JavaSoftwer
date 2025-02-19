# Nome do Projeto

Breve descrição do projeto, destacando seu objetivo e principais funcionalidades.

## Tecnologias Utilizadas

- Java 23  
- Maven para gerenciamento de dependências  
- MongoDB como banco de dados NoSQL  

## Instalação e Configuração

### Requisitos

Antes de iniciar, certifique-se de ter instalado:

- Java JDK 17+
- Apache Maven
- MongoDB

### Passos para Execução

```sh
git clone https://github.com/davidmnzs/PDV_JavaSoftwer
cd PDV_JavaSoftwer
```

#### Configure o banco de dados MongoDB:

- Certifique-se de que o MongoDB está rodando na porta padrão (27017) ou ajuste no `application.properties`/`application.yml`
- Se necessário, crie um banco de dados e coleções adequadas

```sh
mvn clean install
```

```sh
mvn spring-boot:run
```

## Configuração do MongoDB

Caso seja necessário configurar credenciais ou conexão personalizada, ajuste o arquivo `application.properties`:

```properties
spring.data.mongodb.uri=mongodb://usuario:senha@localhost:27017/nome-do-banco
```

Ou, se estiver usando `application.yml`:

```yaml
spring:
  data:
    mongodb:
      uri: mongodb://usuario:senha@localhost:27017/PDV
```

## Contribuição

1. Fork o repositório
2. Crie uma branch:
   ```sh
   git checkout -b feature-minha-feature
   ```
3. Commit suas alterações:
   ```sh
   git commit -m 'Adicionando nova funcionalidade'
   ```
4. Envie para o repositório:
   ```sh
   git push origin feature-minha-feature
   ```
5. Abra um Pull Request

## Licença

Este projeto está licenciado sob a **MIT License**.
