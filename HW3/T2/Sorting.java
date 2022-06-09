package HW3.T2;


public class Sorting {
    public static void main(String[] args) {

        Box<Apples> appleBox1 = new Box<>();
        Box<Apples> appleBox2 = new Box<>();
        Box<Oranges> orangeBox1 = new Box<>();
        for (int i = 0; i < 20; i++) {
            appleBox1.addFruit(new Apples());
            orangeBox1.addFruit(new Oranges());
        }
        for (int i = 0; i < 10; i++) {
            appleBox2.addFruit(new Apples());
        }
        System.out.println("Первая коробка яблок весит " + appleBox1.getWeight());
        System.out.println("Вторая коробка яблок весит " + appleBox2.getWeight());
        System.out.println("Коробка апельсонов весит " + orangeBox1.getWeight());
        System.out.println("Коробка первая яблок и коробка апельсинов весят одинаково "+ appleBox1.compare(orangeBox1));

        System.out.println("\nИз второй пересыпаем в первую\n");

        appleBox2.empty(appleBox1);

        System.out.println("Первая коробка яблок весит " + appleBox1.getWeight());
        System.out.println("Вторая коробка яблок весит " + appleBox2.getWeight());
        System.out.println("Коробка апельсонов весит " + orangeBox1.getWeight());
        System.out.println("Коробка первая яблок и коробка апельсинов весят одинаково "+ appleBox1.compare(orangeBox1));
    }
}
