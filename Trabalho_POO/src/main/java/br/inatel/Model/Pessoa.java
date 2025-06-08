package br.inatel.Model;

public abstract class Pessoa {
    public String nome;
    public int cpf;

    public Pessoa(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract void exibirInfo();
}
