public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    public String attackEnemy(String name) {
        System.out.println(name + "атакует врага");
        return name;
    }
}
