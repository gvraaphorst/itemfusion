package gvr.itemfusion;


import java.util.HashSet;
/**
 * Constructor for unit test purposes
 */


public class Fusion {
    HashSet<Item> ingredients = new HashSet<Item>(2);


    /**
     * Constructor takes two ingredient Items and one result <code>Item</code>
     */

    public Fusion(Item ingredient1, Item ingredient2) {

        this.ingredients.add(ingredient1);
        this.ingredients.add(ingredient2);

    }

    /**
     * Ingredientsetgetter  returns a hashset containing the two ingredient-items
     */

    public HashSet<Item> getIngredients() {
        return ingredients;
    }

    public int getPrice() {
        Item[] ingredientsList = ingredients.toArray(new Item[ingredients.size()]);
        return ingredientsList[0].getPrice() + ingredientsList[1].getPrice();

    }
}
