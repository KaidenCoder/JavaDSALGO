package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortArrayOfStrings {

    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        //int idx = str.indexOf('c') + 1;
       // System.out.println(str.substring(idx) +str.substring(0,idx));
        int idx = str.indexOf('c') ;
         String newstr = str.substring(idx) +str.substring(0,idx);
         System.out.println(newstr);
        ArrayList<String> d = new ArrayList<>();
        d.add("ninjas");
        d.add("coding");

//        d.add("my");
//        d.add("offer");
//        int arr[] = new int[d.size()];
//        for(int i = 0; i < d.size(); i++){
//            String character = d.get(i).substring(0,1);
//            int idx2 = newstr.indexOf(character) + 1;
//            arr[i] = idx2;
//
//        }
//
//        for(int i = 0; i < d.size(); i++){
//            for(int j = i + 1; j < d.size(); j++){
//                String tmp = "";
//                String character1 = d.get(i).substring(0,1);
//                int idx1 = newstr.indexOf(character1) + 1;
//                String character2 = d.get(j).substring(0,1);
//                int idx2 = newstr.indexOf(character2) + 1;
//                if(idx1 > idx2){
//                    tmp = d.get(i);
//                    d.set(i, d.get(j));
//                    d.set(j, tmp);
//                }
//            }
//
//        }
//
//        for(int j = 0; j < arr.length; j++){
//            System.out.println(d.get(j));
//
//        }


      System.out.println(sortArrStr(d.size(), d, 'c'));
    }

    public static ArrayList<String> sortArrStr(int n, ArrayList<String> arrStr, char c) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        int idx = str.indexOf(c) ;
        String newstr = str.substring(idx) +str.substring(0,idx);
        String arr [] = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = arrStr.get(i);
        }
        Comparator<String> myComp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                for(int i = 0; i < Math.min(o1.length(), o2.length()); i++){
                    if(newstr.indexOf(o1.charAt(i)) ==
                    newstr.indexOf(o2.charAt(i))){
                        continue;
                    }
                    else if(newstr.indexOf(o1.charAt(i)) >
                            newstr.indexOf(o2.charAt(i))){
                        return 1;
                    } else{
                        return -1;
                    }
                }
                return 0;
            }
        };
        Arrays.sort(arr, myComp);

        for(int i = 0; i < n; i++){
            arrStr.set(i, arr[i]);
        }
        return arrStr;
//        String str = "abcdefghijklmnopqrstuvwxyz";
//        int idx = str.indexOf(c) ;
//        String newstr = str.substring(idx) +str.substring(0,idx);
//        for(int i = 0; i < arrStr.size(); i++){
//            for(int j = i + 1; j < arrStr.size(); j++){
//                String tmp = "";
//                String character1 = arrStr.get(i).substring(0,1);
//                int idx1 = newstr.indexOf(character1) + 1;
//                String character2 = arrStr.get(j).substring(0,1);
//                int idx2 = newstr.indexOf(character2) + 1;
//                if(idx1 > idx2){
//                    tmp = arrStr.get(i);
//                    arrStr.set(i, arrStr.get(j));
//                    arrStr.set(j, tmp);
//                }
//            }
//
//        }
//        return arrStr;

    }

}
