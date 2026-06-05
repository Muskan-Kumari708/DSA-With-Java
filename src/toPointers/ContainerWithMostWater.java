package toPointers;

import java.util.Scanner;

public class ContainerWithMostWater {
    public static int MaximumArea(int [] height){
        int n = height.length;
        int Max_Area = 0;

        int left = 0;
        int right = n-1;
        while (left < right) {
            int hght = Math.min(height[left], height[right]);
            int width = right - left;
            int Area = hght * width;
            if (Area > Max_Area) {
                Max_Area = Area;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return Max_Area;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] height = new int[n];
        for (int i = 0; i< height.length; i++){
            height[i] = sc.nextInt();
        }
        System.out.println(MaximumArea(height));

    }
}
