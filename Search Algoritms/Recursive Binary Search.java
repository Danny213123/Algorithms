public class BinaryRecursive {

    public static int binarySearchRecursive(int[] array, int target, int start, int end){
        int mid = (start + end)/ 2;

        //base case 1 - target found
        if(array[mid] == target){
            return mid;
        }
        //base case 2 - target
        if(start > end){
            return -1;
        }

        //mid < target - move to the right
        if(array[mid]< target) {
            return binarySearchRecursive(array, target, mid+1, end );
        } else {
            //mid > target - move to the left
            return binarySearchRecursive(array, target, start, mid-1 );
        }
    }

    public static void main(String[] args){
        int[] array = {1, 6, 7, 12, 15, 17, 20, 21, 33};
        System.out.println(binarySearchRecursive(array, 35, 0, array.length-1));

    }


}
