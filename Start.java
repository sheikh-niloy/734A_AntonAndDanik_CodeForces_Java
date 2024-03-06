import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int g = s.nextInt();
        s.nextLine();
        String input = s.nextLine();
        int a=0,d=0;
        for( char x : input.toCharArray()){
            if(x=='D')
                d++;
            else
                a++;
        }
        if(a>d)
            System.out.println("Anton");
        else if(d>a)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    } 
} 