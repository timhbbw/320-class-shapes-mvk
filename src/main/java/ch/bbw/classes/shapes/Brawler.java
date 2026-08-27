package ch.bbw.classes.shapes;

public class Brawler {
    final int baseMaxLife;
    private int life;

    public Brawler(int baseMaxLife) {
        this.baseMaxLife = baseMaxLife;
        life = baseMaxLife;
    }

    public void takeDamage(int amount){
        life -= amount;
    }

    public int getLife() {
        return life;
    }
}

class Edgar extends Brawler{

    public Edgar(int baseMaxLife) {
        super(baseMaxLife);
    }


}
