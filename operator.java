
// OPERATOR IN JAVA

public class operator
{
    public static void main(String[] args)
    {
        int x=12,a=34,b=56,c=45;
        int sum=a+c;
        int sub=a-x;
        int mul=a*b;
        int div=45/9;
        System.out.println("operators");
        System.out.println("Arithmetic operator");
        System.out.println("by plush operator:" + sum);
        System.out.println("by subtract operator:" +sub);
        System.out.println("by multiplication  operator:" + mul);
        System.out.println("by divide operator:" + div);

        //shift operator

        System.out.println("\nshift operator");
        System.out.println(3<<2);
        System.out.println(3>>2);
        System.out.println(3<<2);
        System.out.println(3>>2);

        //bitwise operator

        System.out.println("\nBitwise operator");
        System.out.println(a<b);
        System.out.println(b>c);

       // Assignment Operators

        System.out.println(" \nAssignment Operators");
        int A = 10;
        System.out.println("equals to assignment operator operator A="+A);

        int B=44;
        B /=2;
        System.out.println("divide assignment operator B/="+B);

        int C =55;
        C+=34;

        System.out.println("addition assignment operator C+="+C);

        int D=45;
        D*=9;
        System.out.println("multiplication assignment operator D*=" + D);

        int E=45;
        E-=78;
        System.out.println("subtract assignment operator E-=" + E);
s

        //Logical Operators
        System.out.println("\nLogical Operators");
        //logical and operator
        int X=56;
        System.out.println("Logical and (&&) Operators");
        System.out.println( X>18 && X<60);

        //logical "or" operator
        System.out.println("logical \"or\" operator");
        System.out.println(X<23 && X>78);

        //logical "not" operator
        System.out.println("logical \"not\" operator");
        System.out.println(X!=45);




    }


}
