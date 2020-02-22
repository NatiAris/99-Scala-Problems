package org.p99.scala

import scala.annotation.tailrec

object P04 {

  def length[A](l: List[A]): Int = {
    @tailrec
    def go(remaining: List[A], acc: Int): Int = remaining match {
      case Nil => acc
      case _ :: t => go(t, acc + 1)
    }

    go(l, 0)
  }

}
