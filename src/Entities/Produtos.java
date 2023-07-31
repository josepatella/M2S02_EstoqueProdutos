package Entities;

public class Produtos {
    public String nome;
    public double preco;
    public int quantidade;

    @Override
    public String toString() {
        return "Nome: " + nome + ", Preço: R$" + preco + ", Quantidade: " + quantidade;
    }
}

