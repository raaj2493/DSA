import java.lang.String;
import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String name = "Raaj";
        boolean result = search(name, 'R');
        System.out.println(result);

        // Printing String in Array
        System.out.println(Arrays.toString(name.toCharArray()));

    }
    static boolean search(String str, char target){
        if (str.length()==0){
            return false;
        }

        for (int i =0; i<str.length(); i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
