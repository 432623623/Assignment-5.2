import jsjf.Graph;

public class Driver {

    public static void main(String[] args){

        Graph<String> graph = new Graph<>();

        graph.size();
        graph.isEmpty();

        graph.addVertex("a");
        graph.addVertex("b");
        graph.addEdge("a", "b");
        graph.addEdge("b", "a");

        System.out.println(graph);
        System.out.println("size: " + graph.size());
        System.out.println("is empty: " + graph.isEmpty());
        System.out.println("connected: " + graph.isConnected());
        /**
        graph.removeVertex("b");
        System.out.println(graph);
        graph.removeVertex("a");
        System.out.println(graph);
*/





        //removeEdge

        //addVertex

        //removeVertex


        //size


        //isEmpty

        //isConnected

        //getIndex


        //indexIsValid


        //getVertices

    }
}
