

object Q4 extends App{
  def cost(n: Integer):Double=n*24.95;
  def discount(cost: Double):Double=cost*0.4;
  def shipping(n: Double):Double={
    n>50 match{
       case true => 3.0 +(n-50)*0.75;
       case false => 3.0; 
    }
    var total:Double=0;
    total=cost(60)-discount(cost(60))+shipping(60): Double;
    printf("%.2f",total);  
  } 
}