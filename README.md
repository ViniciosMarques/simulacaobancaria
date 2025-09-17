
# Sistema Bancário Simples - POO

Este projeto foi desenvolvido durante meu aprendizado em **Programação Orientada a Objetos (POO) em Java**, como parte do desafio **"Criar um Aplicativo de Controle de Transações Financeiras com POO"** do Bootcamp da Dio em parceria com a Riachuelo.

O objetivo foi aplicar na prática conceitos como **herança, encapsulamento, polimorfismo e abstração**, criando um sistema bancário funcional, simples e interativo.

---

## Estrutura do projeto

```text
simulacaobancaria/
│
├─ src/
│   ├─ Conta.java
│   ├─ ContaCorrente.java
│   ├─ ContaPoupanca.java
│   ├─ TipoTransacao.java
│   ├─ Transacao.java
│   ├─ RepositorioContas.java
│   ├─ Menu.java
│   └─ Main.java
│
├─ .gitignore
└─ README.md
```

---

## Funcionalidades

O sistema permite simular operações bancárias básicas, com um menu fácil de usar:

* Criar **contas correntes** e **contas poupança**;
* Realizar **depósitos** e **saques**, com validação de saldo e limite;
* Consultar **extrato detalhado**, mostrando o histórico completo de transações;
* Registro automático de cada transação, garantindo rastreabilidade.

---

## Como usar

### 1️⃣ Abrir o projeto

Baixe ou clone o repositório, abra o terminal ou prompt de comando, e vá até a pasta do projeto.

### 2️⃣ Entrar na pasta `src`

```bash
cd src
```

### 3️⃣ Compilar os arquivos Java

```bash
javac *.java
```

### 4️⃣ Executar o sistema

```bash
java Main
```

O menu interativo aparecerá:

```
=== SISTEMA BANCÁRIO ===
1 - Criar Conta Corrente
2 - Criar Conta Poupança
3 - Depositar
4 - Sacar
5 - Extrato
0 - Sair
Opção:
```

### 5️⃣ Criar contas e realizar transações

Você poderá criar contas, depositar, sacar e consultar o extrato.

**Exemplo de extrato:**

```
📄 Extrato da conta 1234 - Titular: Vinicios Marques
17/09/2025 14:05:12 - Depósito: R$ 1000.0
17/09/2025 14:10:45 - Saque CC: R$ -200.0
Saldo atual: R$ 800.0
```

---

## Diferenciais do projeto

* Código limpo, organizado e fácil de entender;
* Registro automático de todas as transações;
* Uso de **POO em Java** de forma prática;
* Estrutura pensada para aprendizado e expansão futura.

---

## Capturas de tela (simuladas)

**Menu principal:**

```
=== SISTEMA BANCÁRIO ===
1 - Criar Conta Corrente
2 - Criar Conta Poupança
3 - Depositar
4 - Sacar
5 - Extrato
0 - Sair
Opção: _
```

**Extrato de conta:**

```
📄 Extrato da conta 5678 - Titular: João Silva
17/09/2025 14:05:12 - Depósito: R$ 1500.0
17/09/2025 14:12:30 - Saque CC: R$ -300.0
Saldo atual: R$ 1200.0
```

> Observação: os horários e valores aparecem de forma automática conforme você realiza as operações.

---

## Sobre o projeto

Este projeto representa meu estudo prático em Java e POO, consolidando conceitos aprendidos no Bootcamp da Dio. É um exemplo real de como aplicar herança, abstração e polimorfismo em um sistema simples, mas completo e funcional.

É também um projeto base para quem deseja expandir e adicionar novas funcionalidades, como transferências entre contas ou integração com banco de dados.

---

## Autor

**Vinicios Marques**



Quer que eu faça isso?
