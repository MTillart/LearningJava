import java.util.ArrayList;

public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;
    private ArrayList<Loot> inventory;

    public Player() {
        this("Unknown");

    }

    public Player(String name){
//        handleName=name;
//        lives = 3;
//        level = 1;
//        score = 0;
        this(name, 1);
    }

    public Player (String name, int startingLevel){
        setHandleName(name);
        setLives(3);
        setLevel(startingLevel);
        setScore(0);
        setDefaultWeapon();
        inventory = new ArrayList<>();
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handle) {
        if (handle.length() < 3) {
            System.out.println("Name too short, must be 3 character long.");
            return;
        }
        this.handleName = handle;

    }

    private void setDefaultWeapon() {
        this.weapon = new Weapon("PlasmaPistol", 20 , 320);
    }
    public void setNameandLevel(String name, int level) {
        setHandleName(name);
        setLevel(level);
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Loot> getInventory() {
        return inventory;
    }

//    public void setInventory(ArrayList<Loot> inventory) {
//        this.inventory = inventory;
//    }
    public void pickUpLoot(Loot newLoot){
        inventory.add(newLoot);
    }
    public boolean dropLoot (Loot loot) {
        if (this.inventory.contains(loot)){
            inventory.remove(loot);
            return true;
        }
        return false;
    }
    public boolean dropLoot(String lootName){
        for (Loot currentLoot : inventory){
            if (currentLoot.getName().equals(lootName)){
                inventory.remove(currentLoot);
                return true;
            }
        }
        return false;
    }

    public void showInventory(){
        for(Loot item : inventory){
            System.out.println(item.getName());
        }
    }
    public int score(){
        int total = 0;
//        for (int i= 0; i < inventory.size(); i++){
        for(Loot currentLoot : inventory) {
            //Loot currentLoot = inventory.get(i);
            total = total + currentLoot.getValue();
        }
        return total;
    }

}
