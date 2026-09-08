package siga;

public class PainelSecretaria implements Painel {

    @Override
    public void montar() {
        System.out.println("=== Painel da Secretaria ===");
        System.out.println("- Modificar contas");
        System.out.println("- Emitir documentos");
        System.out.println("- Presenças gerais");
    }
}
