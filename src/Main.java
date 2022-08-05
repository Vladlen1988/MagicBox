public class Main {
    public static void main(String[] args) {
        MagicBox box1 = new MagicBox(4);
        box1.add(1);
        box1.add(3);
        box1.add(5);
        box1.add(70);

        System.out.println("Ваш результат: " + box1.pick());

        MagicBox box2 = new MagicBox(4);
        box2.add("Один");
        box2.add("Три");
        box2.add("Пять");
        box2.add("Семьдесят");

        System.out.println("Ваш результат: " + box2.pick());
    }
}
