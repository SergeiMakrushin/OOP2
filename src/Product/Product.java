package Product;

import java.util.LinkedList;
import java.util.Objects;

public class Product {


    private String title;
    private Double price;
    private Double quantity;


    public static LinkedList<Product> products=new LinkedList<Product>();

    public static LinkedList<Product> getProducts() {
        return products;
    }

    public static void addProduct(Product product) {
        if (products.contains(product)) {
            throw new RuntimeException("товар уже есть в списке");
        } else {
            products.add(product);
        }

    }

    public static void productQuantity(Product product) {
        product.products.remove(product);
    }



    public Product(String title, Double price, Double quantity) {
        setTitle(title);
        setPrice(price);
        setQuantity(quantity);
        products = new LinkedList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty() || title.isBlank()) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.title = title;
        }

    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price == 0) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.price = price;
        }

    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        if (quantity == 0||quantity==null) {
            this.quantity=1.0;
        } else {
            this.quantity = quantity;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && quantity == product.quantity && title.equals(product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, quantity);
    }

    @Override
    public String toString() {

        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }


}
