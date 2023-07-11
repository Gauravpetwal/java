                  //LOOPS in java
public class LOOPS

{
    public static void main(String[] args)
    {
        //while loopd
        int i=0;
        System.out.println("while loop");
        while(i<=10)
        {
            System.out.println(i);
            i++;
        }

        //for loop
        System.out.println("for loop");
        for(int j=11; j<=20; j++)
        {
            System.out.println(j);
        }

        //do while loop
        System.out.println("do while loop");
        int k=21;
        do
        {
            System.out.println(k);
            k++;
        }while(k<=30);


        //for each loop
        System.out.println("for each loop:");
        int[] num={1,2,3,4,5,};
        for(int n:num)
        {
            System.out.println(n);
        }


    }

}
