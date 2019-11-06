public class Demo {
    public static void main(String[] args) {


            CannibalReaper harvester = new CannibalReaper("Harvester");
            harvester.showInfo();

            //harvester.setLives(0);
            while (harvester.getLives() > 0) {
                if (harvester.dodges()){
                    continue;
                }
                if (harvester.runAway()){
                    System.out.println("Harvester flew away!");
                    break;
                }else {
                    harvester.takeDamage(100);
                    harvester.showInfo();
                }
                //System.out.println("Harvester is dead Shepard!");
            }
            System.out.println("+++++++++++++++++++++++++++++++++++++++");



//        Player jane = new Player("Jane Shepard");
//        jane.pickUpLoot( new Loot ("Helmet", LootType.ARMOR, 120));
//        jane.pickUpLoot( new Loot ("Chest Plate", LootType.ARMOR, 160));
//        jane.pickUpLoot( new Loot ("Copper Countlets ", LootType.ARMOR, 70));
//        jane.pickUpLoot( new Loot ("3x Scope", LootType.WEAPONMOD, 60));
//        jane.pickUpLoot( new Loot ("Extend Clip", LootType.WEAPONMOD, 80));
//        jane.pickUpLoot( new Loot ("MediGel", LootType.SUPPORT, 30));
//        jane.pickUpLoot( new Loot ("60 pullets", LootType.SUPPORT, 20));
//        jane.pickUpLoot( new Loot ("Blasma Box", LootType.SUPPORT, 50));
//        jane.showInventory();
//        System.out.println(jane.Score());




    }
}
