import java.util.*;

public class day14 {
    public static void main(String[] args) {
        day14 obj=new day14();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr 2 Names");
        String name_1=sc.nextLine().replaceAll(" ", " ").toUpperCase();
        String name_2=sc.nextLine().replaceAll(" ", " ").toUpperCase();
        sc.close();
        System.out.println(obj.Flames_game(name_1,name_2));
    }
    private String Flames_game(String name_1,String name_2){
        for(int i=0;i<name_1.length();i++){
            for (int j = 0; j < name_2.length(); j++) {
                if (name_1.charAt(i)==name_2.charAt(j)) {
                    name_1=name_1.replaceFirst(""+name_1.charAt(i), " ");
                    name_2=name_2.replaceFirst(""+name_2.charAt(j), " ");
                    break;
                }
            }
        }
        String actual_input=name_1.replaceAll(" ", "")+name_2.replaceAll(" ", "");
        String flames="FLAMES";
        while(flames.length()!=1){
            int remove_char=actual_input.length() % flames.length();
            if (remove_char!=0) {
                flames=flames.substring(remove_char)+flames.substring(0,remove_char-1);
            }else{
                flames=flames.substring(0,flames.length()-1);
            }
        }
        //System.out.println(flames);
        return flames;
    }
}
