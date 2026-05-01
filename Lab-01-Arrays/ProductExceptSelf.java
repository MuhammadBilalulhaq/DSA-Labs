public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        int[] result = new int[n];

        // Step 1: Left products
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * arr[i - 1];
        }

        // Step 2: Right products
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right = right * arr[i];
        }

        // Print result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
