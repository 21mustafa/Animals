public class Bird extends Animal {
    private boolean hasFeathers;
    private String feature;

    public Bird() {
        super();
        this.hasFeathers = true;
        this.feature = "Can fly";
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Has feathers: " + this.hasFeathers);
        System.out.println(this.feature);
    }
}
