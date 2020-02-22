package org.p99.scala

import scala.annotation.tailrec

object P03 {

  @tailrec
  def nth[A](n: Int, l: List[A]): A = n match {
    case n if n < 0 => throw new IllegalArgumentException
    case 0 => l.headOption.getOrElse { throw new IndexOutOfBoundsException }
    case n => nth(n - 1, l.tail)
  }

}
