package PracticeCodes;
import java.util.Scanner;

public class Practice5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a first number: ");
            int numerator = scanner.nextInt();
            
            System.out.print("Enter second number number: ");
            int denominator = scanner.nextInt();

            int result = numerator/denominator;
            System.out.println("Result of the division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter valid numbers.");
        }  
        catch(Exception ex){
            
        }
        
        finally {
            scanner.close();
        }
        
    }


   
}
