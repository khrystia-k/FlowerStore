package flower.filters;

import flower.item.FlowerBucket;
import flower.item.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FlowerFilter implements SearchFilter {

    private static final double minPrice = 0;
    private static final double maxPrice = 5000;
    private static final int minNumFlowers = 0;
    private static final int maxNumFlowers = 1000;

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

        if ((bucket.flowerPacks.size() >= minNumFlowers)
                && (bucket.flowerPacks.size() <= maxNumFlowers)) {
            numOfFlower = true;
        }

        return (price && numOfFlower);
    }
}
