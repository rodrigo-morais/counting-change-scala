package recfun

object Main {
  def main(args: Array[String]) {
    println("Money is 4 to coins 1,2. The count change is: " + countChange(4, List(1, 2)))
    println("Money is 4 to coins 1,2,3. The count change is: " + countChange(4, List(1, 2, 3)))
  }
  
  def countChange(money: Int, coins: List[Int]): Int = {
    if(money < 0) 0
    else if(coins.isEmpty)
      if(money == 0) 1 else 0
    else
      countChange(money, coins.tail) + countChange(money - coins.head, coins)
  }
}