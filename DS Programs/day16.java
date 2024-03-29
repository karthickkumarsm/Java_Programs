public class day16 {
    public static void main(String[] args) {
    String s="abcdefg@#$";
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch>='a' && ch<='z'){
            ch=(char)(ch-32);
            System.out.print(ch);
        }
        else{
            System.out.print(ch);
        }
    }
    }
}

//toUppercase logic
