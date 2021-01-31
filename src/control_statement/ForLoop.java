package control_statement;

public class ForLoop {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,8,9};

        //print array elements using for loop
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

        //print array elements in reverse order
        for(int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }


//nested for loop


        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        //enhanced for loop
        for (int i:arr) {
            System.out.println(i);
        }

        for(int i=1;i<=10;i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(" "+i * j+" ");
            }
            System.out.println();
        }

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }

        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
