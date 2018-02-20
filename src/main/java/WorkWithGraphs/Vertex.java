package WorkWithGraphs;

/**
 * Created by a.shipulin on 20.02.18.
 * Данный класс создан по мотивам http://floppyy.ru/2016/05/02/graphs_in_practice/
 *
 */
public class Vertex {
    /*private*/ public String label;
    /*private*/ public boolean isVisited;

    public Vertex(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    @Override
    public String toString() {
        if(!this.equals(null)) {
            return "Vertex{" +
                    "label='" + label + '\'' +
                    ", isVisited=" + isVisited +
                    '}';
        }
        else return null;
    }
}
