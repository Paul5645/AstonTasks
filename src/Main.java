import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        //Тест MyArrayList
        System.out.println("MyArrayList");
        MyArray<Integer> numbers = new MyArrayList<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(8);

        for(int num : numbers){
            System.out.println(num);
        }

        System.out.println(numbers.get(0));
        System.out.println(numbers.size());

        numbers.delete(0);
        for(int num : numbers){
            System.out.println(num);
        }



        // Тест  ReferenceBook (HashMap)
        System.out.println("ReferenceBook");
        ReferenceBook<String, Integer> book = new ReferenceBook<>();

        // Вставка элементов
        book.insert("One", 1);
        book.insert("Two", 2);
        book.insert("Three", 3);
        book.insert("Four", 4);
        book.insert("Five", 5);

        // Получение элементов
        System.out.println("Value for key 'One': " + book.get("One"));
        System.out.println("Value for key 'Three': " + book.get("Three"));
        System.out.println("Value for key 'Six' (non-existent): " + book.get("Six"));

        // Удаление элемента
        System.out.println("Deleting key 'Two': " + book.delete("Two"));
        System.out.println("Value for key 'Two' after deletion: " + book.get("Two"));

        // Размер книги
        System.out.println("Size of the book: " + book.size());

        // Итерация по значениям
        System.out.println("Iterating through values:");
        for(Integer s : book){
            System.out.println(s);
        }
    }
}

