public class CannibalReaper extends Cannibal{
    public CannibalReaper(String name) {
        super(name);
        setHitPoints(140);
  }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage/2);
    }
}


