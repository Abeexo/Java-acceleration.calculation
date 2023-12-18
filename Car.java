public class Car {
    public String brand;
    public String type;
    public int cc;
    private int Weight;
    private int height;

    public Car() {
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public Car(String brand, String type, int cc) {
        this.brand = brand;
        this.type = type;
        this.cc = cc;
    }

    public Car(String brand, String type, int cc, int Weight) {
        this.brand = brand;
        this.type = type;
        this.cc = cc;
        this.Weight = Weight;
    }

    public Car(String brand, String type, int cc, int Weight, int height) {
        this.brand = brand;
        this.type = type;
        this.cc = cc;
        this.Weight = Weight;
        this.height = height;
    }

    public int getAcceleration() {
        return (this.Weight / this.cc) * 100 / 10;
    }

    public int getAcceleration(int value) {
        return (this.Weight / this.cc) * value / 10;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return Weight;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return "brand: " + this.brand + "\ntype: " + this.type + "\ncc: " + this.Weight + "\nheight: "
                + this.height;

    }
}
