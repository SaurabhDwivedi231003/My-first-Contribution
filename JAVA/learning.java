import java.util.Scanner;
public class learning{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int r=sc.nextInt();
        System.out.println("🌻Have Surprise For You🌻");
        System.out.println("Enter no. of columns ");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(j==1 || j==c || i==1 || i==r){
                    System.out.print("   @    ");
                }
                else if(j==3 && i==3){
                    System.out.print("THANK   ");
                }
                else if(j==4 && i==4){
                    System.out.print("YOU     ");
                }
                else
                System.out.print("        ");
                    
                }
                System.out.println();
                System.out.println(" ");
            }
        }
    }
