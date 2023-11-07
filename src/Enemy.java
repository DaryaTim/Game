public class Enemy {
    private String name;
    private int health;
    private int demage;



    public Enemy(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth() {
        this.health = health;
    }

    public Enemy() {
        this.getHealth();
        this.setHealth();
    }

    public int getDemage() {
        return demage;
    }

    public void setDemage(int demage) {
        this.demage = demage;
    }

    public int takeDamage (int damage){
        health = health - damage;
        return health;

        }

}
