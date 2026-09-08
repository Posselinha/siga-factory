package siga;

public class GerenciadorLogin {

    // Chamando instancia da classe FabricaPainel para utilizazr o simple factory
    private final FabricaPainel fabrica = new FabricaPainel();

    public Painel montarPainel(String tipoUsuario) {

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
        Painel painel = fabrica.criar(tipoUsuario);

        painel.montar();
        return painel;
    }
}
