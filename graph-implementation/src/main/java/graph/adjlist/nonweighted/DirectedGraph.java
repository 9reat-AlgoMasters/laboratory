package graph.adjlist.nonweighted;
import java.util.ArrayList;

public class DirectedGraph {
    ArrayList<Integer>[] adjList;
    
    public DirectedGraph(int size) {
    	//TODO : 생성자 구현 -> adjList 초기화
        this.adjList = new ArrayList[size + 1];

        for (int i = 0; i <= size; i++) {
            this.adjList[i] = new ArrayList<>();
        }
    }
    
    public void addEdge(int from, int to) {
    	//TODO : 간선 추가 메서드 구현
        adjList[from].add(to);
    }
}
