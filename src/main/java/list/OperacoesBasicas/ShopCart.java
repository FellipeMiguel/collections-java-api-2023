package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ShopCart {
    private List<Item> shopList;

    public ShopCart() {
        this.shopList = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity){
        Item item = new Item(name, price, quantity);
        this.shopList.add(item);
    }
    public void removeItem(String name){
        List<Item> itemsToRemove = new ArrayList<>();
        if (!shopList.isEmpty()){
            for (Item item : shopList) {
                if (item.getName().equalsIgnoreCase(name)) {
                    itemsToRemove.add(item);
                }
            }
            shopList.removeAll(itemsToRemove);
        } else {
            System.out.println("A lista está vazia");
        }
    }
    public double totalValue(){
        double total = 0d;
        if (!shopList.isEmpty()){
            for (Item item: shopList) {
                double totalValue = item.getPrice() * item.getQuantity();
                total += totalValue;
            }
            return total;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }
    public void showItems(){
        if (!shopList.isEmpty()) {
            System.out.println(this.shopList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "ShopCart{" +
                "shopList=" + shopList +
                '}';
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        ShopCart carrinhoDeCompras = new ShopCart();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.addItem("Lápis", 2d, 3);
        carrinhoDeCompras.addItem("Lápis", 2d, 3);
        carrinhoDeCompras.addItem("Caderno", 35d, 1);
        carrinhoDeCompras.addItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.showItems();

        // Removendo um item do carrinho
        carrinhoDeCompras.removeItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.showItems();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.totalValue());
    }
}
