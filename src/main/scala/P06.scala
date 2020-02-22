package org.p99.scala

object P06 {

  import P05.reverse

  def isPalindrome[A](l: List[A]): Boolean = l == reverse(l)

}
