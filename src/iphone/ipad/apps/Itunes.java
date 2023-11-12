package iphone.ipad.apps;

import iphone.ipad.ReprodutorMusical;

public class Itunes extends ReprodutorMusical {

    public Itunes(String nomeMusica, String artista) {
        super(nomeMusica, artista);
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música pelo Itunes.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada no Itunes.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada no Itunes.");
    }
}
