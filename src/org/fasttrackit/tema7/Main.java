package org.fasttrackit.tema7;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Marius", 27, true);
        Person person2 = new Person("Maria", 52, true);
        Person person3 = new Person("Carmen", 21, false);
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        Product product1 = new Product("Sana", 8, 20, "Lactate");
        Product product2 = new Product("Laptop", 5000, 0, "Electronice");
        Product product3 = new Product("Chefir", 7, 10, "Lactate");

        System.out.println(product1.getName() + " " + product1.getPrice() + " " + product1.getQuantity() + " " + product1.getCategory());
        System.out.println(product2.getName() + " " + product2.getPrice() + " " + product2.getQuantity() + " " + product2.getCategory());
        System.out.println(product3.getName() + " " + product3.getPrice() + " " + product3.getQuantity() + " " + product3.getCategory());
        // System.out.println(product1.isCategory("Electronice"));
        // System.out.println(product2.isCategory("Electonice"));
        // System.out.println(product3.isCategory("Lactate"));
        System.out.println(product1.hasStock());
        System.out.println(product2.hasStock());
        System.out.println(product3.hasStock());
    }
}
