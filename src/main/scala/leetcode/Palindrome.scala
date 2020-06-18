package leetcode

/**
 * 回文数判断，如：121为回文数，123非回文数
 */
object Palindrome {
  def isPalindrome(x: Int): Boolean = {
    var k = x
    if (k < 0)
      false
    else if (k >= 0 && k < 10){
      true
    } else {
      var res = 0
      var flag = 0
      while (k > 0) {
        res = (res * 10) + (k % 10)
        k = k / 10
        flag = flag + 1
      }

      println(s"res = $res")
      if (res == x)
        true
      else
        false
    }
  }

  def main(args: Array[String]): Unit = {
    println(isPalindrome(121))
  }
}
