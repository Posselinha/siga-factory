package siga;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== SIGA - Atividade Factory ===\n");

        GerenciadorLogin login = new GerenciadorLogin();

        // utilização dos criadores para montagem do painel
        login.montarPainel(new CriadorPainelAluno());
        System.out.println();
        login.montarPainel(new CriadorPainelProfessor());
        System.out.println();
        login.montarPainel(new CriadorPainelCoordenador());
        System.out.println();
        login.montarPainel(new CriadorPainelSecretaria());
    }
}
