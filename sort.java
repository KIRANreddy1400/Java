public class sort {

    public static void main(String[] args) {
        String[] strings = {"banana", "apple", "grape", "orange", "kiwi"};

        // Sorting the array of strings
        bubbleSort(strings);

        // Displaying the sorted array
        System.out.println("Sorted Array:");
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    // Swapping the strings
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

