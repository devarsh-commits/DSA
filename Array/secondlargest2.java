public class secondlargest2 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 10, 14, 9 };
        int largest = Integer.MIN_VALUE;
        int second_lar = largest - 1;
        for (int i : arr) {
            if (i > largest) {
                int temp = largest;
                largest = i;
                second_lar = temp;
            } else if (i >= second_lar) {
                second_lar = i;
            }
        }
        System.out.println(second_lar);
    }
}
