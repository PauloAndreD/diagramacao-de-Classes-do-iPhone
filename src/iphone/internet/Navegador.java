package iphone.internet;

public abstract class Navegador {
    private String url;

    public Navegador(String url) {
        this.url = url;
    }
    public abstract void exibirPagina();
    public abstract void adicionarNovaAba();
    public abstract void atualizarPagina();
    public void validarConecaoInternet() {
        System.out.println("Validando se está conectado com a internet");
    }
}
