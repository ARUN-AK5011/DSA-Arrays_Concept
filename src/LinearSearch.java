import java.util.Locale;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {34, 4, 1, 6, 23, 8, 19};
        int target = 6;

        System.out.println(SearchInRange(arr, 6, 4 , target));

//        String str = "Alpha";
//        char target = 'L';
//
//        System.out.println(SearchChar(str, target));
    }

    static int Search(int[] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static boolean SearchChar(String str, char target){
        if (str.isEmpty()){
            return  false;
        }

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }

    static boolean SearchInRange(int[] arr, int Start, int End, int Target){
        if(arr.length == 0) {
            return false;
        }

        for (int i = Start; i <= End ; i++) {
            if(Target == arr[i]){
                return true;
            }
        }
        return  false;
    }
}
