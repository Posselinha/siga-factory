package siga;

public class GerenciadorLogin {

    // Alterado a assinatura para utilizar o criador em vez da string
    public Painel montarPainel(CriadorPainel criador) {

        // Notado de que o bloco condicional abaixo está causando um forte acoplamento
        // para o metodo montarPainel, fazendo com que cada novo tipo de usuário que for
        // registrado futuramente fique dependente da modificação do 
        // bloco condicional para se obter um painel proprio.
        // Mantido o código morto á pedido do professor no intuito de comparação]
        // Painel painel;
        // if (tipoUsuario.equals("ALUNO")) {
        //     painel = new PainelAluno();
        // } else if (tipoUsuario.equals("PROFESSOR")) {
        //     painel = new PainelProfessor();
        // } else if (tipoUsuario.equals("COORDENADOR")) {
        //     painel = new PainelCoordenador();
        // } else {
        //     throw new IllegalArgumentException("Perfil desconhecido: " + tipoUsuario);
        // }
        // Utilizando o metodo criar da fabrica para retornar o objeto do devido painel que será
        // delegado ao usuário
        // Chamando o metodo criarPainel do criador recebido
        Painel painel = criador.criarPainel();
        painel.montar();

        return painel;
    }
}
