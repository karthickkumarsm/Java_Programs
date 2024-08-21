/**
 * day6 Anagram
 */
public class day6 {
    public static void main(String[] args) {
        String s1="cat";
        String s2="act";
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if (s1.charAt(i)==s2.charAt(j)) {
                    s2=s2.replaceFirst(""+s1.charAt(i), "");
                    break;
                }
            }
        }
        if(s2.length()==0){
            System.out.println("Given word is anagram");
        }else{
            System.out.println("Given word is not an anagram");
        }
    }
}