package kz.aitu.oop.assignment_add;

public class House {
    private boolean Floor;
    private boolean Pool;
    private boolean Windows;
    private boolean Garden;
    private boolean Garage;

    House() {
        this.Floor = false;
        this.Pool = false;
        this.Windows = false;
        this.Garden = false;
        this.Garage = false;
    }

    public boolean isFloor() {
        return Floor;
    }

    public void setFloor(boolean floor) {
        Floor=floor;
    }

    public boolean isPool() {
        return Pool;
    }

    public void setPool(boolean pool) {
       Pool=pool;
    }

    public boolean isWindows() {
        return Windows;
    }

    public void setWindows(boolean windows) {
        Windows = windows;
    }

    public boolean isGarden() {
        return Garden;
    }

    public void setGarden(boolean garden) {
        Garden=garden;
    }

    public boolean isGarage() {
        return Garage;
    }

    public void setGarage(boolean garage) {
        Garage = garage;
    }
}
