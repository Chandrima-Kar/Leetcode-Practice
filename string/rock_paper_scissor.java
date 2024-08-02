package string;
import java.util.*;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s;
        System.out.print("Enter: ");
        s=sc.nextLine();
        System.out.println(game(s));
    }
    public static String game(String s){
        String ans="";
        switch(s){
            case "Rock":
                ans="Paper";
                break;
            case "Paper":
                ans="Scissor";
            break;
            case "Scissor":
                ans="Rock";
            break;
            default:
                ans="Draw";
        }
        return ans;
    }
}
