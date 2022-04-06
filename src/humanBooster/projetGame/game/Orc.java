package humanBooster.projetGame.game;

public class Orc extends Humanoid {

    public int rage;

    public Orc(String name, int x, int y, int maxHeath, int heath, double resistance, int rage) {
        super(name, x, y, maxHeath, heath, resistance);
        this.rage = rage;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Orc{");
        sb.append("heath=").append(heath);
        sb.append(", resistance=").append(resistance);
        sb.append(", rage=").append(rage);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
