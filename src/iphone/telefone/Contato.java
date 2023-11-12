package iphone.telefone;

import iphone.internet.Email;

public class Contato {
    private String nome;
    private String sobreNome;
    private Telefone telefone;
    private Email email;

    public Contato(String nome, String sobreNome, Telefone telefone, Email email) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.telefone = telefone;
        this.email = email;
    }

    public Contato(String nome, String sobreNome, Telefone telefone) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.telefone = telefone;
    }
    public void criarContato() {
        System.out.println("Contato criado.");
    }
}
