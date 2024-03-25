public class Char extends Humanoid{
    private String player;
    public Char(String player, String name, int health, int defense, int walkSpeed){
        super(name,health,defense,walkSpeed);
        this.player = player;
    }

    public void respawn(){
        super.setHealth(super.getMaxHealth());
    }

    public void onDeath(){
        System.out.println("hey we're gonna try and respawn now");
        respawn();
    }

}
