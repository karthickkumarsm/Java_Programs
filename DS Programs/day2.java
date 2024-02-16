public class day2 {
    public static void main(String[] args) {
        String a="Hardwork        never          fails";
        boolean first_space=false;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(ch!=' '){
                System.out.print(ch);
                first_space=true;
            }else if(first_space==true){
                System.out.print(a.charAt(i));
                first_space=false;
            }
        }
    }
}
