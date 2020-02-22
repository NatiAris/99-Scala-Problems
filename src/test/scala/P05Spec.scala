package org.p99.scala

import org.scalatest._

class P05Spec extends UnitSpec {

  import P05._

  "reverse" should "handle an empty list" in {
    assert(reverse(Nil) == Nil)
  }

  "reverse" should "handle a single-element list" in {
    assert(reverse(List(1)) == List(1))
  }

  "reverse" should "handle a six-element list" in {
    assert(reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
  }

}
