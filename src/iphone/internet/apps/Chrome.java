package iphone.internet.apps;

import iphone.internet.Navegador;

public class Chrome extends Navegador {
    public Chrome(String url) {
        super(url);
    }
    @Override
    public void exibirPagina() {
        validarConecaoInternet();
        System.out.println("Exibindo página web no Chrome.");
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no Chrome.");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Págna atalizada no Chrome.");
    }
}
