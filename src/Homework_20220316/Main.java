package Homework_20220316;

public class Main {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(5);
        myLinkedList.add(14);
        myLinkedList.add(33);

        myLinkedList.add(2, 28);

        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.isEmpty());
        System.out.println(myLinkedList);

        myLinkedList.delete(0);

        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.isEmpty());
        System.out.println(myLinkedList);

        /*
        Iterator<Integer> kkk = myLinkedList.iterator();
        while (kkk.hasNext()) {
            System.out.print(kkk.next() + " ");
        }
         */

        for (Integer integer : myLinkedList) {
            System.out.print(integer + " ");
        }
    }
}
