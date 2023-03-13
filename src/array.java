public class array {
    public static void main(String args[]){
//        int arr[] = {50, 60, 70, 80};
//        for (int i = 0; i <= arr.length; i++)
//        {
//            System.out.println(arr[i]);
//        }
//    }
//}
        //Initialize array
        int [] arr = new int [] {25, -11, 17, 175, 56};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            //Compare elements of array with max
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element: " + max);
    }
}
