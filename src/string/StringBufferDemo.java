package string;

public class StringBufferDemo {
    public static void main(String[] args) {

        String s1 = "Codekul";
        StringBuffer stringBuffer = new StringBuffer(s1);
        System.out.println(stringBuffer);
        //System.out.println("Reverse=>"+stringBuffer.reverse());
        //System.out.println("Substring=>"+stringBuffer.substring(2,4));
       // System.out.println("Insert=>"+stringBuffer.insert(5,"MU"));
        //System.out.println("Append=>"+stringBuffer.append("Pune"));
        //System.out.println("Replace=>"+stringBuffer.replace(3,6,"ON"));

        StringBuilder stringBuilder = new StringBuilder(s1);
        //System.out.println("Append=>"+stringBuilder.append("Mumbai"));
        System.out.println(stringBuilder);
    }
}
