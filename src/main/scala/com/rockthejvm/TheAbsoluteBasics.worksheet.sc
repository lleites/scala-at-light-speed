val meaningOfLife: Int = 42

val aBoolean = false

val aComposedString = "I" + " " + "Love"

val anInterpolation = s"The meaning $meaningOfLife"

val anExpression = 2 + 3

val ifExpression = if (meaningOfLife > 43) 56 else 999

val aCodeBlock = {
  val aLocalValue = 67

  aLocalValue + 3
}

def myFunction(x: Int, y: String): String = y + " " + x

def myFunction2(x: Int, y: String): String = { y + " " + x }

def factorial(n: Int): Int =
  if (n <= 1) 1
  else n * factorial(n - 1)


def myUnit() : Unit = {
    ()
}