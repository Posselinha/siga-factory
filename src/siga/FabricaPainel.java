package siga;

// Criação da classe FabricaPainel, que funciona como um Simple Factory
// tendo o método criar que retorna um Painel e recebe e possui a assinatura 
// de parametro String tipo
// Em vez de usar o bloco condicional if/else, utiliza um switch case
// para verificar qual o tipo de usuário passado e procurar se ele existe
// e caso existir, retornar sua respectiva instância.
public class FabricaPainel {

    public Painel criar(String tipo) {
        switch (tipo) {
            case "ALUNO":
                return new PainelAluno();
            case "PROFESSOR":
                return new PainelProfessor();
            case "COORDENADOR":
                return new PainelCoordenador();
            default:
                throw new IllegalArgumentException("Perfil desconhecido: " + tipo);
        }
    }
}
