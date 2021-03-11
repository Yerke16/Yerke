package kz.aitu.oop.assignment_add;

public class Builder implements HouseBuilder{
    private House product;

   void HouseBuilder() {
        this.reset();
    }

    public House getResult() {
        House product = this.product;
        this.reset();
        return product;
    }

    @Override
    public void reset() {
        this.product = new House();
    }

    @Override
    public void buildFloor() {
        product.setFloor(true);
        System.out.println("Floor built");
    }

    @Override
    public void buildPool() {
        product.setPool(true);
        System.out.println("Pool built .");
    }

    @Override
    public void buildWindows() {
        product.setWindows(true);
        System.out.println("Windows built.");
    }

    @Override
    public void buildGarden() {
        product.setGarden(true);
        System.out.println("Garden built.");
    }

    @Override
    public void buildGarage() {
        product.setGarage(true);
        System.out.println("Garage built.");
    }

    public House getProduct() {
        return this.product;
    }
}
