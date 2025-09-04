import java.io.*;
import java.util.*;

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()

    repeat(t){
        val n = br.readLine().toInt()
        val parts = StringTokenizer(br.readLine())
        val array = IntArray(n){
            parts.nextToken().toInt()
        }

        if(array[0] == array[1]){
            for(i in 2 until n){
                if(array[i] != array[0]){
                    println(i + 1)
                    break
                }
            }
        }
        else{
            if(array[0] == array[2]){
                println(2);
            }
            else println(1);
        }
    }
}