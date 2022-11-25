package CashRegistry;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class CashRegistry {
    private static final Random RANDOM = new Random();
    private static int MAX_SIZE = 5;

    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        randomFilling(queue1);
        System.out.println("Первая очередь: " + queue1);
        randomFilling(queue2);
        System.out.println("Вторая очередь: " + queue2);


        add("Вова Мэн", queue1,queue2);
        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);


        remove(queue1,queue2);
        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);


    }

    private static final List<String> NAME = List.of(
            "Артем Иванов",
            "Иван Сидоров",
            "Коснстантин Маков",
            "Илья Петров",
            "Марк Антонов",
            "Антон Марков",
            "Петр Петров",
            "Елена Смирнова",
            "Анна Ким",
            "Жанна Поль"
    );
    private static void randomFilling (Queue<String> queue){
        int size = RANDOM.nextInt(6);
        for (int i = 0; i < size; i++) {
            queue.offer(NAME.get(RANDOM.nextInt(NAME.size())));
        }
    }

    public static void add(String name,Queue<String> queue1,Queue<String> queue2){
        if(queue1.size() < queue2.size()){
            queue1.offer(name);
        } else {
            queue2.offer(name);
        }
        if(queue1.size() == MAX_SIZE && queue2.size() == MAX_SIZE){
            System.out.println("Позовите Галю!");
        }
    }

    public static void remove (Queue<String> queue1,Queue<String> queue2){
        if(RANDOM.nextBoolean()) {
            queue1.poll();
        } else {
            queue2.poll();
        }
    }




}
