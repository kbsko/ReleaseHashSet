import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Kubish on 12.03.2015.
 */
public class IntHashSet implements Iterable, Iterator<Integer> {
    public int size = 10;
    public ArrayList<Integer>[] intHashTable;
    public ArrayList<Integer> allValue = new ArrayList<Integer>();
    public String massive = "";
    private int count = 0;
    private int count2 = 0;

    // Объявляем конструктор
    public IntHashSet() {
        size = 10;
        intHashTable = new ArrayList[size];
        count = 0;
        count2 = 0;
    }

    // Добавление элемента в контейнер
    public void add(int value) {
        int key = value % 10;
        if (intHashTable[key] == null) {
            intHashTable[key] = new ArrayList();
        }
        // Проверка повторяющихся элементов
        if (!this.contains(value)) {
            intHashTable[key].add(value); // Добавляем элемент
            allValue.add(value);
        }
        //System.out.println(intHashTable[3]);
    }

    // Вывод элементов IntHashSet
    @Override
    public String toString() {
        massive = "";
        // Вывод всех элементов массива
        for (int i = 0; i < size; i++) {
            if (intHashTable[i] == null) continue;
            for (int j = 0; j < intHashTable[i].size(); j++) {
                massive = massive + intHashTable[i].get(j) + " ";
            }
        }
        return "[ " + this.massive + "]";
    }

    //Определяет размер массива
    public int size() {
        count = 0;
        for (int i = 0; i < size; i++) {
            if (intHashTable[i] == null) continue;
            count = count + intHashTable[i].size();
        }
        return count;
    }

    // Поиск элемента в контейнере
    public boolean contains(int value) {
        int key = value % 10;
        if (intHashTable[key] == null) {  //Если хешстрока таблицы пуста
            return false;
        } else {                            // Перебор элементов
            for (int j = 0; j < intHashTable[key].size(); j++) {
                if (intHashTable[key].get(j) == value) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        if (count2 < this.size()) return true;
        return false;

    }

    @Override
    public Integer next() {
        if (count2 == this.size())
            throw new NoSuchElementException();
        count2++;
        return allValue.get(count2 - 1);
    }
}
