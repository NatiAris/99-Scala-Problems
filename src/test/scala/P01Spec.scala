package org.p99.scala

import org.scalatest._

class P01Spec extends UnitSpec {

  import P01._

  "last(List(1, 1, 2, 3, 5, 8))" should "return 8" in {
    assert(last(List(1, 1, 2, 3, 5, 8)) == 8)
  }

  "last(List(\"test\"))" should "return \"test\"" in {
    assert(last(List("test")) == "test")
  }

  "last(Nil)" should "throw NoSuchElementException" in {
    assertThrows[NoSuchElementException](last(Nil))
  }

}
