object Principal {

  def main(args: Array[String]): Unit = {
    //println("Le resultat " + addition(3, 4))
    println("Faite votre choix")
    println("1: Addition")
    println("2: Multiplication")
    println("3: Division")
    println("4: Soustraction")
    var i: Int = scala.io.StdIn.readInt() // ou bien on l importe
    println("Votre choix est: " + i.toString)


    println("Entrer le premier entier")
    var a: Int = scala.io.StdIn.readInt()
    println("Entrer le second entier")
    var b: Int = scala.io.StdIn.readInt()

    i match {
      case 1 => println("L'adition est : " + addition(a, b))
      case 2 => println("La Soustraction: " + soustraction(a, b))
      case 3 => println("La multiplication: " + multiplication(a, b))
      case 4 => println("La division: " + division(a, b))
      case _ => println(" Choix non prise en compte")
    }
  }

  /*
  def question(x: Int): String = x match {
  case 1 => "1"
  case 2 => "2"
  case 3 => "3"
  case 4 => "4"
  case _ => "non prise en charge"
}
   */

  def addition(x: Int, y: Int) = x + y

  def soustraction(x: Int, y: Int) = x - y

  def multiplication(x: Int, y: Int) = x * y

  def division(x: Int, y: Int) = x / y
}


/*
Gestion d un restaurant en Scala
Plat du jours
 */
