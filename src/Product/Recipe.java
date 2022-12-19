package Product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {


    private HashMap<String, Double> recipeCard = new HashMap<>();
    private double sumPriceProduct;
    private String title;

    public Recipe(String title) {
        this.title = title;
        this.sumPriceProduct = 0;
    }

    public void makeRecipeCard(Product product) {

        recipeCard.put(product.getTitle(), product.getQuantity());
        sumPriceProduct = sumPriceProduct + product.getPrice() * product.getQuantity();
    }


    public void printSet() {
        recipeCard.forEach(
                (key, value)
                        -> System.out.println(key + " - " + value + " кг."));

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
