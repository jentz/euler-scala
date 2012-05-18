package problem3

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
object Problem3 extends App {

//  def isPrime(n: Int): Boolean = {
//    if (n <= 1) {
//      return false
//    }
//    if (n == 2) {
//      return true
//    }
//    if (n % 2 == 0) {
//      return false
//    }
//    var i = 3L
//    var max = (Math.sqrt(n) + 1).round
//    while (i <= max) {
//      if (n % i == 0) {
//        return false
//      }
//      i += 2
//    }
//    return true
//  }

  def divides(d: Long, n: Long) = {
    (n % d) == 0
  }

  def ld(n: Long): Long = {
    ldf(2, n)
  }

  def ldf(k: Long, n: Long): Long = {
    if (divides(k, n)) {
      k
    }
    else if ((k * k) > n) {
      n
    }
    else {
      ldf((k + 1), n)
    }
  }

  def factors(n: Long): List[Long] = n match {
    case 1 => Nil;
    case _ => {
      val p = ld(n)
      p :: factors(n / p)
    }
  }

  println(factors(600851475143L))
}