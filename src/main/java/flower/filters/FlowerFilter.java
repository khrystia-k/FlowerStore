package flower.filters;

import java.util.List;

import flower.item.FlowerBucket;
import flower.item.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FlowerFilter implements SearchFilter {

    /** minimum price of bucket */
    private static final double MIN_PRICE = 0;
    /** maximum price of bucket */ 
    private static final double MAX_PRICE = 5000;
    /** minimum number of flowers in bucket */ 
    private static final int MIN_NUM_FLOWERS = 0;
    /** maximum number of flower in bucket */
    private static final int MAX_NUM_FLOWERS = 1000;

    /** match item with price and number of flowers */
    @Override
    public final boolean match(Item item) {

        boolean price = false;
        boolean numOfFlower = false;

        if (!(item instanceof FlowerBucket)) {
            return false;
        }

        FlowerBucket bucket = (FlowerBucket) item;
        if ((bucket.getPrice() >= MIN_PRICE)
                && (bucket.getPrice() <= MAX_PRICE)) {
            price = true;
        }

        List<?> flowerPack = bucket.getflowerPacks();

        if ((flowerPack.size() >= MIN_NUM_FLOWERS)
                && (flowerPack.size() <= MAX_NUM_FLOWERS)) {
            numOfFlower = true;
        }

        return (price && numOfFlower);
    }
}
