public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }
    public String attackEnemy(String name){
        System.out.println(name + "атакует врага");
        return name;
    }
}
