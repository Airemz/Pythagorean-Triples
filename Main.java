import java.util.Scanner;
// Some Pythagorean triples: 3,4,5  5,12,13  and  7,24,25

class Main {
  public static void main(String[] args) {
    Scanner key=new Scanner(System.in);

    System.out.println();
    System.out.println("Enter a positive integer to represent the limit");
    int limit = key.nextInt();

    int a;
    int b;
    int c;

    System.out.println();
    System.out.println("The triplets are the following:");

    for (a=1; a<=limit; a++){
      for (b=a+1; b<=limit; b++){
        for (c=b+1; c<=limit; c++){
          if (a*a + b*b == c*c)
            System.out.println(a + "," + b +"," + c);
        }
      }
    }
  }
}