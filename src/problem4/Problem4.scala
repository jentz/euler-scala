package problem4

/**
 * A palindromic number reads the same both ways. The largest palindrome 
 * made from the product of two 2-digit numbers is 9009 = 91 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
object Problem4 extends App {

  def isPalindrome(x: Int, y: Int) : Boolean = {
    val forward = (x * y).toString()
    //println("Checking " + x + " * " + y + " = " + (x * y))
    return forward == forward.reverse
  }
  
  

  def findHighestPalindrome(max: Int) : Int = {
    var highest = 0
    var continue = true
    for (x <- 100 to max) {
      for (y <- 100 to max) {
        if (isPalindrome(x, y)) {
          val palindrome = x * y
          //println("Found " + x + " * " + y + " = " + palindrome)
          if (palindrome > highest) {
            highest = palindrome;
          }
        }
      }
    }
    highest
  }

  println(findHighestPalindrome(999))
}