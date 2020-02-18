import java.util.Scanner;

/*

Print ascii in range

*/
public class ascii{

    public static void main(String[] args) {
    
    int AsciiLow = 0, AsciiHigh = 0; 
    System.out.println("Whrite a range. From = ");
    Scanner S =new Scanner(System.in);
    AsciiLow = S.nextInt();
    System.out.println("To = ");
    Scanner A =new Scanner(System.in);
    AsciiHigh = A.nextInt();

    char c;
    for(int i = AsciiLow; i <= AsciiHigh; i++) {
        c = (char)i;
        System.out.println(i + " = " + c);
    }
}
}