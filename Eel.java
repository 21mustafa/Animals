public class Eel extends Fish {
    private String feature;

    public Eel() {
        super();
        this.feature = "Release electric charge";
    }

    public String getFeature() {
        return this.feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(this.feature);
    }
}
