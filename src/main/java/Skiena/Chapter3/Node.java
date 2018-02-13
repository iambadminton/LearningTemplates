package Skiena.Chapter3;

/**
 * Created by a.shipulin on 09.02.18.
 *Напишите программу для изменения направления односвязного списка на противоположное.
 * Иными словами, после обработки программой все указатели должны быть перевернуты в обратном направлении.
 * Алгоритм должен исполняться за линейное время.
 */
public class Node {
    public int key;
    public Node next;

    public Node(int key) {
        this.key = key;
        this.next = null;
    }
}
