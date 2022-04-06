package humanBooster.projetGame.game;

public class Human extends Humanoid {

    public int mana;

    public Human(String name, int x, int y, int maxHeath, int heath, double resistance, int mana) {
        super(name, x, y, maxHeath, heath, resistance);
        this.mana = mana;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Human{");
        sb.append("heath=").append(heath);
        sb.append(", resistance=").append(resistance);
        sb.append(", mana=").append(mana);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
