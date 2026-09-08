package siga;

// Refatorado nome da classe FabricaPainel para CriadorPainel, seguindo a utilização
// de Factory Method
// Criação do criador abstrato que será implementada nos subcriadores
public abstract class CriadorPainel {

    // Defição do nome de método que será utilizado pelos subcriadores
    protected abstract Painel criarPainel();

    // Método processar que cria o painel se guiando pelo criador que for utiliado
    public void processar() {
        Painel painel = criarPainel();
        painel.montar();
    }
}
