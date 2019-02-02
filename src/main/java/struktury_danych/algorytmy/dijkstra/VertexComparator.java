package struktury_danych.algorytmy.dijkstra;

import java.util.Comparator;

public class VertexComparator implements Comparator<Vertex> {


    @Override
    public int compare(Vertex o1, Vertex o2) {
        if(o1.getWeight() < o1.getWeight()) {
            return -1;
        } else if(o1.getWeight() > o1.getWeight()) {
            return 1;
        } else {
            return 0;
        }
    }
//        return o2.getWeight()-o1.getWeight();
//        return Integer.compare(o2.getWeight(), o1.getWeight());
}
