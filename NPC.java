public class NPC extends Humanoid {
    private String[] drops;
    public NPC(String name, int health, int defense, int walkSpeed, String[] drops){
        super(name,health,defense,walkSpeed);
        this.drops = drops;
    }
    public void onDeath(){
        System.out.println(drops);
    }
}
