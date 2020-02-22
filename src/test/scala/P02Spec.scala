package org.p99.scala

import org.scalatest._

class P02Spec extends UnitSpec {

  import P02._

  "penultimate(List(1, 1, 2, 3, 5, 8))" should "return 5" in {
    assert(penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
  }

  "penultimate" should "work correctly for a two-element list" in {
    assert(penultimate(List(1, 2)) == 1)
  }

  "penultimate" should "throw NoSuchElementException for a single-element list" in {
    assertThrows[NoSuchElementException](penultimate(List(1)))
  }

  "penultimate" should "throw NoSuchElementException for an empty list" in {
    assertThrows[NoSuchElementException](penultimate(Nil))
  }

}

