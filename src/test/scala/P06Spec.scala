package org.p99.scala

import org.scalatest._

class P06Spec extends UnitSpec {

  import P06._

  "isPalindrome" should "treat an empty list as a palindrome" in {
    assert(isPalindrome(Nil))
  }

  it should "treat a single-element list as a palindrome" in {
    assert(isPalindrome(List(1)))
  }

  it should "return false for List(1, 2)" in {
    assert(!isPalindrome(List(1, 2)))
  }

  it should "return true for List(1, 2, 3, 2, 1)" in {
    assert(isPalindrome(List(1, 2, 3, 2, 1)))
  }

}

