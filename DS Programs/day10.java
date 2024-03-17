public class day10 {
    public static void main(String[] args) {
        String s="  Hardwork never fails    ";
        int f=0,l=s.length()-1;
        boolean first=false,last=true;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' ' && first==false){
                f++;
            }
            else{
                first=true;
            }
            if(s.charAt(l)==' ' && last==false){
                l--;
            }
            else{
                last=true;
            }
            if(first==true && last==true){
                break;
            }
        }
        for(int i=f;i<=l;i++){
            System.out.print(s.charAt(i));
        }
    }
}

//trim() method logic-java