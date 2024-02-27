public class day12 {
    public static void main(String[] args) {
        day12 pd=new day12();
        char a='{',b='}';
        int count=5;
        for (int i = 1; i <=count; i++) {
            for(int j=1;j<i;j++){
                for(int k=1;k<=j;k++)
                    System.out.print(a);
                for (int k =1;k<=j; k++) 
                    System.out.print(b);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
