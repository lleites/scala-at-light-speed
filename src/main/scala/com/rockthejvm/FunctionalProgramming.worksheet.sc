val simpleIncrementer = new Function1[Int, Int] {
  override def apply(arg: Int): Int = arg + 1
}

simpleIncrementer(2)
simpleIncrementer.apply(2)

val doubler = (x: Int) => x * 2
doubler(1)

val aMappedList = List(1, 2, 3).map(_ + 1)

val flatList = List(1, 2, 3).flatMap(x => List(x, x * 3))

val filterList = List(1, 2, 3, 4, 5).filter(_ > 3)

val allPairs = List(1,2,3).flatMap(number => List("a","b","c").map(char => s"$char-$number"))

val forPairs = for {
  number <- List(1,2,3)
  letter <- List("a","b","c")
} yield(s"$number-$letter")
