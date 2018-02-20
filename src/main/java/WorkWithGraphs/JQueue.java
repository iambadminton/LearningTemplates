package WorkWithGraphs;

/**
 * Created by a.shipulin on 20.02.18.
 * реализация очереди по мотивам http://floppyy.ru/2016/02/28/queues/
 */
public class JQueue {
    private int[] array; // массив для хранения элементов
    private int size; // количество элементов в очереди
    private int count; // текущее количество элементов
    private int front; // элемент, который находится в начале очереди
    private int rear; // элемент, который находится в конце

    public JQueue(int size) {
        this.size = size;
        array = new int[size];
        front = 0;
        rear = -1;
        count = 0; // элементов в очереди пока нет
    }

    public void insert(int value) {
        if (rear == size - 1) {
            rear = -1;
        }
        array[++rear] = value;
        count++;
    }

    public int pop() {
        int temp = array[front++];
        if (front == size) {
            front = 0;
        }
        count--;
        return temp;

    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return(count == 0);
    }

    public static void main(String[] args) {
        JQueue queue = new JQueue(20);
        queue.insert(10);;
        queue.insert(20);
        queue.insert(256);
        while(!queue.isEmpty()) {
            System.out.println(queue.pop());
        }

    }
}
