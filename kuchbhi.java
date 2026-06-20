import java.util.Scanner;
public class kuchbhi {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        char symbol;
        int rows ;
        int column;

        System.out.print("enter the number of columns");
        column = scanner.nextInt();

        System.out.print("enter the numbers of rows");
        rows = scanner.nextInt();

        System.out.print("enter the symbol");
        symbol=scanner.next().charAt(0);

        for(int i =0; i<rows ;i++){
            for (int j = 0 ; j< column ;j++){
                System.out.print(symbol);
            }
                System.out.println("");
            
        }
        scanner.close();
    
    }
    
}
