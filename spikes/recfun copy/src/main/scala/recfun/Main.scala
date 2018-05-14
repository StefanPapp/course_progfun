package recfun

object Main {
  def main(args: Array[String]) {
    /* println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    } */
    println (balance("(if (zero? x) max (/ 1 x))".toList))
    println (balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList))
    println (balance(":-)".toList))
    println (balance("())(".toList))
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int =
      if (r == c || c == 0 )
        1
      else
        pascal(c -1, r -1) + pascal(c, r-1)

  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def balance_iter(chars: List[Char], x: Int) : Int = {
        if (x < 0)
          -1
        else
        if (chars.isEmpty)
          x
        else
          chars.head match {
            case '(' => balance_iter(chars.tail, x+1)
            case ')' => balance_iter(chars.tail, x-1)
            case _ => balance_iter(chars.tail, x)
          }

      }
      balance_iter(chars: List[Char], 0) == 0
    }
  /**
   * Exercise 3
    * chars.isEmpty: Boolean returns whether a list is empty
chars.head: Char returns the first element of the list
chars.tail: List[Char] returns the list without the first element
    Hint: Think of the degenerate cases. How many ways can you give change for 0 CHF(swiss money)? How many ways can you give change for >0 CHF, if you have no coins?
   */
    def countChange(money: Int, coins: List[Int]): Int = {

      def iter(money: Int, coins: List[Int]) : Int = {
        if (money == 0)
          return 1
        else
          return 0
        for (row <- 0 to coins.length) {
           iter(money - )
        }

        def sub (balance: Int, coin: Int) :Int = {
          balance - coin
        }
        if (money == 0)
          1
        if (sub(money- coins.head, coins.head))

      }

      if (money < 1 || coins.isEmpty)
        0
      else
        iter(money, coins: List[Int]) + countChange(money, coins.tail)


    }

  }
