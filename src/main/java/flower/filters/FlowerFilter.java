package flower.filters;

import java.util.List;

import flower.item.FlowerBucket;
import flower.item.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FlowerFilter implements SearchFilter {

    private static final double MIN_PRICE = 0;
    private static final double MAX_PRICE = 5000;
    private static final int MIN_NUM_FLOWERS = 0;
    private static final int MAX_NUB_FLOWERS = 1000;

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

        List<?> flowerPack = bucket.getflowerPacks();

        if ((flowerPack.size() >= MIN_NUM_FLOWERS)
                && (flowerPack.size() <= MAX_NUB_FLOWERS)) {
            numOfFlower = true;
        }

        return (price && numOfFlower);
    }
}
