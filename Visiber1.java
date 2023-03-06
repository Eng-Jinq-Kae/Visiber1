import java.util.Scanner;

public class Visiber1 {
  public static void main(String[] args) {
    Scanner myObj1 = new Scanner(System.in);
    System.out.print("Enter brith date: ");
    int P = myObj1.nextInt();
    
    Scanner myObj2 = new Scanner(System.in);
    System.out.print("Enter brith month: ");
    int Q = myObj2.nextInt();
    
    Scanner myObj3 = new Scanner(System.in);
    System.out.print("Enter first 2 digits of year: ");
    int R = myObj3.nextInt();
    
    Scanner myObj4 = new Scanner(System.in);
    System.out.print("Enter last 2 digits of year: ");
    int S = myObj4.nextInt();
    
    int a,b,c,d,e,f,g = 0;
    
    if (P>=10) {
      int firstDigit = Integer.parseInt(Integer.toString(P).substring(0, 1));
      int lastDigit = P % 10;
      a = firstDigit + lastDigit;
    } else {
    a = P;
    }
    
    if (Q>=10) {
      int firstDigit = Integer.parseInt(Integer.toString(Q).substring(0, 1));
      int lastDigit = Q % 10;
      b = firstDigit + lastDigit;
    } else {
    b = Q;
    }
    
    if (R>=10) {
      int firstDigit = Integer.parseInt(Integer.toString(R).substring(0, 1));
      int lastDigit = R % 10;
      c = firstDigit + lastDigit;
    } else {
    c = R;
    }
    
    if (S>=10) {
      int firstDigit = Integer.parseInt(Integer.toString(S).substring(0, 1));
      int lastDigit = S % 10;
      d = firstDigit + lastDigit;
    } else {
    d = S;
    }
    
    if (a>=10) {
      int firstDigit = Integer.parseInt(Integer.toString(a).substring(0, 1));
      int lastDigit = a % 10;
      a = firstDigit + lastDigit;
    } else {
    a = a;
    }
    
    if (b>=10) {
      int firstDigit = Integer.parseInt(Integer.toString(b).substring(0, 1));
      int lastDigit = b % 10;
      b = firstDigit + lastDigit;
    } else {
    b = b;
    }
    
    if (c>=10) {
      int firstDigit = Integer.parseInt(Integer.toString(c).substring(0, 1));
      int lastDigit = c % 10;
      c = firstDigit + lastDigit;
    } else {
    c = c;
    }
    
    if (S==0) {
      d = 5;
    }
    
    if (d>=10) {
      int firstDigit = Integer.parseInt(Integer.toString(d).substring(0, 1));
      int lastDigit = d % 10;
      d = firstDigit + lastDigit;
    } else {
    d = d;
    }
    
    e=a+b;
    if (e>=10) {
      int firstDigit = Integer.parseInt(Integer.toString(e).substring(0, 1));
      int lastDigit = e % 10;
      e = firstDigit + lastDigit;
    } else {
    e = e;
    }
    
    f=c+d;
    if (f>=10) {
      int firstDigit = Integer.parseInt(Integer.toString(f).substring(0, 1));
      int lastDigit = f % 10;
      f = firstDigit + lastDigit;
    } else {
    f = f;
    }
    
    g=e+f;
    if (g>=10) {
      int firstDigit = Integer.parseInt(Integer.toString(g).substring(0, 1));
      int lastDigit = g % 10;
      g = firstDigit + lastDigit;
    } else {
    g = g;
    }
    
    System.out.printf("\nYour visiber result: \n");
    System.out.printf("\n   %02d   %02d   |   %02d   %02d",P,Q,R,S);
    System.out.printf("\n *-----------------------*" );
    System.out.printf("\n  *  "+a+"   "+b+"   |  "+c+"   "+d+"   * " );
    System.out.printf("\n   *-------------------*  " );
    System.out.printf("\n    *   "+e+"    |    "+f+"   *   " );
    System.out.printf("\n     *---------------*    " );
    System.out.printf("\n      *      "+g+"      *     " );
    System.out.printf("\n       *-----*-----*      \n" );
    
   switch (g) {
     case 1:
       System.out.printf("\nYour personality: Independent.");
       break;
     case 2:
       System.out.printf("\nYour personality: Patient.");
       break;
     case 3:
       System.out.printf("\nYour personality: Creative.");
       break;
     case 4:
       System.out.printf("\nYour personality: Doer.");
       break;
     case 5:
       System.out.printf("\nYour personality: Artistic.");
       break;
     case 6:
       System.out.printf("\nYour personality: Helpful.");
       break;
     case 7:
       System.out.printf("\nYour personality: Lucky.");
       break;
     case 8:
       System.out.printf("\nYour personality: Efficient.");
       break;
     case 9:
       System.out.printf("\nYour personality: Peace.");
       break;
}
    
  }
}