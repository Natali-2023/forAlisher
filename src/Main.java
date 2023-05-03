public class Main {
    public static void main(String[] args) {
        String[] arr = {"apple", "orange"};
        String word = "orange";
        System.out.println(getResultWord2(arr, word));

    }
    public static boolean getResultWord2(String[] arr2, String word2){
        boolean rezult=false;
        for (int i=0; i<arr2.length; i++) {
            if (arr2[i].equalsIgnoreCase(word2)) {
                rezult = true;
            }
        }
        return rezult;
    }

}
