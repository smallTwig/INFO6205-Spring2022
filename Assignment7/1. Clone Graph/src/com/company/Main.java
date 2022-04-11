package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public Node cloneGraph(Node node) {

        if (node == null){
            return node;
        }

        HashMap<Node,Node> visited = new HashMap<>();
        LinkedList<Node> queue = new LinkedList<>();
        visited.put(node, new Node(node.val, new ArrayList()));
        queue.add(node);

        while (!queue.isEmpty()){
            Node curr = queue.poll();

            for (Node nei : curr.neighbors){
                if (!visited.containsKey(nei)){
                    visited.put(nei, new Node(nei.val, new ArrayList()));
                    queue.add(nei);
                }

                visited.get(curr).neighbors.add(visited.get(nei));
            }
        }
        return visited.get(node);
    }
}
