package siga;

public class GerenciadorLogin {

    public Painel montarPainel(String tipoUsuario) {
        Painel painel;

        // Notado de que o bloco condicional abaixo está causando um forte acoplamento
        // para o metodo montarPainel, fazendo com que cada novo tipo de usuário que for
        // registrado futuramente fique dependente da modificação do 
        // bloco condicional para se obter um painel proprio.
        if (tipoUsuario.equals("ALUNO")) {
            painel = new PainelAluno();
        } else if (tipoUsuario.equals("PROFESSOR")) {
            painel = new PainelProfessor();
        } else if (tipoUsuario.equals("COORDENADOR")) {
            painel = new PainelCoordenador();
        } else {
            throw new IllegalArgumentException("Perfil desconhecido: " + tipoUsuario);
        }

        painel.montar();
        return painel;
    }
}
