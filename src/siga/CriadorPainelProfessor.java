package siga;

// Método de subfactory que implementa a factory principal
public class CriadorPainelProfessor extends CriadorPainel {

    // sobreescrita do método criarPainel para utilizar retornar a instancia
    // do painel referente ao tipo de usuário
    @Override
    protected Painel criarPainel() {
        return new PainelProfessor();
    }
}
