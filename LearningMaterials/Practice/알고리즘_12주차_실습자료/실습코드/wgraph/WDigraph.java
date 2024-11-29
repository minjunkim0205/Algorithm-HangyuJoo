package wgraph;
import java.util.*;

class WDigraph { //Matrix

    int n; //Number of vertices
    int e; // Number of edges
    int [][] weight;
    
    public WDigraph(int noOfVertices) {
        n = noOfVertices;
        e = 0;
        weight = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (i == j) weight[i][j] = 0;
                else weight[i][j] = 9999; // 9999?
            }
        }
    }
    
    public WDigraph() {
        n = 0;
        e = 0;
    }
    
    public void insertEdge(int tail, int head, int w) {
        if (weight[tail][head] == 9999) {
            e++;
            weight[tail][head] = w;
        }
    }
    
    public void removeEdge(int tail, int head) {
        if (weight[tail][head] != 9999 && weight[tail][head] != 0) {
            e--;
            weight[tail][head] = 9999;
        }
    }
    
     public int[] topologicalSort() {
          LinkedQueue zeroPredQ = new LinkedQueue();   
          int[] sortedList = new int[n];    
          int sortedNo = 0;
          int[] indegree = new int[n];   
          
          // 이곳에 코드 작성
          
          return sortedList;
     }     

     public int[] EC(int[] sl) {
         int[] ec = new int[n];

         // 이곳에 코드 작성
         
         return ec;
     }

     public int[] LC(int[] sl, int ec) {
         int[] lc = new int[n];

         // 이곳에 코드 작성	
         
         return lc;
     }

     public int[][] CR(int[] ec, int[] lc) {
         int[][] cr = new int[n][n];   

         // 이곳에 코드 작성

         return cr;
     }

     public int[][] cpm() {
         int[] sortedList = topologicalSort();
         int[] ec = EC(sortedList);
         System.out.println("EC is : ");
         for (int vtx : ec)
             System.out.print(vtx + " ");
         System.out.println ();
         System.out.println("End.");

         int[] lc = LC(sortedList, ec[sortedList[n-1]]);
         System.out.println("LC is : ");
         for (int vtx : lc)
             System.out.print(vtx + " ");
         System.out.println ();
         System.out.println("End.");

         int[][] cr = CR(ec, lc);

         return cr;
     }


}


