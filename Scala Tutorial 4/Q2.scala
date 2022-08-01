import scala.io.StdIn._

object Q2 extends App {
    def main(args: Array[String]): Unit = {

        print("Enter Number: ")
        var x = readInt();

        x match {
        case x if x <= 0 => println("Number is Negative/Zero")

        case x if x%2==0 => println("Number is Even")

        case _ => println("Number is Odd")
       }
    }
}
