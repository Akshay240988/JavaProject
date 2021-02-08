package exception_handling;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsDemo {
    public static void main(String[] args) throws IOException, SQLException {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.validate(15);
    }

    private void validate(int i) throws IOException,SQLException{
        if(i<18){
            throw new IOException("you cannot vote");
        }else{
            throw new SQLException(" in a");
        }
    }
}
