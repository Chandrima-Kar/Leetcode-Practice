package array;

public class maxPoints_from_cards {
    public static void main(String[] args) {
        int[] cards={1,2,3,4,5,6,1};
        int k=3;
        System.out.println(maxScore(cards,k));

    }
    public static int maxScore(int[] cardPoints, int k) 
    {
        int maxSum=0,leftSum=0,rightSum=0;
        for(int i=0;i<k;i++){
            leftSum+=cardPoints[i];
        }
        maxSum=leftSum;
        int rightIndex=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            leftSum-=cardPoints[i];
            rightSum+=cardPoints[rightIndex];
            rightIndex--;
            maxSum=Math.max(maxSum,leftSum+rightSum);
        }  
        return maxSum;    
    }
}
