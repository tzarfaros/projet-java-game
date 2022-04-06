package humanBooster.projetGame.game;

public class Dragon extends Animal {

    private int power;
    private int range;

    public Dragon(String name, int x, int y, int maxHeath, int heath, double resistance, Humanoid own, int power, int range) {
        super(name, x, y, maxHeath, heath, resistance, own);
        this.power = power;
        this.range = range;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dragon{");
        sb.append("heath=").append(heath);
        sb.append(", resistance=").append(resistance);
        sb.append(", power=").append(power);
        sb.append(", range=").append(range);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
