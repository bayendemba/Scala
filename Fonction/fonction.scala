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

/*
  def addition(x: Int, y: Int) = x + y

  def soustraction(x: Int, y: Int) = x - y

  def multiplication(x: Int, y: Int) = x * y

  def division(x: Int, y: Int) = x / y
} 

///////////////////////////////////////////////////////////////////////////::
println("Votre note")
var note : Int = scala.io.StdIn.readInt()

note match  {
  case note<10&&note>=0 => println("Vous n'avez pas la moyenne")
  case note>=10 &&note<12 => println("Passable")
  case note>12 &&note<14 => println("Assez bien")
  case note>=14&&note<20 => println("Tres bien")
  case _ => println("Veillez renseigner une note correcte")
}
*/
/*
var i :Int =0

while(i<5){
  println("Saisir une note")
  i= scala.io.StdIn.readInt()
  println("La note est "+i.toString+" car in strictement inferieur à 5")// tres important
  i = i+1
}
*/
/*
var i :Int =0

for(i<-0 to 5){  
  println("La note est "+i)  
}
*/
/*
val classe:Int =0
for(classe<-1 to 9)
  println("On est en classe de Scala "+classe)
*/
