package org.p99.scala

import org.scalatest._

class P04Spec extends UnitSpec {

  import P04._

  "length" should "be zero for an empty list" in {
    assert(length(Nil) == 0)
  }

  "length" should "be one for a single-element list" in {
    assert(length(1 :: Nil) == 1)
  }

  "length" should "work correctly for a six-element list" in {
    assert(length(List(1, 1, 2, 3, 5, 8)) == 6)
  }

}

