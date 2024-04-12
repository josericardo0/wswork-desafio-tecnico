# Desafio técnico da WS Work - API Restful para CRUD de carros, marcas e modelos.

Desafio proposto para a vaga de desenvolvedor backend na empresa WS Work. Basicamente se trata de uma API com Java e Spring Boot para operações de CRUD de carros, marcas e modelos.



## Requisitos técnicos do sistema

- **Primeiro requisito:** Criar uma aplicação Springboot, com
acesso a BD (spring-data) e que exponha endpoints Rest. A aplicação tem o seguinte modelo ER:

- ![image](https://github.com/josericardo0/wswork-desafio-tecnico/assets/92414548/7711ecf7-1d15-4b81-9d09-60f50de17e65)




- **Segundo requisito:** Crie um endpoint que entregue uma listagem, com o seguinte formato:

- ![image](https://github.com/josericardo0/wswork-desafio-tecnico/assets/92414548/0c1a4817-bd98-49a6-8056-e0fde3640f11)




- **Terceiro requisito:** O frontend poderá estar hospedado em outro domínio, não deixe de verificar a estratégia
de Cors.

- **Quarto requisito:** Crie endpoints para CRUD de carros, marcas e modelos.
## Como testar a aplicação:

- Faça o clone do repositório na sua máquina, em uma pasta de sua escolha, ou baixe o .zip, extraia e abre a pasta resultante da extração na sua IDE.
- Uma vez que estiver com o projeto aberto, abra o arquivo docker-compose, troque o caminho do "context" e do "dockerfile" pelos caminhos que esses arquivos têm na sua máquina.
- Execute "gradle build" no terminal (sem as aspas) para buildar.
- Execute o comando docker-compose up --build para buildar e subir o contêiner logo em seguida.
- Acessar a URL de cada endpoint para fins de teste (/carros, /marcas, /modelos).


- **Requisições para teste:**
- POST de Carros

```json
{
    "id": 1,
    "timestampCadastro": "2024-04-10T10:00:00",
    "modeloId": 1,
    "ano": 2023,
    "combustivel": "Gasolina",
    "numPortas": 4,
    "cor": "Preto"
}
```
- POST de Marcas

```json

{
    "id": 2,
    "nomeMarca": "Toyota"
}

```

- POST de Modelos

```json
{
    "id": 1,
    "nome": "Etios",
    "marcaId": 2,
    "valorFipe": 50000.00
}


```



  
## Especificações técnicas:

- **Versão do Java:** Java 17
- **Versão do Spring Boot:** 3.2.4
- **Gerenciador de dependências:** Gradle
- **Banco de dados:** PostgreSQL

## Explicações do projeto: 
- No desenvolvimento da API em Java, foram tomadas várias decisões e escolhas de código para garantir a funcionalidade, modularidade e manutenibilidade do sistema.

Padrão MVC (Model-View-Controller): A arquitetura da aplicação segue o padrão MVC, onde os modelos representam as entidades do domínio (como Carro, Marca e Modelo), os controladores são responsáveis por receber as requisições HTTP e orquestrar as operações apropriadas nos modelos, e as visualizações não foram discutidas, mas poderiam ser adicionadas para renderizar dados.

Injeção de Dependência (Dependency Injection): Utilizou-se a injeção de dependência por meio de anotações do Spring Framework para conectar os componentes da aplicação de forma mais flexível e desacoplada, facilitando a manutenção e teste das classes.

Uso de Repositórios: Foram criadas interfaces de repositório (CarroRepository, MarcaRepository e ModeloRepository) estendendo JpaRepository do Spring Data JPA para fornecer operações CRUD (Create, Read, Update, Delete) para as entidades do domínio.

Serviços de Negócio (Business Services): Criaram-se interfaces de serviço (CarroService, MarcaService e ModeloService) e suas implementações para encapsular a lógica de negócio relacionada a cada entidade do domínio. Esses serviços são responsáveis por orquestrar as operações no repositório correspondente e, se necessário, aplicar lógica adicional antes ou depois de chamar os métodos do repositório.

DTOs (Data Transfer Objects): Foram utilizados objetos DTO para transferir dados entre as camadas da aplicação e fornecer uma representação simplificada das entidades para a camada de visualização ou outros serviços consumidores. Isso ajuda a evitar a exposição de detalhes internos das entidades e a reduzir o acoplamento entre as camadas.

Utilização do ModelMapper: Para mapear os dados das entidades para DTOs e vice-versa, foi utilizada a biblioteca ModelMapper, que simplifica o processo de cópia de propriedades entre objetos.

Tratamento de Exceções: Foram adicionados blocos try-catch em pontos críticos do código para capturar exceções e lançar exceções personalizadas quando necessário, garantindo que erros sejam devidamente tratados e comunicados ao cliente da API.

Manipulação de Respostas HTTP: As respostas HTTP são manipuladas usando a classe ResponseEntity do Spring Framework para fornecer respostas adequadas ao cliente, incluindo códigos de status HTTP apropriados e corpos de resposta com dados ou mensagens de erro.

No geral, essas decisões e escolhas de código foram feitas com o objetivo de criar uma API robusta, flexível e fácil de manter, seguindo boas práticas de desenvolvimento e utilizando ferramentas e bibliotecas que facilitam o processo de desenvolvimento.
