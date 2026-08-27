package ch.bbw.classes.shapes;

public abstract class Brawler {
    final int baseMaxLife;
    private int life;

    protected Brawler(int baseMaxLife) {
        this.baseMaxLife = baseMaxLife;
        life = baseMaxLife;
    }

    public void takeDamage(int amount){
        life -= amount;
    }

    public int getLife() {
        return life;
    }

    public abstract int doAttack(Brawler traget);
}

class Edgar extends Brawler{

    public Edgar() {
        super(10000);
    }

    @Override
    public int doAttack(Brawler traget) {
        traget.takeDamage(5000);
        return 3000;
    }
}
