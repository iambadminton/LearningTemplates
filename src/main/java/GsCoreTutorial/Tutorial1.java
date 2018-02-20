package GsCoreTutorial;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

/**
 * Created by a.shipulin on 20.02.18.
 * Этот пример взят с сайта http://graphstream-project.org/doc/Tutorials/Getting-Started/
 */
public class Tutorial1 {
    public static void main(String[] args) {
        Graph graph = new SingleGraph("Tutorial 1");
        graph.addNode("A" );
        graph.addNode("B" );
        graph.addNode("C" );
        graph.addNode("D" );
        graph.addEdge("AB", "A", "B");
        graph.addEdge("BC", "B", "C");
        graph.addEdge("CA", "C", "A");
        graph.addEdge("DA", "D", "A");

        graph.display();

    }
}
