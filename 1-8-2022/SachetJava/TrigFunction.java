import java.util.*;

public class TrigFunction implements Derivative {
  private TrigType trigType;
  private int firstCoefficent;
  private int secondCoefficent;
  
  public TrigFunction(String trigType, int A, int B){
    firstCoefficent = A;
    secondCoefficent = B;
    switch (trigType) {
      case "C":
        this.trigType = TrigType.COSINE;
        break;
      case "S":
        this.trigType = TrigType.SINE;
        break;
    }
  }

  public double evaluateAt(double x){
    switch(trigType) {
      case COSINE:
        return firstCoefficent * Math.cos(secondCoefficent * x);
      case SINE:
        return firstCoefficent * Math.sin(secondCoefficent * x);
    }
    return 1.0;
  }

  @Override
  public void takeDerivative(){
    switch(this.trigType) {
      case COSINE:
        this.trigType = TrigType.SINE;
        this.firstCoefficent *= -1 * secondCoefficent;
        break;
      case SINE:
        this.trigType = TrigType.COSINE;
        this.firstCoefficent *= secondCoefficent;
        break;
    }
  }
}

enum TrigType{
  COSINE,
  SINE,
}