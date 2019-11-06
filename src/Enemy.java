import java.sql.SQLOutput;

public class Enemy {
    private String name;
    private int hitPoints;
    private int lives;

    public Enemy(String name, int hitPoints, int lives) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.lives = lives;
    }

    public void takeDamage (int damage){
        int remainingHitPoints = this.hitPoints-damage;
        System.out.println("Attack!");
        if (remainingHitPoints > 0){
            setHitPoints(remainingHitPoints);

            System.out.println(this.name.toUpperCase() + ": I took " + damage + " damage points, and have " + remainingHitPoints + " points left.");
        }else {
            this.lives-= 1;
            if (lives > 0) {
                System.out.println(this.name.toUpperCase() + ": I have lost a life," + this.lives +
                        " lives left.");
            }else {
                System.out.println(this.name.toUpperCase() + ": Took, too much damage. Arggg, I have died");
            }

        }
    }
    public void showInfo(){
        System.out.println("Name: " + this.name + " Hitpoints: " + this.hitPoints + " Lives: " + this.lives);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

}
