def balance(chars: List[Char]): Boolean =
  println("head: " + chars.head.toString + " tail: " + chars.tail.mkString(", "))
  chars match {
    case Nil => false
    case first :: Nil => if first == ')' || first == '(' then false else true
    case head :: tail =>
      if head == '(' && tail.contains(')') then {
        val newChars: (List[Char], List[Char]) = tail.splitAt(tail.indexOf(')'))
        balance(newChars._1 ++ newChars._2.tail)
      }
      else balance(tail)
  }

val l1 = List('s', '(', '8', 'p','=', '(', ')', ')', 'f')
val l2 = ":-)".toList
balance(l2)
//someTails.sorted
//List(1, 2, 4) ++ List(22,34)



