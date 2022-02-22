import scala.util.Try

lazy val aLazyValue = {
  println("Lazinessssssss")
  43
}

aLazyValue

def methodCanReturnNull(): String = "hello, Scala"

val anOption = Option(methodCanReturnNull())

anOption match {
  case Some(result) => result
  case None         => 0
}

def expectionThrower() = throw new RuntimeException()
val aTry = Try(expectionThrower())
