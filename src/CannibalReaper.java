import java.util.Random;

public class CannibalReaper extends Cannibal{
    public CannibalReaper(String name) {
        super(name);
        setHitPoints(140);
  }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage/2);
    }

    public boolean runAway() {
//        if (getLives()< 2) {
//            return true;
//        }else {
//            return false;
//        }
        return (getLives() < 2);
    }
    public boolean dodges() {
        Random rand = new Random();
        int chanch = rand.nextInt(6);
        if (chanch > 3){
            System.out.println("Harvester dodged!");
            return true;
        }else {
            return false;
        }
    }
}


