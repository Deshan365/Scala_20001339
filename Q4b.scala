import scala.io.StdIn.readInt;

object Q4b extends App{
  def attendees(price:Int):Int=120+(15-price)/5*20
  def revenue(price:Int):Int = attendees(price)*price
  def cost(price:Int):Int=500 + 3*attendees(price)
  def profit(price:Int):Int = revenue(price)- cost(price)
  
  println("Enter the ticket price:");
  var a = readInt()
  println("Proft for ticket price Rs." + a + " is: Rs."+profit(a));
  
}