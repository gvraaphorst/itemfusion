package gvr.itemfusion;

import java.util.ArrayList;
import java.util.HashMap;


public class Item {
    private String name;
    private int price;
    private ArrayList<Integer> storeList = new ArrayList<Integer>(5);
    private ArrayList<Fusion> fusionList = new ArrayList<Fusion>();

    public Item(String name) {
        this.name = name;

    }

    public Item() {
        this.name = "DefaultName";
        this.price = 99999999;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public ArrayList<Fusion> getFusionList() {
        return this.fusionList;
    }

    public void addFusion(Fusion fusion) {
        this.fusionList.add(fusion);
    }

    public ArrayList<Integer> getStoreList() {
        return this.storeList;
    }

    public void addStore(int i) {
        this.storeList.add(i);
    }
    public void addStore(String storeString) {
        HashMap<String, Integer> storeNameMap = new HashMap<String, Integer>();
        storeNameMap.put("Beginning", 1);
        storeNameMap.put("Second", 2);
        storeNameMap.put("Third", 3);

        assert storeNameMap.containsKey(storeString);

        this.addStore(storeNameMap.get(storeString));

    }




}
