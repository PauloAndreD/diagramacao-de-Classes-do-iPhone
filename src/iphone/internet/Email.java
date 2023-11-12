package iphone.internet;

public class Email {
    private String enderecoEletronico;

    public Email(String enderecoEletronico) {
        this.enderecoEletronico = enderecoEletronico;
    }
    public void enviarEmail() {
        System.out.println("O Email foi enviado");
    }
    public void excluirEmail() {
        System.out.println("O Email foi excluído.");
    }
}
