public class day15 {
    public static void main(String[] args) {
       String s1="Today is Sunday";
       String s2="Funday";
       boolean e=true;
       int len=s1.length()-1;
       for (int i = s2.length()-1; i >=0 ; i--) {
        char c1=s1.charAt(len);
        char c2=s2.charAt(i);
        if (c1==c2) {
            len--;
            continue;
        }
        else{
            e=false;
            System.out.println("Not ends with same word");
        }
       }
       if(e){
        System.out.println("Ends with same word");
       }
    }
}
