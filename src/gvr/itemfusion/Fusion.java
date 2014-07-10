package gvr.itemfusion;

import java.util.HashSet;



public class Fusion {
    HashSet<Item> ingredients = new HashSet<Item>(2);
    Item resultItem;

    public Fusion(Item ingredient1, Item ingredient2, Item resultItem) {

        this.ingredients.add(ingredient1);
        this.ingredients.add(ingredient2);
        this.resultItem = resultItem;
    }

    public Fusion() {

    }

    public HashSet<Item> getIngredients() {
        return ingredients;
    }
}
