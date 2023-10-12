package flower.item;

import lombok.Getter;

public class FlowerPack {
    @Getter
    private Flower flower;

    @Getter
    private int quantity;

    public FlowerPack(Flower flower) {
        this.flower = new Flower(flower);
        this.quantity = 1;
    }

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity < 0 ? 0 : quantity;

    }

    public double getPrice() {
        return quantity * flower.getPrice();
    }

}
