package Homework_20220316;

import Homework_20220316.myarraylist.MyArrayList;
import Homework_20220316.mylinkedlist.MyLinkedList;

public class Main {
    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();

        myArrayList.add(7);
        myArrayList.add(15);
        myArrayList.add(31);
        myArrayList.add(31);
        myArrayList.add(31);
        myArrayList.add(3,1);
        myArrayList.set(0,99);
        myArrayList.remove(2);

        System.out.println(myArrayList);
        System.out.println(myArrayList.contains(15));
        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.indexOf(1));
        System.out.println(myArrayList.lastIndexOf(31));
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.isEmpty());

        for (int a : myArrayList) {
            System.out.print(a + ". ");
        }

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
