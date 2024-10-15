import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int Diamond;
    int space = 1;




    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number");
    Diamond = scan.nextInt();
    int mod = Diamond % 2;
    if (mod ==  1){
      while(space < Diamond){
        System.out.println(" ".repeat(Diamond-(space/2))+"*".repeat(space));
        space++;
        space++;
      }


      while(space > 0){
        System.out.println(" ".repeat(Diamond-(space/2))+"*".repeat(space));
        space--;
        space--;

      }
    }
    if (mod == 0){
      space = 0;
      while(space < Diamond){

        space++;
        space++;
        System.out.println(" ".repeat(Diamond-(space/2))+" *".repeat(space));
        space++;
        space++;
      }


      while(space > 0){

        System.out.println(" ".repeat(Diamond-(space/2))+" *".repeat(space));
        space--;
        space--;

      }
    }
    scan.close();
  }
}







