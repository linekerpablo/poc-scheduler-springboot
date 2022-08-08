# POC Schedule with springboot

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Para realizar agendamento de tarefas foi utilizado springboot, scheduler, cron, h2 e shedlock spring.

- Quando temos ambientes distribuídos precisamos gerenciar as tarefas para que uma mesma tarefa não execute duas vezes ao mesmo tempo e gere algum tipo de duplicidade. Por isso foi utilizado o shedlock spring juntamente com H2 para travar as execuções.

## Features

- Executar agendamento de atividades utilizando CRON para rodar em fragmentos de tempos.


## Installation

Utilizar o comando abaixo para instalar as dependências do projeto:

```sh
mvn clean install
```

## Plugins

Plugins utilizados:

| Plugin | README |
| ------ | ------ |
| Shedlock Spring | [https://mvnrepository.com/artifact/net.javacrumbs.shedlock/shedlock-spring][PlDb] |
| H2 | [https://mvnrepository.com/artifact/com.h2database/h2][PlGh]