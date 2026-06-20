import java.util.Scanner;

public class tempconvertor {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("enter the temprature");
        temp = scanner.nextDouble();

        System.out.println("convert it into celcius or farenheit? (c or f)");
        unit=scanner.next();

        newTemp = (unit.equals("c") )?  (temp-32)*5/9 : (temp*9/5)+32;
    
    System.out.println(newTemp + "°" + unit);

scanner.close();
}

}
