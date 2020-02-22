package org.p99.scala

import scala.annotation.tailrec

object P01 {

  @tailrec
  def last[A](l: List[A]): A = l match {
    case Nil => throw new NoSuchElementException
    case h :: Nil => h
    case _ :: t => last(t)
  }

}
