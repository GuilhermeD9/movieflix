# MovieFlix

O **MovieFlix** é uma aplicação Java para cadastro de filmes, que oferece autenticação robusta utilizando Spring Security e JWT.
A aplicação gerencia dados de filmes com persistência em banco de dados SQL, utilizando Flyway para versionamento de schemas e Docker para containerização, garantindo um ambiente consistente e portátil.

## 🚀 Começando

Estas instruções ajudarão você a obter uma cópia do projeto em funcionamento na sua máquina local para desenvolvimento e testes.

Consulte **[Implantação](#-implantação)** para saber como implantar o projeto.

### 📋 Pré-requisitos

Antes de iniciar, certifique-se de ter as seguintes ferramentas instaladas:

- Java Development Kit (JDK) 21 ou superior
- Maven
- Docker


### 🔧 Instalação

Siga os passos abaixo para configurar o ambiente de desenvolvimento:

1. Clone o repositório:

```bash
git clone https://github.com/GuilhermeD9/movieflix.git
```

2. Acesse o diretório do projeto:

```bash
cd movieflix
```

3. Construa o projeto com o Maven:

```bash
mvn clean install
```

4. Inicie os containers Docker:

```bash
docker-compose up
```

Após esses passos, a aplicação estará disponível para uso e testes.

## 📦 Implantação

Para implantar a aplicação em um ambiente de produção, siga os passos:

1. Certifique-se de que todas as dependências estejam atualizadas e que os testes passem sem erros.

2. Construa a imagem Docker para produção:

```bash
docker build -t movieflix:latest .
```

3. Inicie o container em modo detach:

```bash
docker run -d -p 8080:8080 movieflix:latest
```

A aplicação estará disponível na porta 8080 do seu servidor.

## 🛠️ Construído com

As principais ferramentas e frameworks utilizados no projeto são:

* [Spring Boot](https://spring.io/projects/spring-boot) - Framework principal para construção da aplicação
* [Spring Security](https://spring.io/projects/spring-security) - Implementação de autenticação e autorização
* [JSON Web Token (JWT)](https://jwt.io/) - Gerenciamento de tokens de autenticação
* [Flyway](https://flywaydb.org/) - Versionamento de banco de dados
* [Docker](https://www.docker.com/) - Containerização da aplicação

## 📌 Versão

As versões disponíveis estão listadas nas [tags deste repositório](https://github.com/GuilhermeD9/movieflix/tags).

## ✒️ Autores

Mencionamos abaixo os principais contribuidores para o projeto:

* **Guilherme Silva** - *Desenvolvedor Principal* - [GuilhermeD9](https://github.com/GuilhermeD9)
* **Renan Lessa** - *Tutor do projeto* - [renanlessa](https://github.com/renanlessa)

## 📄 Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE.md](https://github.com/GuilhermeD9/movieflix/blob/main/LICENSE.md) para detalhes.

## 🎁 Expressões de gratidão

* Agradecemos a todos que contribuíram para o desenvolvimento deste projeto.
* Se você gostou do MovieFlix, compartilhe com seus amigos e colegas! 📢
