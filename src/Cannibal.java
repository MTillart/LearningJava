public class Cannibal extends Enemy {

    public Cannibal(String name) {

        super(name, 45, 2);
    }

    @Override
    public void takeDamage(int damage) {
        int damageDone = (damage/2);
        super.takeDamage(damageDone);
    }

}
