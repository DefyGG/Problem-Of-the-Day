import java.util.*;

public class TaylorSeries{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter 0 for sine or 1 for cosine: ");
    int functionType = sc.nextInt();
    while(functionType != 1  && functionType != 0){
      System.out.println("Invalid input, please try again: ");
      functionType = sc.nextInt();
      System.out.println(functionType);
    }

    String funcType = "C";
    if(functionType == 1){
      funcType = "C";
    } else{
      funcType = "S";
    }

    System.out.println("The first coefficent of your function is ->A * f(B * x) \nPlease enter that coefficent: ");
    int firstCoefficent = sc.nextInt();
    System.out.println("The second coefficent of your function is A * f(->B * x) \nPlease enter that coefficent: ");
    int secondCoefficent = sc.nextInt();
    System.out.println("Please enter the degree to which you would like your Taylor polynomial to be: ");
    int degree = sc.nextInt();
    TrigFunction toBeTailored = new TrigFunction(funcType, firstCoefficent, secondCoefficent);
    
    double[] coefficents= new double[degree + 1];
    coefficents[0] = toBeTailored.evaluateAt(0) / factorial(0);
    for(int i = 0; i < degree; i++){
      toBeTailored.takeDerivative();
      coefficents[i+1] = toBeTailored.evaluateAt(0) / factorial(i + 1);
    }

    String taylorPolynomial = "";
    int c = 0;
    for(double d : coefficents){
      if(d != 0)
        taylorPolynomial += " + " + d + (c > 0 ? "x" : "") + (c > 1 ? " ^ " + c : "");
      c++;
    }
    System.out.println(taylorPolynomial.substring(3));
  }
  
  public static int factorial(int n){    
    if (n == 0)    
      return 1;    
    else    
      return(n * factorial(n-1));    
  }   
}