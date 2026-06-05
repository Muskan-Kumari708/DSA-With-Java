package Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args){
        int [] height = {1,8,6,2,5,4,8,3,7};
        int n = height.length;
        int Max_Area = 0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                int hght = Math.min(height[i],height[j]);
                int width = j-i;
                int Area = hght * width;
                if (Area>Max_Area){
                    Max_Area = Area;
                }

            }
        }
        System.out.println(Max_Area);
    }
}
