package problem1

/**
 * If we list all the natural numbers below 10 that are multiples 
 * of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
object Problem1 extends App {

  def sum3sAnd5s(max : Int) : Int = {
    var sum = 0;
    for (i <- 1 to max) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    sum
  }
  
  println(sum3sAnd5s(1000))
}