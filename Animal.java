public class Animal {
    private int height;
    private int weight;
    private String type;
    private String bloodType;

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getType() {
        return this.type;
    }

    public String getBloodType() {
        return this.bloodType;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void getWeight(int weight) {
        this.weight = weight;
    }

    public void getType(String type) {
        this.type = type;
    }

    public void getBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void showInfo() {
        System.out.println("Animal Type: " + this.type);
        System.out.println("Height: " + this.height);
        System.out.println("Weight: " + this.weight);
        System.out.println("Blood Type: " + this.bloodType);
    }
}
