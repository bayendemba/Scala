object Principal {

  import scala.io.StdIn.readInt

  def main(args: Array[String]): Unit = {
    var unNombre = 0
    do {
      println("Faite votre choix")
      println("1: Mafé")
      println("2: Damada")
      println("3: Soupou Kandia")

      val variable: Int = readInt()

      println("Voulez vous continuer 1=>Oui | 0=> Non")
      unNombre = readInt()

      variable match {
        case 1 => println("Votre plat est mafé ")
        case 2 => println("Dama ")
        case 3 => println("Soupou kandia ")
        case _ => println("Choix non prise en compte")
      }
    } while (unNombre != 0)
  }

}
