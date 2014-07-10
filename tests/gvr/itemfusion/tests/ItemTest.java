package gvr.itemfusion.tests;

import gvr.itemfusion.Fusion;
import gvr.itemfusion.Item;
import org.junit.Test;



import static gvr.itemfusion.tests.RegexMatcher.matches;
import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;



public class ItemTest {


    @Test
    public void item_has_a_name() {
        String itemName = "testname";
        Item item = new Item(itemName);
        assertEquals(itemName, item.getName());
        assertThat(itemName, is(item.getName()));
        assertThat(item.getName(), matches(".*"));
    }
    @Test
    public void item_can_be_constructed_with_store_string(){
        String itemName = "testname";
        int price = 50;
        String storenumber = "3";
        Item item = new Item(itemName, price, storenumber);
        assertThat(item.getStoreList(), hasItem(3));
    }


    @Test
    public void item_cost_can_be_set() {
        Item item = new Item();
        item.setPrice(100);
        assertThat(item.getPrice(), is(100));
    }
    @Test
    public void store_can_be_added_to_item_store_list() {
        Item item = new Item();
        item.addStore(2);
        item.addStore("Beginning");
        assertThat(item.getStoreList(), hasItem(2));
        assertThat(item.getStoreList(), hasItem(1));
    }
    @Test
    public void fusion_can_be_added_to_item_fusion_list(){
        Item item = new Item();
        Item ingredient1 = new Item();
        Item ingredient2 = new Item();
        Fusion fusion = new Fusion(ingredient1, ingredient2);
        item.addFusion(fusion);
        assertThat(item.getFusionList(), hasItem(fusion));

    }

    @Test public void item_has_a_correct_price_when_fusion_only() {
        Item ingredient1 = new Item("testItem1", 50);
        Item ingredient2 = new Item("testItem2", 150);
        Fusion testFusion = new Fusion(ingredient1, ingredient2);
        Item testItem = new Item("resultItem",testFusion);

        assertThat(testItem.getPrice(), is(50 + 150));
    }
    @Test
    public void adding_a_fusion_updates_item_price_when_fusion_price_is_lower(){
        Item ingredient1 = new Item("testItem1", 50);
        Item ingredient2 = new Item("testItem2", 150);
        Fusion testFusion = new Fusion(ingredient1, ingredient2);
        Item testItem = new Item("resultItem",300);
        testItem.addFusion(testFusion);
        assertThat(testItem.getPrice(), is(50 + 150));

    }

    @Test
    public void adding_a_fusion_does_not_update_item_price_when_fusion_price_is_higher(){
        Item ingredient1 = new Item("testItem1", 50);
        Item ingredient2 = new Item("testItem2", 550);
        Fusion testFusion = new Fusion(ingredient1, ingredient2);
        Item testItem = new Item("resultItem",300);
        testItem.addFusion(testFusion);
        assertThat(testItem.getPrice(), is(300));
    }



}