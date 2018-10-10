package zad10_3;

import java.util.Objects;

public class Product {
    private String name, company;
    private double price;

    public Product(String name, String company, double price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name) &&
                Objects.equals(company, product.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, price);
    }

    @Override
    public String toString() {
        return String.format("Product: %s, producent: %s, cena: %.2f", name, company, price);
    }
}
