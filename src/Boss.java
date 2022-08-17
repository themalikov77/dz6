public class Boss extends  GameEntity{
    private Weapon bazuka;

    public Weapon getBazuka() {
        return bazuka;
    }

    public void setBazuka(Weapon bazuka) {
        this.bazuka = bazuka;
    }
    public String printlnfo(){
        return this.bazuka.getWeaponName() + " " + this.health + " " + this.damage;
    }

}
