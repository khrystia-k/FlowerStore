package flower.filters;

import flower.item.FlowerBucket;
import flower.item.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FlowerFilter implements SearchFilter {

    private double MIN_PRICE = 0;
    private double MAX_PRICE = 5000;
    private int MIN_NUM_FLOWERS = 0;
    private int MAX_NUM_FLOWERS = 1000;

    @Override
    public boolean match(Item item) {

        boolean price = false;
        boolean numOfFlower = false;

        if (item instanceof FlowerBucket != true) {
            return false;
        }

        FlowerBucket bucket = (FlowerBucket) item;
        if ((bucket.getPrice() >= MIN_PRICE)
                && (bucket.getPrice() <= MAX_PRICE)) {
            price = true;
        }

        if ((bucket.flowerPacks.size() >= MIN_NUM_FLOWERS)
                && (bucket.flowerPacks.size() <= MAX_NUM_FLOWERS)) {
            numOfFlower = true;
        }

        return (price && numOfFlower);
    }
}
