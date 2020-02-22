package org.p99.scala

import scala.annotation.tailrec

object P05 {

  def reverse[A](l: List[A]): List[A] = {
    @tailrec
    def go(remaining: List[A], acc: List[A]): List[A] = remaining match {
      case Nil => acc
      case x :: Nil => x :: acc
      case h :: t => go(t, h :: acc)
    }

    go(l, Nil)
  }

}
