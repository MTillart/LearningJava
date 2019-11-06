public class Demo {
    public static void main(String[] args) {

//
//            CannibalReaper harvester = new CannibalReaper("Harvester");
//            harvester.showInfo();
//
//            harvester.setLives(0);
//            do{
//                if (harvester.dodges()){
//                    harvester.setLives(harvester.getLives() + 1);
//                    continue;
//                }
//                if (harvester.runAway()){
//                    System.out.println("Harvester flew away!");
//                    break;
//                }else {
//                    harvester.takeDamage(100);
//                    harvester.showInfo();
//                }
//            } while (harvester.getLives() > 0);
//            System.out.println("+++++++++++++++++++++++++++++++++++++++");



        Player jane = new Player("Jane Shepard");
        jane.pickUpLoot( new Loot ("Helmet", LootType.ARMOR, 120));
        jane.pickUpLoot( new Loot ("Chest Plate", LootType.ARMOR, 160));
        jane.pickUpLoot( new Loot ("Copper Countlets ", LootType.ARMOR, 70));
        jane.pickUpLoot( new Loot ("3x Scope", LootType.WEAPONMOD, 60));
        jane.pickUpLoot( new Loot ("Extend Clip", LootType.WEAPONMOD, 80));
        jane.pickUpLoot( new Loot ("Poison dart", LootType.SUPPORT, -15));
        jane.pickUpLoot( new Loot ("60 pullets", LootType.SUPPORT, 20));
        jane.pickUpLoot( new Loot ("Blasma Box", LootType.SUPPORT, 50));
        jane.showInventory();
        System.out.println(jane.score());
        jane.dropLoot("Poison dart");
        jane.showInventory();
        System.out.println(jane.score());




    }
}
