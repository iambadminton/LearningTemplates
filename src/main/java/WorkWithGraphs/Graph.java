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
        // перед началом работы заполняем матрицу смежности нулями
        for (int i = 0; i < VERTEX_MAX; i++) {
            for (int j = 0; j < VERTEX_MAX; j++) {
                matrix[i][j] = 0;
            }
        }


    }

    public void addVertex(String label) {
        vertexList[vertexCount++] = new Vertex(label);
    }

    public void addEdge(int begin, int end) {
        matrix[begin][end] = 1;
        matrix[end][begin] = 0;
    }

    /*void bfs(int v) {
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


    }*/

    int getSuccessor(int v) {
        for (int j = 0; j < vertexCount; j++)
            if (matrix[v][j] == 1 && vertexList[j].isVisited == false)
                return j; //возвращает первую найденную вершину
        return -1; //таких вершин нет
    }
}
