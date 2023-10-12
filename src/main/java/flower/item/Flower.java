package flower.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Flower {
    private double sepalLength;
    private double price;
    private FlowerColor color;
    private FlowerType flowerType;

    // copy constructor
    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.price = flower.price;
        this.color = flower.color;
        this.flowerType = flower.flowerType;

    }
}
