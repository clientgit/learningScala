package funsets

object Main extends App:

  import FunSets.*

  println("contains(singletonSet(1), 1): " + contains(singletonSet(1), 1))
  println("singletonSet(1)(1): " + singletonSet(1)(1))
  println("contains(singletonSet(1), 5): " + contains(singletonSet(1), 5))
  println("singletonSet(1)(5): " + singletonSet(1)(5))

  println("contains(union(x => x > 0, x => x < 0), 2): " + contains(union(x => x > 0, x => x < 0), 2))
  println("contains(union(x => x > 0, x => x < 0), -2): " + contains(union(x => x > 0, x => x < 0), -2))

  println("contains(filter(x => x > 0, y => y % 2 == 0), 9): " + contains(filter(x => x > 0, y => y % 2 == 0), 9))
  println("contains(filter(x => x > 0, y => y % 2 == 0), 10): " + contains(filter(x => x > 0, y => y % 2 == 0), 10))

  println("forall(x => x > -1001, y < 1001)): " + forall(x => x > -1001, y => y < 1000))
  println("forall(x => x > -1001, y <= 1000)): " + forall(x => x > 1, y => y <= 1))
  println("forall(x => x > -1001, y < 1000)): " + forall(x => x > -1001, y => y == 995))

  println("exists(x => x > 998, y => y >= 995): " + exists(x => x > 1, y => y == 995))
  println("exists(x => x > 998, y => y >= 995): " + exists(x => x > 1, y => y == 1001))

  println("map: " + map(x => x > -1001, y => y * 2)(3000))
  println("map: " + map(x => x > -1001, y => y * 2)(1500))
  println("map: " + map(x => x > -1001, y => y * 2)(2000))
  println("map: " + map(x => x > -1001, y => y * 2)(2001))
  val resMap = map(x => x > -1001, y => y * 2)(10)
  println(resMap)
  printSet(x => x == 995)