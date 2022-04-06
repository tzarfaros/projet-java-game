package humanBooster.projetGame.game;

public abstract class Animal extends Being{

    private Humanoid own = null;

    public Animal(String name, int x, int y, int maxHeath, int heath, double resistance, Humanoid own) {
        super(name, x, y, maxHeath, heath, resistance);
        this.own = own;
    }

    public Humanoid getOwn() {
        return own;
    }

    public void setOwn(Humanoid own) {
        this.own = own;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("own=").append(own);
        sb.append(", heath=").append(heath);
        sb.append(", resistance=").append(resistance);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
