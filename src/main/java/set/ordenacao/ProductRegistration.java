package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegistration {
    //atributos
    Set<Product> products;

    public ProductRegistration() {
        this.products = new HashSet<>();
    }

    public void addProducts(long code, String name, double price, int quantity) {
        products.add(new Product(code, name, price, quantity));
    }

    public Set<Product> showProductsByName() {
        Set<Product> productByName = new TreeSet<>(products);
        return productByName;

    }

    public Set<Product> showProductsByPrice() {
        Set<Product> productByPrice = new TreeSet<>(new ComparatorByPrice());
        products.addAll(products);
        return productByPrice;
    }

    public static void main(String[] args) {
        ProductRegistration productRegistration = new ProductRegistration();

        productRegistration.addProducts(1L, "Produto 5", 15d, 5);
        productRegistration.addProducts(2L, "Produto 0", 20d, 10);
        productRegistration.addProducts(1L, "Produto 5", 10d, 2);
        productRegistration.addProducts(9L, "Produto 9", 2d, 2);

        System.out.println(productRegistration.products);

        System.out.println(productRegistration.showProductsByName());
        System.out.println(productRegistration.showProductsByPrice());
    }
}
