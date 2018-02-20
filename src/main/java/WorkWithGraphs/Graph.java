package WorkWithGraphs;

/**
 * Created by a.shipulin on 20.02.18.
 */
public class Graph {
    // максимальное количество вершин
    private final int VERTEX_MAX = 100;
    // массив для хранения вершин
    private Vertex[] vertexList;
    // текущее количество вершин в графе
    private int vertexCount;
    //матрица смежности
    private int[][] matrix;
    public JQueue queue;

    public Graph() {
        queue = new JQueue(100);
        matrix = new int[VERTEX_MAX][VERTEX_MAX];
        // перед началом работы заполняем матрицу смежности нулями
        for (int i = 0; i < VERTEX_MAX; i++) {
            for (int j = 0; j < VERTEX_MAX; j++) matrix[i][j] = 0;
        }
        vertexList = new Vertex[VERTEX_MAX];
    }

    public void addVertex(String label) {
        vertexList[vertexCount++] = new Vertex(label);
    }

    public void addEdge(int begin, int end) {
        matrix[begin][end] = 1;
        matrix[end][begin] = 0;
    }

    // обход в ширину
    void bfs(int v) {
        vertexList[v].isVisited = true;
        queue.insert(v);
        int vertex;

        //выведем вершину, с которой начинается обход, на экран
        System.out.println(vertexList[v].getLabel());

        while (!queue.isEmpty())//пока очередь не опустеет
        {
            int current = queue.pop();
            while ((vertex = getSuccessor(current)) != -1) {
                vertexList[vertex].isVisited = true;
                queue.insert(vertex);
                //вывод вершины на экран
                System.out.println(vertexList[vertex].getLabel());
            }
        }

        //сброс флагов
        for (int j = 0; j < vertexCount; j++) {
            vertexList[j].isVisited = false;
        }
    }

    int getSuccessor(int v) {
        for (int j = 0; j < vertexCount; j++)
            if (matrix[v][j] == 1 && vertexList[j].isVisited == false)
                return j; //возвращает первую найденную вершину
        return -1; //таких вершин нет
    }

    // мои доработки:
    public void showVertexList() {
        for (int k = 0; k < this.vertexList.length; k++) {
            if (vertexList[k] != null) {
                System.out.println("vertexList[" + k + "]=" + vertexList[k].toString());
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex(new String("A"));
        graph.addVertex(new String("B"));
        graph.addVertex(new String("C"));
        graph.addVertex(new String("D"));
        graph.addVertex(new String("E"));
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(4, 3);
        graph.addEdge(4, 5);


        graph.showVertexList();

        graph.bfs(0);
    }
}
