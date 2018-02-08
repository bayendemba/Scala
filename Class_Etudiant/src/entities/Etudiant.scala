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





//private var nom: String
//private val prenom: String
//private var age: Int
//private var classe: String
//private var montant: Double = 0
/*
  def getNom() = nom
  def setNom(name: String) = nom = name
  def getAge() = age
  def setAge(lage: Int) = age = lage
  def getClasse() = classe
  def setClasse(laclasse: String) = classe = laclasse
  def payerMensualite(tranche: Double) = montant += tranche
  */