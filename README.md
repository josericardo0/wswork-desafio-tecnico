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
