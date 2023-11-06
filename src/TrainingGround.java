// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TrainingGround {


    public static void main(String[] args) {
        Hero hero1 = new Hero("Петя");
        System.out.println( hero1.getName() + " атакует врага");
        Hero heroWarrior = new Hero("Вася");
        System.out.println( heroWarrior.getName() + " атакует врага");
        Hero heroMage = new Hero("Коля");
        System.out.println( heroMage.getName() + " атакует врага");
        Hero heroArcher = new Hero("Сеня");
        System.out.println( heroArcher.getName() + " атакует врага");


        System.out.println(hero1.attackEnemy());





        }
}