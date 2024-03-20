abstract class Fabrik {
    public Product order(Color carColor,Color seatColor){
        Product product = build(carColor,seatColor);
        product.manufacturing();
        return product;
    }
    public abstract Product build(Color carColor,Color seatColor);
    // public abstract Product build();
}
