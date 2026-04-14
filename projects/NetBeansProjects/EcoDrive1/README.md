# 🚛 EcoDrive 1.0

Projeto desenvolvido para praticar conceitos de **Programação Orientada a Objetos (POO)** em Java, com foco em associação entre objetos e uso de coleções.

## 📖 Descrição

O sistema simula um cenário simples de gestão de veículos e motoristas, permitindo:

- Associar um motorista a um veículo
- Registrar viagens realizadas
- Controlar o consumo de combustível
- Gerar relatórios de viagens

O projeto evolui conceitos básicos de POO para uma modelagem mais próxima do mundo real.

## 🧠 Conceitos de POO aplicados

- Associação entre objetos (Motorista ↔ Veículo)
- Associação bidirecional
- Encapsulamento
- Uso de construtores
- Sobrescrita de método (`toString`)
- Regras de negócio dentro das classes
- Uso de coleções (`ArrayList`)

## 🔗 Estrutura do sistema

O sistema é composto pelas seguintes classes:

### 🚗 Veiculo
Responsável por representar um veículo.

Funcionalidades:
- Armazenar dados como modelo, placa e combustível
- Associar um motorista
- Registrar viagens
- Controlar consumo de combustível
- Gerar relatório de viagens

---

### 👨‍✈️ Motorista
Representa o motorista do veículo.

Funcionalidades:
- Armazenar nome, CNH e categoria
- Manter referência ao veículo (associação bidirecional)
- Validação de categoria (apenas categoria 'D' pode dirigir certos veículos)

---

### 🗺️ Viagem
Representa uma viagem realizada pelo veículo.

Atributos:
- Data (`LocalDate`)
- Distância percorrida

---

### 🧪 Classe principal (EcoDrive1)
Responsável por executar o sistema e testar as funcionalidades.

## ⚙️ Regras de negócio implementadas

- Um veículo não pode realizar viagens sem motorista
- Apenas motoristas com categoria **'D'** podem ser associados ao veículo
- O combustível é consumido com base na distância da viagem
- O veículo mantém um histórico de viagens
- Associação bidirecional entre motorista e veículo é mantida automaticamente

## 📊 Funcionalidades implementadas

- Registro de múltiplas viagens (`ArrayList`)
- Cálculo de distância total percorrida
- Geração de relatório detalhado de viagens
- Controle de abastecimento com limite máximo

## ▶️ Como executar

1. Clone o repositório
2. Abra o projeto em uma IDE Java (Eclipse, IntelliJ ou VS Code)
3. Execute a classe `EcoDrive1`

## 🚧 Observações

Este projeto tem fins educacionais e foi desenvolvido como parte do aprendizado em POO.  
A implementação foca na clareza dos conceitos, e não em otimizações ou arquitetura avançada.

---
