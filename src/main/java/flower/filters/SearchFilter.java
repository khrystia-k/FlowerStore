package flower.filters;

import flower.item.Item;

public interface SearchFilter {
    boolean match(Item item);
}
