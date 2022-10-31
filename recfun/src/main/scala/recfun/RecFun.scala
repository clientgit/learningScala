package recfun

import scala.annotation.tailrec

object RecFun extends RecFunInterface:

  def main(args: Array[String]): Unit =
    println("Pascal's Triangle")
    for row <- 0 to 10 do
      for col <- 0 to row do
        print(s"${pascal(col, row)} ")
      println()

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if (c == 0 || r == c) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = chars match
    case Nil => false
    case first :: Nil => if first == ')' || first == '(' then false else true
    case head :: tail =>
      if head == '(' && tail.contains(')') then {
        val newChars: (List[Char], List[Char]) = tail.splitAt(tail.indexOf(')'))
        balance(newChars._1 ++ newChars._2.tail)
      }
      else balance(tail)


  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int =
    if (money == 0) return 1
    if (money < 0) return 0
    if (coins.tail.nonEmpty) countChange(money, coins.tail) + countChange(money - coins.head, coins)
    else countChange(money - coins.head, coins)
