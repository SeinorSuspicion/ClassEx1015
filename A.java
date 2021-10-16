package q1.extract_method.refactored;

import java.util.List;


public class A {
	Node m1(List<Node> nodes, String p) {
		extracted(nodes, p);
		return null;
	}

	Edge m2(List<Edge> edgeList, String p) {
		extracted(edgeList, p);
		return null;
	}

	<T extends Graph> void extracted(List<T> objs, String p) {
		for (T obj : objs) {
			if (obj.contains(p))
				System.out.println(obj);
		}
		// other implementation
		//return null;
	}

}

class Graph{
	String name;
	boolean contains(String p) {
		return name.contains(p);
	}
}
	
class Node extends Graph {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge extends Graph {
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}
   


