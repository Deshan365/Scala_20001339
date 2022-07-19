

object Q3 extends App{
  def Vol(x: Double):Double={
    return 4/3*Math.PI*x*x*x;
  }
  printf("%.2f",Vol(5));
}