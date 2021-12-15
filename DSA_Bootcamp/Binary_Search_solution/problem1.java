package DSA_Bootcamp.Binary_Search_solution;

public class problem1 {
    //    find the ceiling of the given sorted array.
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int a = ceiling(arr, target);
        System.out.println(a);
    }

    //ceiling = find the element greater or equal to the target value.
    private static int ceiling(int[] arr, int target) {
        int index = BinarySearch(arr, target);
        if (arr[index] == target) {
            return arr[index];
        }
        return -1;
    }

    private static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = (arr.length - 1);
        while (start <= end) {
//            find the middle element.
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
