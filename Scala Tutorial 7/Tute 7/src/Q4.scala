

object Q3 extends App {
    class Account(x:Int, y:Int){
        var accNo = x;
        var bal = y;

        def pri() = {
            println("Account # " + accNo + " balance = "+bal)
        }
    }

    def transfer(n:Account, m:Account, amount:Int) ={
        n.bal = n.bal - amount;
        m.bal = m.bal + amount;

        println("transfering amount: " + amount)
        n.pri();
        m.pri();
    }

    def main(args:Array[String]) ={
        val from = new Account(1,300);
        val to = new Account(2,150);
        println("transfer from account " + from.accNo + ", balance: " + from.bal + " to "+ to.accNo + ",balance: " + to.bal)
        transfer(from, to,55);
    }
}