package humanBooster.projetGame.game;

public abstract class Humanoid extends Being {

    public Humanoid(String name, int x, int y, int maxHeath, int heath, double resistance) {
        super(name, x, y, maxHeath, heath, resistance);
    }
}
