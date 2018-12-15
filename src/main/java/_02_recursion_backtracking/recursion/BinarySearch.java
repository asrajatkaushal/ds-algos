public class BinarySearch {
    // public int binarySearch(int[] arr, int start, int end, int element) {
    //     int mid = (start + end) / 2;
    //     if (element == arr[mid]) {
    //         return mid;
    //     } else if(element < arr[mid]) {
    //         return binarySearch(arr, start, mid - 1, element);
    //     } else if (element > arr[mid]) {
    //         return binarySearch(arr, mid + 1, end, element);
    //     } else {
    //         return -1;
    //     }
    // }

    public int binarySearch(int[] arr, int start, int end, int element) {
        System.out.println("start : " + start + "  end : " + end + "  element : " + element);
        if(start <= end) {
            int mid = (start + end) / 2;
            System.out.println("mid : " + mid);
            if(element < arr[mid]) {
                binarySearch(arr, start, mid - 1, element);
            } else if(element > arr[mid]) {
                binarySearch(arr, mid + 1, end, element);
            } else {
                return mid;
            }
        }
        return -1;
    }
}
