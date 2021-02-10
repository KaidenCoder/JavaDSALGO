package Graphs1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
    public class  HasPath {

        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        public static void main(String[] args) throws NumberFormatException, IOException {
            String[] strNums;
            strNums = br.readLine().split("\\s");
            int n = Integer.parseInt(strNums[0]);
            int e = Integer.parseInt(strNums[1]);

            int edges[][] = new int[n][n];

            for(int i = 0; i < e; i++){
                String[] strNums1;
                strNums1 = br.readLine().split("\\s");
                int fv = Integer.parseInt(strNums1[0]);
                int sv = Integer.parseInt(strNums1[1]);
                edges[fv][sv] = 1;
                edges[sv][fv] = 1;
            }

            String[] strNums1;
            strNums1 = br.readLine().split("\\s");
            int sv = Integer.parseInt(strNums1[0]);
            int ev = Integer.parseInt(strNums1[1]);

            boolean ans = getPathBFS(edges, sv, ev);
            if(ans == true){
                System.out.print("true");
            } else{
                System.out.print("false");
            }
        }

        public static boolean getPathBFS(int[][] edges, int sv, int ev){
            boolean[] visited = new boolean[edges.length];
            return getPathBFSHelper(edges, sv, ev, visited);
        }

        private static boolean getPathBFSHelper(int[][] edges, int sv, int ev, boolean[] visited) {
            int n = edges.length;

            Map<Integer, Integer> map = new HashMap<>();
            Queue<Integer> queue = new LinkedList<>();

//            if(edges[sv][ev] == 1 && sv == ev){
//                ArrayList<Integer> ans = new ArrayList<>();
//                ans.add(sv);
//                return ans;
//            }

            queue.add(sv);
            visited[sv] = true;

            while(!queue.isEmpty()){
                int front = queue.remove();

                for(int i = 0; i < n; i++){
                    if(edges[front][i] == 1 && !visited[i]){
                        map.put(i, front);
                        queue.add(i);

                        visited[i] = true;

                        if(i == ev){
                            return true;
                        }
                    }
                }
            }
            return false;
        }

    }


