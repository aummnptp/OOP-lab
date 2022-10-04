public class Mage extends Player{
    public Mage(){
        this.setHP(10);
        this.setMP(20);
        this.setATK(5);
    }
    public void addEquipment(Item i){
        i.use(this);
    }
    public void attack(Player p){
       p.attacked(p.getHP());
       this.setMP(this.getMP()-5);
    }
    public void attacked(double n){
        this.setHP(getHP()-n);
    }
}
