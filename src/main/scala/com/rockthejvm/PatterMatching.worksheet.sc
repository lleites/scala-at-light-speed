val anInteger = 55

val order = anInteger match {
  case x if x % 2 == 0 => 1
  case x if x % 2 == 1 => 2
}

case class Person(name: String, age: Int)
val bob = Person("Bob", 43)

val personGreeting = (person: Person) =>
  person match {
    case Person(n, a) => s"I am $n, my age is $a"
  }

personGreeting(bob)

val aTuple = ("Bon Jovi", "Rock")

val aList = List(1, 2, 3)

def containsTwo(list: List[Int]): Boolean = {
  list match {
    case head :: 2 :: tail => true
    case _                 => false
  }
}

containsTwo(List(1, 3, 4, 2, 6, 7, 8, 8, 8, 8))
