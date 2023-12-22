package AlgorithmsAndStructures.alishev;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 5, 10, 78, 120, 250, 957, 1024};
        //System.out.println(binarySearch(arr,250));
        System.out.println(binarySearchByRecursion(arr, 1, 0, arr.length - 1));

    }

    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (a[middle] > key) {
                high = middle - 1;
            } else if (a[middle] < key) {
                low = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

    public static int binarySearchByRecursion(int[] a, int key, int low, int high) {
        int middle = low + (high - low) / 2;
        if (a[middle] == key) {
            return middle;
        } else if (a[middle] > key && (middle - 1) >= low) {
            return binarySearchByRecursion(a, key, low, middle - 1);
        } else if (a[middle] < key && (middle + 1) <= high) {
            return binarySearchByRecursion(a, key, middle + 1, high);
        } else {
            return -1;
        }

    }
}
