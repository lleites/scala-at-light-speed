class Animal {
  val age: Int = 0

  def eat() = println("I am eating")

}

val anAnimal = new Animal

class Dog(name: String) extends Animal

val aDog = new Dog("Lassie")

aDog.eat()

trait Carnivore {
  def eat(animal: Animal): Unit
}

class Crocodile extends Animal with Carnivore {
  def eat(animal: Animal): Unit = print(s"Eating an ${animal.age} ")

}

val aCroc = new Crocodile
aCroc eat aDog

object MySingleton {
  val mySpecialValue = 1234
  def mySpecialMethod(): Int = 5322

  def apply(x: String): Unit = println(x)

}

MySingleton("Gelou")

case class Person(name: String, age: Int)

Person("bob", 36)

try {
  val nulo = null
  Integer.parseInt(nulo)
} catch {
  case _ => "cuac"
}

abstract class MyList[T] {
  def head: T
  def tail: MyList[T]
}
