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
        Fusion fusion = new Fusion();
        item.addFusion(fusion);
        assertThat(item.getFusionList(), hasItem(fusion));

    }



}