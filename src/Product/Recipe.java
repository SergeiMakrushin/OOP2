package Product;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private Set<Product> foodstuffs = new HashSet<Product>();
    private double sumPriceProduct;
    private String title;

    public Recipe(String title) {
        this.title = title;
        this.sumPriceProduct = 0;
    }


    public void makeRecipe(Product product) {
        if (foodstuffs.contains(product)) {
            throw new RuntimeException("Такой продукт уже есть");
        }
        foodstuffs.add(product);
        sumPriceProduct = sumPriceProduct + product.getPrice() * product.getQuantity();
    }


    public void printSet() {
        for (Product product :foodstuffs
             ) {
            System.out.println(product);

        }

    }



    public Set<Product> getFoodstuffs() {
        return foodstuffs;
    }

    public double getSumPriceProduct() {
        return sumPriceProduct;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Double.compare(recipe.sumPriceProduct, sumPriceProduct) == 0 && title.equals(recipe.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sumPriceProduct, title);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "sumPriceProduct=" + sumPriceProduct +
                ", title='" + title + '\'' +
                '}';
    }
}
