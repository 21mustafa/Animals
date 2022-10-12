public class Fish extends Animal {
    private String habitat;
    private boolean hasGills;

    public Fish() {
        this.habitat = "water";
        this.hasGills = true;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public boolean hasGills() {
        return this.hasGills;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setGills(boolean hasGills) {
        this.hasGills = hasGills;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Lives: " + this.habitat);
        System.out.println("Has gills: " + this.hasGills);
    }
}
