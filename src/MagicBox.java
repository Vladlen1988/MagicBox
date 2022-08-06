import java.util.Random;

public class MagicBox<T> {
    Random random = new Random();
    protected int maxObjects;
    protected T[] items;
    private int count = 0;

    public MagicBox(int maxObjects) {
        this.maxObjects = maxObjects;
        items = (T[]) new Object[maxObjects];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                count++;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не полна, осталось заполнить ячеек - " + (items.length - count));
            }
        }
        
        int randomInt = random.nextInt(maxObjects);

        return items[randomInt];
    }
}
