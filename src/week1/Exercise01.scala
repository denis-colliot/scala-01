package week1

/**
 * Created on 29/06/15.
 *
 * @author Denis Colliot (denis.colliot@zenika.com)
 */
object Exercise01 extends App {

  def pascal(col: Int, row: Int): Int = {

    if (row < 0 || col < 0 || col > row) {
      return 0
    }

    if (col == 0 || row == 0 || col == row) {
      return 1
    }

    return pascal(col - 1, row - 1) + pascal(col, row - 1)
  }

  println("Pascal: " + pascal(0, 2)) // 1
  println("Pascal: " + pascal(1, 2)) // 2
  println("Pascal: " + pascal(1, 3)) // 3
  println("Pascal: " + pascal(2, 4)) // 6

}
