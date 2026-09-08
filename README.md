# SIGA — Atividade Factory: painéis por perfil

**Técnicas de Programação II (TP2) · Aula 5** — CST em Desenvolvimento de Software Multiplataforma · Fatec de Porto Ferreira

## Estrutura do projeto

```
siga-factory/
├── README.md
└── src/
    └── siga/
        ├── CriadorPainel.java     (Factory principal dos paineis)
        ├── CriadorPainelAluno.java     (Factory dos paineis de Aluno)
        ├── CriadorPainelCoordenador.java     (Factory Factory dos paineis de Coordenador)
        ├── CriadorPainelProfessor.java     (Factory Factory dos paineis de Professor)
        ├── Painel.java            (interface — o "Produto"; já pronta)
        ├── PainelAluno.java       (produto concreto; já pronto)
        ├── PainelProfessor.java   (produto concreto; já pronto)
        ├── PainelCoordenador.java (produto concreto; já pronto)
        ├── GerenciadorLogin.java  (Utilização de Factory Method chamando o método do criador recebido)
        └── Main.java              (demonstra o problema em execução)
```

## Como compilar e executar

Pré-requisito: JDK 17 ou superior (`java -version` para verificar).

```bash
# 1. Compilar (a saída vai para a pasta "bin")
javac -d bin src/siga/*.java

# 2. Executar
java -cp bin siga.Main
```
