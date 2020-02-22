package org.p99.scala

object P07 {

  def flatten(lists: List[Any]): List[Any] = {
    @scala.annotation.tailrec
    def go(remaining: List[Any], acc: List[Any]): List[Any] = remaining match {
      case Nil => acc.reverse
      case Nil :: t => go(t, acc)
      case (h :: t) :: tt => go(h :: t :: tt, acc)
      case h :: t => go(t, h :: acc)
    }

    go(lists, Nil)
  }

  /*
   * Suggested solution
   */
  //  def flatten(ls: List[Any]): List[Any] = ls flatMap {
  //    case ms: List[_] => flatten(ms)
  //    case e => List(e)
  //  }
  //

}
