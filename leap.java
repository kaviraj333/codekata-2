import java.util.Scanner;
class leap {

    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int year=input.nextInt();
	
        if(year % 4 == 0)
             System.out.println("Yes");
        else
            System.out.println("No");
    }
}
