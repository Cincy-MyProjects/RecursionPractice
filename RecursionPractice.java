public class RecursionPractice {
    public static void main(String[] args) {
        System.out.println(appendNTimes("dog", 4));
        int[] arrnumbers = {1, 2, 3, 4, 5};
        int num1 = 3;
        int index = contains(arrnumbers, num1);
        if (index != -1) System.out.println("Value " + num1 + " found at index " + index);
        else System.out.println("Value " + num1 + " not found in the array");

    }

    public static String appendNTimes(String str, int n) {
        if (n == 0) return "";
        return str + appendNTimes(str, n - 1);
    }

    public static int contains(int[] arrnumbers, int num1) {
        return containsinner(arrnumbers, num1, 0);
    }

    private static int containsinner(int[] arrnumbers, int num1, int index) {
        if (index >= arrnumbers.length) return -1;
        if (arrnumbers[index] == num1) return index;
        return containsinner(arrnumbers, num1, index + 1);
    }
}
