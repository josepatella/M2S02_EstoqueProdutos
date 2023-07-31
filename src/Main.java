import Entities.Produtos;

public class Main {
    public static void main(String[] args) {
        Produtos novoProduto = new Produtos();
        novoProduto.quantidade = 50;
        novoProduto.quantidade = novoProduto.quantidade - 50;
    }
}