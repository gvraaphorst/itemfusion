package gvr.itemfusion.tests;

import gvr.itemfusion.Fusion;
import gvr.itemfusion.Item;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class FusionTest {


    @Test
    public void fusion_contains_three_items(){
        Item ingredient1 = new Item();
        Item ingredient2 = new Item();
        Fusion fusion = new Fusion(ingredient1, ingredient2);
        assertThat(fusion.getIngredients(), hasItem(ingredient1));
        assertThat(fusion.getIngredients(), hasItem(ingredient2));
    }

}