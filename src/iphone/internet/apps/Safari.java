package iphone.internet.apps;

import iphone.internet.Navegador;

public class Safari extends Navegador {


    public Safari(String url) {
        super(url);
    }

    @Override
    public void exibirPagina() {
        validarConecaoInternet();
        System.out.println("Exibindo pagina no Safari.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no Safari.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada no Safari.");
    }
}
