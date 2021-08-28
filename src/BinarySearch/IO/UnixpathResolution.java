package BinarySearch.IO;
import java.util.*;

public class UnixpathResolution {

    public static void main(String[] args) {
        //String arr[] = {"usr", "..", "usr", ".", "local", "bin", "docker"};
        String arr[] = {"bin", ".."};
        String res[] = solve(arr);
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }

    public static String[] solve(String[] path) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < path.length; i++){
            if(path[i].equals("..")) {
                if(arr.size() > 0){
                    arr.remove(arr.size() - 1);
                }else{
                    continue;
                }

            }else if(path[i].equals(".")){
                continue;
            }else{
                arr.add(path[i]);
            }
        }

        System.out.println(arr);

        String result[] = new String[arr.size()];

        for(int i = 0; i < arr.size(); i++){
            result[i] = arr.get(i);
        }

        return result;
    }
}
