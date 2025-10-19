import java.util.*;
import java.io.*;

public class TeamOlympiad{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException{
        while(st == null || !st.hasMoreTokens()){
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException{
        return Integer.parseInt(next());
    }

    public static void main(String[] args) throws IOException{
        int n = nextInt();
        int[] array = new int[n];

        List<Integer> programmers = new ArrayList<>();
        List<Integer> mathematicians = new ArrayList<>();
        List<Integer> sportsmen = new ArrayList<>();

        for(int i = 0; i < n; i++){
            array[i] = nextInt();
            if(array[i] == 1){
                programmers.add(i + 1);
            }
            else if(array[i] == 2){
                mathematicians.add(i + 1);
            }
            else sportsmen.add(i + 1);
        }

        int countOne = programmers.size();
        int countTwo = mathematicians.size();
        int countThree = sportsmen.size();

        int maxTeam = Math.min(countOne, Math.min(countTwo, countThree));
        System.out.println(maxTeam);

        for(int i = 0; i < maxTeam; i++){
            System.out.println(programmers.get(i) + " " + mathematicians.get(i) + " " + sportsmen.get(i));
        }


    }
}