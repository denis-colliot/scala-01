package week1

/**
 * Created on 29/06/15.
 *
 * @author Denis Colliot (denis.colliot@zenika.com)
 */
object Exercise02 extends App {

  def balance(chars: List[Char]): Boolean = {
    return balanceInner(chars, 0) == 0
  }

  def balanceInner(chars: List[Char], count: Int): Int = {

    if (chars.isEmpty) {
      return count
    }

    if (chars.head == '(') {
      return balanceInner(chars.tail, count + 1)

    } else if (chars.head == ')') {
      return balanceInner(chars.tail, count - 1)

    } else {
      return balanceInner(chars.tail, count)
    }
  }

  println("01: " + balance("(test)".toList))
  println("01: " + balance("(te(st)".toList))
  println("01: " + balance("(te(s)t)".toList))
  println("01: " + balance("(te(s)t".toList))
  println("01: " + balance("(te(s))t".toList))

}
