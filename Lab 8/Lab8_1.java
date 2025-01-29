public class Lab8_1 {
    public static void main(String[] args){
       
    try{
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        int ans=1;
        for(int i=0;i<y;i++){
            ans=ans*x;
            System.out.println(ans);

        }
    }
    catch(NumberFormatException e)
{
System.out.println("Number Format Error..!!");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("array index out of bound");
}
catch(ArithmeticException e)
{
    System.out.println("arithmetic exception");
}
catch(Exception e)
{
    System.out.println("exception");
}

}
}