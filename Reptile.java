public class Reptile extends Animal {
    private String skin;
    private boolean hasBackbone;
    private String eggType;

    public Reptile() {
        this.skin = "Dry";
        this.hasBackbone = true;
        this.eggType = "Soft-shelled";
    }

    public String getSkin() {
        return this.skin;
    }

    public boolean getBackbone() {
        return this.hasBackbone;
    }

    public String getEggType() {
        return this.eggType;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void setBackbone(Boolean hasBackbone) {
        this.hasBackbone = hasBackbone;
    }

    public void setEggType(String eggType) {
        this.eggType = eggType;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Skin: " + this.skin);
        System.out.println("Has backbone: " + this.hasBackbone);
        System.out.println("Egg: " + this.eggType);

    }
}
