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
