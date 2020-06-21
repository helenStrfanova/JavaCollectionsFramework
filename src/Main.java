/*
* Classname : Main
*
* Created on 21 June 2020
*
* Copyright Alyona Sviridova NTU KhPI
*
* JavaCollectionsFramework. List.
*
* 1. Create ArrayList and LinkedList containing  100 000 Integer elements. Compare time intervals.
* 2. Insert  new 1000 elements  on the  beginning, on  the middle  and on the end of ones. Compare time intervals.
* 3. Update 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
* 4. Delete 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
* */

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
        *  ArrayList for containing 100 000 Integer elements
        * */
        List<Integer> arrayList = new ArrayList<>();

        /*
        * LinkedList for containing 100 000 Integer elements
        * */
        List<Integer> linkedList = new LinkedList<>();

        /*
        * arrayList filling
        * */
        LocalDateTime startArrayList = LocalDateTime.now();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i * 13);
        }
        LocalDateTime finishArerayList = LocalDateTime.now();

        /*
        * linkedList filling
        * */
        LocalDateTime startLinkedList = LocalDateTime.now();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i * 13);
        }
        LocalDateTime finishLinkedList = LocalDateTime.now();

        /*
        * Compare time intervals
        * */
        long arrayListTimeInterval = ChronoUnit.MILLIS
                .between(startArrayList, finishArerayList);
        long linkedListTimeInterval = ChronoUnit.MILLIS
                .between(startLinkedList, finishArerayList);

        System.out.println("FILLING. "
                + (arrayListTimeInterval < linkedListTimeInterval
                ? "ArayList" : "Linkedlist") + "was faster."
                + "ArrayList time = " + arrayListTimeInterval
                + "LinkedList time = " + linkedListTimeInterval);

        /*
        * Insert  new 1000 elements  on the  beginning,
        * on  the middle  and on the end of ones.
        * */

        /*
        * arrayList inserting
        * */
        LocalDateTime startArrayListBeginning = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0, 5);
        }
        LocalDateTime finishArrayListBeginning = LocalDateTime.now();

        LocalDateTime startArrayListMiddle = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(arrayList.size() / 2, 5);
        }
        LocalDateTime finishArrayListMiddle = LocalDateTime.now();

        LocalDateTime startArrayListEnd = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(arrayList.size(), 5);
        }
        LocalDateTime finishArrayListEnd = LocalDateTime.now();

        /*
        * linkedList inserting
        * */
        LocalDateTime startLinkedListBeginning = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(0, 4);
        }
        LocalDateTime finishLinkedListBeginning = LocalDateTime.now();

        LocalDateTime startLinkedListMiddle = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(linkedList.size() / 2, 4);
        }
        LocalDateTime finishLinkedListMiddle = LocalDateTime.now();

        LocalDateTime startLinkedListEnd = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(4);
        }
        LocalDateTime finishLinkedListEnd = LocalDateTime.now();

        /*
        * Compare time intervals
        * */
        long arrayListBeginning = ChronoUnit.MILLIS
                .between(startArrayListBeginning, finishArrayListBeginning);
        long arrayListMiddle = ChronoUnit.MILLIS
                .between(startArrayListMiddle, finishArrayListMiddle);
        long arrayListEnd = ChronoUnit.MILLIS
                .between(startArrayListEnd, finishArrayListEnd);

        
    }
}
