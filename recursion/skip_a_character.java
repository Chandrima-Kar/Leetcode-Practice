public class skip_a_character {
    public static void main(String[] args) {
        String s="abbbabdcfshahaawqhaaa";
        char ch='a';
        System.out.println(skip(s,ch));
        String s1="abbbaballdcfshballqhaaaballl";
        System.out.println(skipBall(s1));
    }

    static String skip(String s,char ch){
        if (s.isEmpty()) {
            return ""; // Base case: if the string is empty
        }
        char ch1=s.charAt(0);
        if(ch==ch1)
        return skip(s.substring(1),ch);
        else
         return ch1+skip(s.substring(1), ch);
    }
    static String skipBall(String s){
        if (s.isEmpty()) {
            return ""; 
        }
        
        if(s.startsWith("ball"))
        return skipBall(s.substring(4));
        else
         return s.charAt(0)+skipBall(s.substring(1));
    }

    
}
