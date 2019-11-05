public class Demo {
    public static void main(String[] args) {

        Player jane = new Player();
        jane.setHandleName("Jane Shepard");
        System.out.println("Player: " + jane.getHandleName());
        System.out.println("Level: " + jane.getLevel());
        System.out.println("Lives: " + jane.getLives());
        System.out.println("Weapon: " + jane.getWeapon().getName());
        Weapon blackWidow =  new Weapon("Black Widow", 150, 2000);
        jane.setWeapon(blackWidow);
        System.out.println("Weapon now: " + jane.getWeapon().getName());

        Loot redArmor = new Loot("N7 Armor", LootType.ARMOR, 500);
        Loot mediGel = new Loot("MediGel", LootType.SUPPORT, 20);
        Loot scope = new Loot("3xTurian Scope", LootType.WEAPONMOD, 600);

        jane.pickUpLoot(redArmor);
        jane.pickUpLoot(mediGel);
        jane.pickUpLoot(mediGel);
        jane.pickUpLoot(scope);
        System.out.println("Jane inventory: ");
        jane.showInventory();
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        boolean wasDeleted = jane.dropLoot(mediGel);
        System.out.println(wasDeleted);
        jane.showInventory();
    }
}
