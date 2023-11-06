public class Mage extends Hero{
    public Mage(String name) {
        super(name);
    }
    public String attackEnemy(String name){
        System.out.println(name + "атакует врага");
        return name;
    }
}
