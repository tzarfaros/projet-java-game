package humanBooster.projetGame.game;

public class House extends SpacialElement{

    private int price;
    public Humanoid own = null;
    private Ematerial ematerial;

    public House(String name, int x, int y, int price, Humanoid own, Ematerial ematerial) {
        super(name, x, y);
        this.price = price;
        this.own = own;
        this.ematerial = ematerial;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Ematerial getEmaterial() {
        return ematerial;
    }

    public void setEmaterial(Ematerial ematerial) {
        this.ematerial = ematerial;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("House{");
        sb.append("price=").append(price);
        sb.append(", own=").append(own);
        sb.append(", ematerial=").append(ematerial);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
