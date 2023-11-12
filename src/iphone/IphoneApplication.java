package iphone;

import iphone.internet.Email;
import iphone.internet.Navegador;
import iphone.internet.apps.Chrome;
import iphone.internet.apps.Instagram;
import iphone.internet.apps.Safari;
import iphone.ipad.ReprodutorMusical;
import iphone.ipad.apps.Itunes;
import iphone.ipad.apps.Spotify;
import iphone.telefone.Contato;
import iphone.telefone.Telefone;

public class IphoneApplication {
    public static void main(String[] args) {

        Navegador navegador = null;
        String navegadorEscolhido = "Safari";

        if (navegadorEscolhido.equalsIgnoreCase("Safari")) {
            navegador = new Safari("https://https://www.google.com");
        } else if (navegadorEscolhido.equalsIgnoreCase("Chrome")) {
            navegador = new Chrome("https://https://www.google.com");
        } else {
            System.out.println("Navegador não encontrado");
        }
        if (navegador != null) {
            navegador.exibirPagina();
            navegador.adicionarNovaAba();
            navegador.atualizarPagina();
        }

        Email email = new Email("qualqueremail@email.com");
        email.enviarEmail();
        email.excluirEmail();

        ReprodutorMusical reprodutorMusical = null;
        String reprodutorMusicalEscolhido = "Spotify";

        if (reprodutorMusicalEscolhido.equalsIgnoreCase("Spotify")) {
            reprodutorMusical = new Spotify("Save Your Tears", "The Weeknd");
        } else if(reprodutorMusicalEscolhido.equalsIgnoreCase("itunes")) {
            reprodutorMusical = new Itunes("My Girl", "Vintage Culture & Fancy");
        } else {
            System.out.println("Reprodutor musical não encontrado.");
        }
        if (reprodutorMusical != null) {
            reprodutorMusical.tocarMusica();
            reprodutorMusical.pausarMusica();
            reprodutorMusical.selecionarMusica();
        }
        Telefone telefone = new Telefone("12345678");
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioDeVoz();

        Contato contato = new Contato("Maria", "Silva", telefone, email);
        contato.criarContato();

        Instagram instagram = new Instagram("Maria", "senha12345");
        instagram.tirarFoto();
        instagram.gravarVideo();
    }
}
