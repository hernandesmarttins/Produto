package com.company.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Entre com os dados do produto: ");
        System.out.print("nome: ");
        produto.nome = sc.nextLine();
        System.out.print("preco: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        produto.quantidade = sc.nextInt();

        System.out.println(produto.toString());

        System.out.println();
        System.out.println("Dados do produto: " + produto);

        System.out.print("Entre com a quantidade de produtos que voce deseja ADDicionar:");
        int quantidade  = sc.nextInt();
        produto.addProduto(quantidade);

        System.out.println();
        System.out.println("atualizar dados: " + produto);

        System.out.print("Entre com a quantidade de produtos que você deseja REMOVER:");
        quantidade = sc.nextInt();
        produto.removeProduto(quantidade);

        System.out.println();
        System.out.println("atualizar dados: " + produto);

        sc.close();
    }
}
