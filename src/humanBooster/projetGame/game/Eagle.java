package humanBooster.projetGame.game;

public class Eagle extends Animal {

    public int vision;

    public Eagle(String name, int x, int y, int maxHeath, int heath, double resistance, Humanoid own, int vision) {
        super(name, x, y, maxHeath, heath, resistance, own);
        this.vision = vision;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Eagle{");
        sb.append("heath=").append(heath);
        sb.append(", resistance=").append(resistance);
        sb.append(", vision=").append(vision);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
