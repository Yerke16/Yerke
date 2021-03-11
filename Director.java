package kz.aitu.oop.assignment_add;

public class Director {
    private HouseBuilder builder;
    Director(HouseBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    public void Mansion() {
        System.out.println("Build Mainson house ");
        this.builder.reset();
        this.builder.buildFloor();
        this.builder.buildPool();
        this.builder.buildWindows();
        this.builder.buildGarage();
        this.builder.buildGarden();
    }

    public void Brick() {
        System.out.println("Build Brick House ");
        this.builder.reset();
        this.builder.buildFloor();
        this.builder.buildWindows();


    }


}
