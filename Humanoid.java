public class Humanoid {
    private String name;
    private int health;
    private int defense;
    private int walkSpeed;
    private int maxHealth;
    private static int instances = 0;
    public Humanoid(String name, int health, int defense, int walkSpeed){
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.defense = defense;
        this.walkSpeed = walkSpeed;
        instances++;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getDefense(){
        return defense;
    }
    public int getWalkSpeed(){
        return walkSpeed;
    }
    public int getMaxHealth(){
        return maxHealth;
    }
    public void setDefense(int newDefense){
        this.defense = newDefense;
    }
    public void setWalkSpeed(int newWalkSpeed){
        this.walkSpeed = newWalkSpeed;
    }
    public void TakeDamage(int dam){
        health -= dam;
        if(health < 0){
            health = 0;
        }
    }
    public void DoDamage(Humanoid other, int dam){
        other.TakeDamage(dam);
    }
}
