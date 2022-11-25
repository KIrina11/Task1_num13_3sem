package ru.vsu.cs.kislova_i_v;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        //добавление элементов в список
        list.add(549);
        list.add(40);
        list.add(0);
        list.add(211);
        //добавление элемента в список по индексу
        list.add(1, 25);
        System.out.printf("List has %d elements \n", list.size());

        //получение элемента из списка по индексу
        System.out.println(list.get(1));

        //проверка содержится ли элемент в списке
        if (list.contains(0)) {

            System.out.println("List contains 0");
        }

        //удаление элемента из списка по индексу
        list.remove(1);
        // удаление первого элемента
        list.removeFirst();
        // удаление последнего элемента
        list.removeLast();
        System.out.printf("List has %d elements \n", list.size());

        CycleLinkedList cycleList = new CycleLinkedList();

        //добавление элементов в циклический список
        cycleList.addNode(789);
        cycleList.addNode(72);
        cycleList.addNode(241);
        cycleList.addNode(10);
        cycleList.addNode(0);
        cycleList.addNode(325);
        cycleList.addNode(465);

        //проверка на содержание элемента в циклическом списке
        if (cycleList.containsNode(0)) {
            System.out.println("CycleList contains number 0");
        }

        //удаление элемента из циклического списка
        cycleList.deleteNode(465);
        if (cycleList.containsNode(465)) {
            System.out.println("CycleList contains number 465");
        } else {
            System.out.println("CycleList don't contains number 465");
        }
    }
}
