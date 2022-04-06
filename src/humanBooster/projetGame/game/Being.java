package humanBooster.projetGame.game;

public abstract class Being extends SpacialElement implements Comparable<Being>{

    private int maxHeath = 100;
    protected int heath;
    protected double resistance;

    public Being(String name, int x, int y, int maxHeath, int heath, double resistance) {
        super(name, x, y);
        this.maxHeath = maxHeath;
        this.heath = heath;
        this.resistance = resistance;
    }

    public void receiveDamage(int amount) {
        this.heath -= amount;
    }

    public int getMaxHeath() {
        return maxHeath;
    }

    public void setMaxHeath(int maxHeath) {
        this.maxHeath = maxHeath;
    }

    @Override
    public int compareTo(Being o) {
        if (this.heath < o.heath) {
            return -1;
        } else if (this.heath > o.heath) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Being{");
        sb.append("maxHeath=").append(maxHeath);
        sb.append(", heath=").append(heath);
        sb.append(", resistance=").append(resistance);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
