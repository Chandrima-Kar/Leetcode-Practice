package array;

public class best_time_to_buy_ans_sell_stocks {
    public static void main(String[] args) {
        int[] num={7,1,3,5,8,4};
        int ans=time(num);
        System.out.print(ans);
    }
    public static int time(int[] num){
        int max=0,min=num[0];
        for(int i=0;i<num.length;i++){
           
            if(num[i]<min){
                min=num[i];
            }
            max=Math.max(max,num[i]-min);
            
        }
        return max;
    }
}
