# SIGA — Atividade Factory: painéis por perfil

**Técnicas de Programação II (TP2) · Aula 5** — CST em Desenvolvimento de Software Multiplataforma · Fatec de Porto Ferreira

## Estrutura do projeto

```
siga-factory/
├── README.md
└── src/
    └── siga/
        ├── FabricaPainel.java     (Simple Factory dos paineis)
        ├── Painel.java            (interface — o "Produto"; já pronta)
        ├── PainelAluno.java       (produto concreto; já pronto)
        ├── PainelProfessor.java   (produto concreto; já pronto)
        ├── PainelCoordenador.java (produto concreto; já pronto)
        ├── GerenciadorLogin.java  (Removido if/else para utilizar o simple factory)
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
