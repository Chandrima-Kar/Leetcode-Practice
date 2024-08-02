package array;

public class container_with_most_water {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        maxWater(arr);
    }
    public static void maxWater(int[] arr){
        int maxarea=0,curarea=0,l=0,r=arr.length-1;
        while(l<r){
            curarea=(Math.min(arr[l],arr[r]))*(r-l);
            if(maxarea<curarea)
                maxarea=curarea;
            if(arr[l]<arr[r])
                l++;
            else
                r--;
        }
        System.out.println(maxarea);
    }
}
