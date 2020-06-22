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

        System.out.println("FILLING. \n"
                + (arrayListTimeInterval < linkedListTimeInterval
                ? "ArayList" : "Linkedlist") + " was faster. \n"
                + " ArrayList time = " + arrayListTimeInterval + "\n"
                + " LinkedList time = " + linkedListTimeInterval + "\n");

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
        * Compare time intervals for Insert
        * */

        //ArrayList
        long arrayListBeginning = ChronoUnit.MILLIS
                .between(startArrayListBeginning, finishArrayListBeginning);
        long arrayListMiddle = ChronoUnit.MILLIS
                .between(startArrayListMiddle, finishArrayListMiddle);
        long arrayListEnd = ChronoUnit.MILLIS
                .between(startArrayListEnd, finishArrayListEnd);

        //LinkedList
        long linkedListBeginning = ChronoUnit.MILLIS
                .between(startLinkedListBeginning, finishLinkedListBeginning);
        long linkedListMiddle = ChronoUnit.MILLIS
                .between(startLinkedListMiddle, finishLinkedListMiddle);
        long linkedListEnd = ChronoUnit.MILLIS
                .between(startLinkedListEnd, finishLinkedListEnd);

        System.out.println("INSERT. \n"
                + (arrayListBeginning < linkedListBeginning
                ? "ArayList Beginning" : "Linkedlist Beginning")
                + " was faster. \n"
                + " ArayList Beginning: " + arrayListBeginning + "ms. \n"
                + " Linkedlist Beginning: " + linkedListBeginning + "ms. \n"
                + (arrayListMiddle < linkedListMiddle
                ? "ArayList Middle" : "Linkedlist Middle")
                + " was faster. \n"
                + " ArayList Middle: " + arrayListMiddle + "ms. \n"
                + " Linkedlist Middle: " + linkedListMiddle + "ms. \n"
                + (arrayListEnd < linkedListEnd
                ? "ArayList End" : "Linkedlist End")
                + " was faster. \n"
                + " ArayList End: " + arrayListEnd + "ms. \n"
                + " Linkedlist End: " + linkedListEnd + "ms. \n");

        /*
        * Update 1000 elements  from the  beginning, from  the middle
        * and from the end of ones. Compare time intervals.
        * */

        /*
        * arrayList Update
        * */
        LocalDateTime startArrayListBeginningUpdate = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(0, 1);
        }
        LocalDateTime finishArrayListBeginningUpdate = LocalDateTime.now();

        LocalDateTime startArrayListMiddleUpdate = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(arrayList.size() / 2, 1);
        }
        LocalDateTime finishArrayListMiddleUpdate = LocalDateTime.now();

        LocalDateTime startArrayListEndUpdate = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(arrayList.size() - 1, 1);
        }
        LocalDateTime finishArrayListEndUpdate = LocalDateTime.now();

        /*
        * linkedList Update
        * */
        LocalDateTime startLinkedListBeginningUpdate = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(0, 2);
        }
        LocalDateTime finishLinkedListBeginningUpdate = LocalDateTime.now();

        LocalDateTime startLinkedListMiddleUpdate = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(linkedList.size() / 2, 2);
        }
        LocalDateTime finishLinkedListMiddleUpdate = LocalDateTime.now();

        LocalDateTime startLinkedListEndUpdate = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(linkedList.size() - 1, 2);
        }
        LocalDateTime finishLinkedListEndUpdate = LocalDateTime.now();

        /*
        * Compare time intervals for Update
        * */

        //ArrayList
        long arrayListBeginningUpdate = ChronoUnit.MILLIS
                .between(startArrayListBeginningUpdate
                        , finishArrayListBeginningUpdate);
        long arrayListMiddleUpdate = ChronoUnit.MILLIS
                .between(startArrayListMiddleUpdate
                        , finishArrayListMiddleUpdate);
        long arrayListEndUpdate = ChronoUnit.MILLIS
                .between(startArrayListEndUpdate
                        , finishArrayListEndUpdate);

        //LinkedList
        long linkedListBeginningUpdate = ChronoUnit.MILLIS
                .between(startLinkedListBeginningUpdate
                        , finishLinkedListBeginningUpdate);
        long linkedListMiddleUpdate = ChronoUnit.MILLIS
                .between(startLinkedListMiddleUpdate
                        , finishLinkedListMiddleUpdate);
        long linkedListEndUpdate = ChronoUnit.MILLIS
                .between(startLinkedListEndUpdate
                        , finishLinkedListEndUpdate);

        System.out.println("UPDATE. \n"
                + (arrayListBeginningUpdate < linkedListBeginningUpdate
                ? "ArayList Beginning " : "Linkedlist Beginning ")
                + " was faster. \n"
                + " ArayList Beginning: "
                + arrayListBeginningUpdate + "ms. \n"
                + " Linkedlist Beginning: "
                + linkedListBeginningUpdate + "ms. \n"
                + (arrayListMiddleUpdate < linkedListMiddleUpdate
                ? "ArayList Middle " : "Linkedlist Middle ")
                + " was faster. \n"
                + " ArayList Middle: " + arrayListMiddleUpdate + "ms. \n"
                + " Linkedlist Middle: " + linkedListMiddleUpdate + "ms. \n"
                + (arrayListEndUpdate < linkedListEndUpdate
                ? "ArayList End" : "Linkedlist End")
                + " was faster. \n"
                + " ArayList End: " + arrayListEndUpdate + "ms. \n"
                + " Linkedlist End: " + linkedListEndUpdate + "ms. \n");

        /*
        * Delete 1000 elements  from the  beginning,
        * from  the middle  and from the end of ones. Compare time intervals.
        * */

        /*
        * arrayList Delete
        * */
        LocalDateTime startArrayListBeginningDelete = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(0);
        }
        LocalDateTime finishArrayListBeginningDelete = LocalDateTime.now();

        LocalDateTime startArrayListMiddleDelete = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        LocalDateTime finishArrayListMiddleDelete = LocalDateTime.now();

        LocalDateTime startArrayListEndDelete = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        LocalDateTime finishArrayListEndDelete = LocalDateTime.now();

        /*
        * linkedList Delete
        * */
        LocalDateTime startLinkedListBeginningDelete = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(0);
        }
        LocalDateTime finishLinkedListBeginningDelete = LocalDateTime.now();

        LocalDateTime startLinkedListMiddleDelete = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        LocalDateTime finishLinkedListMiddleDelete = LocalDateTime.now();

        LocalDateTime startLinkedListEndDelete = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(linkedList.size() - 1);
        }
        LocalDateTime finishLinkedListEndDelete = LocalDateTime.now();

        /*
        * Compare time intervals for Delete
        * */

        //ArrayList
        long arrayListBeginningDelete = ChronoUnit.MILLIS
                .between(startArrayListBeginningDelete
                        , finishArrayListBeginningDelete);
        long arrayListMiddleDelete = ChronoUnit.MILLIS
                .between(startArrayListMiddleDelete
                        , finishArrayListMiddleDelete);
        long arrayListEndDelete = ChronoUnit.MILLIS
                .between(startArrayListEndDelete
                        , finishArrayListEndDelete);

        //LinkedList
        long linkedListBeginningDelete = ChronoUnit.MILLIS
                .between(startLinkedListBeginningDelete
                        , finishLinkedListBeginningDelete);
        long linkedListMiddleDelete = ChronoUnit.MILLIS
                .between(startLinkedListMiddleDelete
                        , finishLinkedListMiddleDelete);
        long linkedListEndDelete = ChronoUnit.MILLIS
                .between(startLinkedListEndDelete
                        , finishLinkedListEndDelete);

        System.out.println("DELETE. \n"
                + (arrayListBeginningDelete < linkedListBeginningDelete
                ? "ArayList Beginning " : "Linkedlist Beginning ")
                + " was faster. \n"
                + " ArayList Beginning: "
                + arrayListBeginningDelete + "ms. \n"
                + " Linkedlist Beginning: "
                + linkedListBeginningDelete + "ms. \n"
                + (arrayListMiddleDelete < linkedListMiddleDelete
                ? "ArayList Middle " : "Linkedlist Middle ")
                + " was faster. \n"
                + " ArayList Middle: " + arrayListMiddleDelete + "ms. \n"
                + " Linkedlist Middle: " + linkedListMiddleDelete + "ms. \n"
                + (arrayListEndDelete < linkedListEndDelete
                ? "ArayList End" : "Linkedlist End")
                + " was faster. \n"
                + " ArayList End: " + arrayListEndDelete + "ms. \n"
                + " Linkedlist End: " + linkedListEndDelete + "ms. \n");
    }
}
