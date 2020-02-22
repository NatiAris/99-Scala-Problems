package org.p99.scala

import java.util.NoSuchElementException

import scala.annotation.tailrec

object P02 {

  @tailrec
  def penultimate[A](l: List[A]): A = l match {
    case Nil | _ :: Nil => throw new NoSuchElementException
    case x :: _ :: Nil => x
    case _ :: t => penultimate(t)
  }

}
