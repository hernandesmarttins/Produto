package com.company.aplication;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public Produto() {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    /* public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

     */

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double quantidadeEmEstoque(){
        return preco * quantidade;
    }

    public void addProduto(int quantidade){
        this.quantidade += quantidade;
    }
    public void removeProduto(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return "nome: "
                +nome
                + ", valor: $ "
                + String.format("%.2f",preco)
                + ", "
                + quantidade
                + " unidades,"
                + "total em estoque: $" + String.format("%.2f",quantidadeEmEstoque());
    }

}
