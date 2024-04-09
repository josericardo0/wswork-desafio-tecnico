# Desafio técnico da WS Work - API Restful para CRUD de carros, marcas e modelos.

Desafio proposto para a vaga de desenvolvedor backend na empresa WS Work. Basicamente se trata de uma API com Java e Spring Boot para operações de CRUD de carros, marcas e modelos.



## Requisitos técnicos do sistema

- **Primeiro requisito:** Criar uma aplicação Springboot, com
acesso a BD (spring-data) e que exponha endpoints Rest. A aplicação tem o seguinte modelo ER:
- ![image](https://github.com/josericardo0/wswork-api-cars/assets/92414548/bf84d552-2ac7-4b8e-815e-eecfdaf46f55)


- **Segundo requisito:** Crie um endpoint que entregue uma listagem, com o seguinte formato:
![image](https://github.com/josericardo0/wswork-api-cars/assets/92414548/f4cd82bf-7889-41a8-a042-5e05d901d39b)


- **Terceiro requisito:** O frontend poderá estar hospedado em outro domínio, não deixe de verificar a estratégia
de Cors.

- **Quarto requisito:** Crie endpoints para CRUD de carros, marcas e modelos.
## Como testar a aplicação:

- Faça o clone do repositório na sua máquina, em uma pasta de sua escolha, ou baixe o .zip, extraia e abre a pasta resultante da extração na sua IDE.
- Uma vez que estiver com o projeto aberto, execute "mvn clean install" no terminal (sem as aspas) para buildar.
- Execute o comando docker-compose up --build para buildar e subir o contêiner logo em seguida.
- Acessar a URL de cada endpoint para fins de teste (/carros, /marcas, /modelos).

  
## Especificações técnicas:

- **Versão do Java:** Java 17
- **Versão do Spring Boot:** 3.2.4
- **Gerenciador de dependências:** Gradle
- **Banco de dados:** PostgreSQL
