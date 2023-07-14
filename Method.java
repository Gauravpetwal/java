import java.security.spec.EncodedKeySpec;

import javax.lang.model.util.ElementScanner14;

//METHOD OF JAVA
public class Method
{
    static void mymethod()
    {
        System.out.println("This is method ");
    }

    static void met(int a)
    {
        if(a<18)
        {
           System.out.println("Able to voting");
        }
    else
          {
            System.out.println("not able to voting");
            

            }
        }
    public static void main(String[] args)
    {
        mymethod();
        met(22);
    }

}
