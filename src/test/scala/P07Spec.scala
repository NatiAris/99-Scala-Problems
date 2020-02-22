package org.p99.scala

import org.scalatest._

class P07Spec extends UnitSpec {

  import P07._

  "flatten" should "work for the example list" in {
    assertResult(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))(List(1, 1, 2, 3, 5, 8))
  }

  it should "return Nil if passed Nil" in {
    assertResult(flatten(Nil))(Nil)
  }

  it should "return the list itself if the list is flat" in {
    assertResult(flatten(List(1, 2, 3, 4)))(List(1, 2, 3, 4))
  }

}
