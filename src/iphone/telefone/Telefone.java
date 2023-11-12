package iphone.telefone;

public class Telefone {
    private String numero;
    public Telefone(String numero) {
        this.numero = numero;
    }
    public void ligar() {
        System.out.println("Ligando.");
    }
    public void atender() {
        System.out.println("Atendendo Ligação");
    }
    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado.");
    }
}
