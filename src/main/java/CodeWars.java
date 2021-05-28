import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CodeWars {

    public static void main(String[] args) {
       String str = "How can mirrors be real if our eyes aren't real";

        String first;
        String rest = "";
        String[] words = str.split(" ");
        String result = "";

        for(String w: words) {
            //first letter
            first = w.substring(0,1).toUpperCase();
            //rest letters
            rest = w.substring(1,w.length());
            result += first+rest + " ";
        }
        System.out.println(result);


    }
    }



