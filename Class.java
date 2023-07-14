public class Class
{
    int x;    
    String name;
    public Class(int age , String fname)
    {
       x=age;
       name=fname;
          
    }
public static void main(String[] args) 
 {
    Class obj =new Class(20 ,"Gaurav");
   
    System.out.println("age  "+ obj.x +"\nName "+obj.name);
    
}
    

}

