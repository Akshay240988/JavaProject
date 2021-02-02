package try_catch;

public class TryCatchDemo {
    public static void main(String[] args) {
        try{
            int i=10,j=0;
            int k=i/j;

            System.out.println(k);
            String s = null;
            int sle = s.length();
            System.out.println(sle);

        }catch(ArithmeticException ae){
            System.out.println("Arithmetic exception : "+ae);
        }
        catch (Exception e){
            System.out.println("exception : "+e);
        }

        System.out.println("Hello");
    }
}
