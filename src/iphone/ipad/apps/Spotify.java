package iphone.ipad.apps;

import iphone.ipad.ReprodutorMusical;

public class Spotify extends ReprodutorMusical {

    public Spotify(String nomeMusica, String artista) {
        super(nomeMusica, artista);
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música pelo Spotify.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada no Spotify.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada no Spotify.");
    }
}
