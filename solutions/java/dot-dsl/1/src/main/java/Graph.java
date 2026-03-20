import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
  List<Node> nodes = new ArrayList<>();
  List<Edge> edges = new ArrayList<>();
  Map<String, String> attributes = new HashMap<>();

    public Graph() {

    }

    public Graph(Map<String, String> attributes) {
      this.attributes = attributes;
    }

    public Collection<Node> getNodes() {
      return nodes;
    }

    public Collection<Edge> getEdges() {
      return edges;
    }

    public Graph node(String name) {
      Node node = new Node(name);
      nodes.add(node);
//      hmmm
      return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
      Node node = new Node(name, attributes);
//      the attributes here puzzle me a bit
      nodes.add(node);
      return this;
    }

    public Graph edge(String start, String end) {
      Edge edge = new Edge(start, end);
      edges.add(edge);
      return this;
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
      Edge edge = new Edge(start, end, attributes);
      edges.add(edge);
      return this;
    }

    public Map<String, String> getAttributes() {
      return attributes;
    }
}
