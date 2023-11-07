public class Hero {
    private String name;
    private  int health;
    private  int demage;

    public String getName() {
        return name;
    }

    public Hero(int demage) {
        this.demage = demage;
    }

    public Enemy attackEnemy() {
        System.out.println(name + "атакует врага");
        }

}
