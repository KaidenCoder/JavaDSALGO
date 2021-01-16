package Arrays2.Assignments;

import java.util.ArrayList;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {-6,9,0,5};
        int arr2[] = {9,9,8,9};
        int[] output = new int[1 + Math.max(arr1.length, arr2.length)];

        sumOfTwoArrays(arr1, arr2, output);
    }

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = output.length - 1;
        int sum = 0;
        int carry = 0;

        while (i >= 0 && j >= 0) {
            sum = arr1[i] + arr2[j] + carry;
            i--;
            j--;
            output[k] = sum % 10;
            sum = sum / 10;
            carry = sum % 10;
            k--;
        }

        while (i >= 0) {
            sum = arr1[i] + carry;
            output[k] = sum % 10;
            sum = sum / 10;
            carry = sum % 10;
            i--;
            k--;
        }

        while (j >= 0) {
            sum = arr2[j] + carry;
            output[k] = sum % 10;
            sum = sum / 10;
            carry = sum % 10;
            k--;
            j--;
        }

        output[k] = carry;

        for (int l = 0; l < output.length; l++) {
            System.out.println(output[l]);
        }


    }
}
