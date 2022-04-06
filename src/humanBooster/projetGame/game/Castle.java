package humanBooster.projetGame.game;

public class Castle extends House {

    public int defense;

    public Castle(String name, int x, int y, int price, Humanoid own, Ematerial ematerial, int defense) {
        super(name, x, y, price, own, ematerial);
        this.defense = defense;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Castle{");
        sb.append("defense=").append(defense);
        sb.append(", own=").append(own);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
