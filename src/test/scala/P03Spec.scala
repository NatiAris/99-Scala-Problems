package org.p99.scala

import org.scalatest._

class P03Spec extends UnitSpec {

  import P03._

  val exampleList = List(1, 1, 2, 3, 5, 8)

  "nth" should "return 2 for List(1, 1, 2, 3, 5, 8)" in {
    val n = 2
    assert(nth(n, exampleList) == exampleList(n))
  }

  "nth" should "return first element correctly" in {
    assert(nth(0, exampleList) == exampleList.head)
  }

  "nth" should "return last element correctly" in {
    assert(nth(exampleList.length - 1, exampleList) == exampleList.last)
  }

  "nth" should "throw IndexOutOfBoundsException" in {
    assertThrows[IndexOutOfBoundsException](nth(exampleList.length, exampleList))
  }

  it should "throw IllegalArgumentException for negative n" in {
    assertThrows[IllegalArgumentException](nth(-1, exampleList))
  }

}
