package flower.filters;

import flower.item.FlowerBucket;
import flower.item.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FlowerFilter implements SearchFilter {

    private double minPrice = 0;
    private double maxPrice = 5000;
    private int minNumberFlowers = 0;
    private int maxNumberFlowers = 1000;

    @Override
    public boolean match(Item item) {

        boolean price = false;
        boolean numOfFlower = false;

        if (item instanceof FlowerBucket != true) {
            return false;
        }

        FlowerBucket bucket = (FlowerBucket) item;
        if ((bucket.getPrice() >= minPrice)
                && (bucket.getPrice() <= maxPrice)) {
            price = true;
        }

        if ((bucket.flowerPacks.size() >= minNumberFlowers)
                && (bucket.flowerPacks.size() <= maxNumberFlowers)) {
            numOfFlower = true;
        }

        return (price && numOfFlower);
    }
}
