public class Main {
    public static void main(String[] args) {
        Boss marvel = new Boss();
        Weapon weapon= new Weapon();
        weapon.setWeaponName("bazuka");
        marvel.setBazuka(weapon);
        marvel.setHealth(1000);
        marvel.setDamage(500);
        System.out.println(" information Boss:"+ "Weapon-"+ marvel.getBazuka().getWeaponName()+ "" +" Health-"+ marvel.getHealth() + "" + " Damage-" + marvel.getDamage() );
        System.out.println(marvel.printlnfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setDamage(15);
        skeleton.setHealth(100);
        skeleton.setNumberOfArrows(10);

        Skeleton skeletonImproved= new Skeleton();
        skeletonImproved.setDamage(50);
        skeletonImproved.setHealth(250);
        skeletonImproved.setNumberOfArrows(30);
        System.out.println("information Skeleton-"+ "Damage:"+ skeleton.getDamage() + "" +" Health:" + skeleton.getHealth() + " NumberOfArrows:" + skeleton.getNumberOfArrows() );
        System.out.println("information Skeleton Improved-"+"Damage:" + skeletonImproved.getDamage() + " "+ "Health:"+ skeletonImproved.getHealth() + " "+ " NumberOfArrows:" + skeletonImproved.getNumberOfArrows());
       








    }
}