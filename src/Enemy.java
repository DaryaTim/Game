public class Enemy {
    public String name;
    public int health;

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
    public int takeDamage (int damage){
        health = health - damage;
        return health;

        }

}
