# Class Etudiant

```scala
package entities

class Etudiant(val matricule: String,
               val nom:String,
               val prenom : String,
               var age:Int,
               var classe:String,
               var montant:Double = 0) {

  def afficherMontant() = println(s"Le montant est $montant")
  def payerMensualite(tranche:Double) = montant+=tranche

  def afficherEtudiant(): Unit ={
    println(s"Matricule est :$matricule nom: $nom prenom: $prenom agée de $age")
    println(s"classe $classe")
    println("*************************************************************")
  }
}

````

# La méthode Main
```scala
import entities.Etudiant

object Main {
  def main(args: Array[String]): Unit = {
    val etudiant1: Etudiant = new Etudiant("Co1","Diop","Cheikh Tidiane",28,"Master1",120000)
    val etudiant2: Etudiant = new Etudiant("Co02","Seye","Baye Ndemba",28,"Master1",120000)
    etudiant1.payerMensualite(120000)
    etudiant1.afficherMontant()
    etudiant1.afficherEtudiant()
  }

}

```


