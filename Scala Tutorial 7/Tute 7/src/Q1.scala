

object Q1 extends App{
  val x= new Rational(1, 2)
  val y= new Rational(3,4)
  
  class Rational(x: Int, y: Int) {
    def numer = x
    def denom = y
    
    def add (r : Rational) =
     new Rational (numer * r.denom + r.numer * denom, denom * r.denom)
    
    override def toString = numer + "/" + denom
    }
}