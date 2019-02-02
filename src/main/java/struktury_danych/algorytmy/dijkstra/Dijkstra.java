package struktury_danych.algorytmy.dijkstra;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkstra {

    private LinkedList<Vertex>[] listAdjacent;

    private int n;

    private boolean[] visitedTab;

    private int[] distanceTab;

    private int[] sourceTab;

    private PriorityQueue<Vertex> priorityQueue;

    public Dijkstra(int n, LinkedList<Vertex>[] list) {
        this.listAdjacent = list;
        this.n = n;
        this.visitedTab = new boolean[n];
        this.distanceTab = new int[n];
        this.sourceTab = new int[n];
        this.priorityQueue = new PriorityQueue<>(n, new VertexComparator());
    }

    public void calculateMinPath(int source) {
        for (int i = 0; i < n; i++) {
            distanceTab[i] = Integer.MAX_VALUE;
            sourceTab[i] = -1;
//            visitedTab[i] = false;
        }

        distanceTab[source] = 0;
        sourceTab[source] = source;

        priorityQueue.add(new Vertex(source, distanceTab[source]));

        while(!priorityQueue.isEmpty()) {
            // S - source
            Vertex vS = priorityQueue.poll();
            int idS = vS.getId();
            int wS = vS.getWeight();

            if(visitedTab[idS]) {
                continue;
            }

            visitedTab[idS] = true;

            // D - destination
            for (Vertex vD : listAdjacent[idS]) {
                int idD = vD.getId();
                int wD = vD.getWeight();

                if (!visitedTab[idD] && (wS + wD < distanceTab[idD])) {
                    distanceTab[idD] = wS + wD;
                    sourceTab[idD] = idS;
                    priorityQueue.add(new Vertex(idD, distanceTab[idD]));
                }
            }
        }
    }

    public void print() {
        System.out.println("Distance:");
        for (int i = 0; i < n; i++) {
            System.out.print(distanceTab[i] + " ");
        }
        System.out.println("\n\n");

        System.out.println("Source:");
        for (int i = 0; i < n; i++) {
            System.out.print(sourceTab[i] + " ");
        }
        System.out.println();
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        int vNum; //ilość wierzchołków
        int eNum; //ilość krawędzi
        System.out.println("Podaj ilość wierzchołków:");
        vNum = sc.nextInt();

        System.out.println("Podaj ilość krawędzi:");
        eNum = sc.nextInt();

        LinkedList<Vertex>[] list = new LinkedList[vNum];
        for (int i = 0; i < vNum; i++) {
            list[i] = new LinkedList<>();
        }

        for (int i = 0; i < eNum; i++) {
            System.out.println("Podaj źródło:");
            int source = sc.nextInt();
            System.out.println("Podaj cel:");
            int destination = sc.nextInt();
            System.out.println("Podaj podaj wagę:");
            int weight = sc.nextInt();

            list[source].add(new Vertex(destination, weight));
        }
        Dijkstra dijkstra = new Dijkstra(vNum, list);
        dijkstra.calculateMinPath(0);
        dijkstra.print();
    }
}
