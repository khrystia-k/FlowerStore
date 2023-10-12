package flower.store;

import java.util.List;

import flower.filters.SearchFilter;
import flower.item.Item;
import java.util.ArrayList;

public class Store {
    public List<Item> items;

    public List<Item> search(SearchFilter searchFilter) {

        List<Item> foundItems = new ArrayList<>();

        for (Item item : items) {
            if (searchFilter.match(item)) {
                foundItems.add(item);
            }
        }
        return foundItems;

    }
}
