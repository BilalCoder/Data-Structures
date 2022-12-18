import java.util.Arrays;

public class RemoveDuplicates {

//    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that
//    each unique element appears only once. The relative order of the elements should be kept the same.
//
//    Since it is impossible to change the length of the array in some languages, you must instead have
//    the result be placed in the first part of the array nums. More formally, if there are k elements
//    after removing the duplicates, then the first k elements of nums should hold the final result.
//    It does not matter what you leave beyond the first k elements.

    public static void main(String[] args) {
        int[] arr1 = {1,1,2};
        int[] arr2 = {0,0,1,1,1,2,2,3,3,4};
        int[] arr3 = {};
        System.out.println(removeDuplicates(arr1));
        System.out.println(Arrays.toString(arr1));
        System.out.println(removeDuplicates(arr2));
        System.out.println(Arrays.toString(arr2));
        System.out.println(removeDuplicates(arr3));
        System.out.println(Arrays.toString(arr3));
    }

    public static int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1])
                continue;
            else
                nums[index++] = nums[i];
        }
        return index;
    }
}
