package miniProjetInterne;
/**
* Un jeu de morpion sur un plateau 3x3
*/
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class Morpion extends Applet implements
		ActionListener 
		{Button cases[];
Button boutonNouvellePartie;
Label score;
int casesLibresRestantes = 9;
/**
* La m�thode init est comme un constructeur pour l'applet
*/
public void init() {
// Affecte le gestionnaire de disposition et la couleur
// de l'applet
this.setLayout(new BorderLayout());
this.setBackground(Color.CYAN);
// Passe la police de l'applet en style gras et taille 20
Font policeApplet = new Font("Monospaced", Font.BOLD, 20);
this.setFont(policeApplet);
// Cr�e le bouton Nouvelle partie et enregistre
// le r�cepteur d'actions aupr�s de lui
boutonNouvellePartie = new Button("Nouvelle partie");
boutonNouvellePartie.addActionListener(this);
// Cr�e deux panneaux et un label et les agence en
// utilisant le border layout
Panel panneauSup�rieur = new Panel();
panneauSup�rieur.add(boutonNouvellePartie);
this.add(panneauSup�rieur, "North");
Panel panneauCentral = new Panel();
panneauCentral.setLayout(new GridLayout(3, 3));
this.add(panneauCentral, "Center");
score = new Label("A vous de jouer !");
this.add(score, "South");
// Cr�e un tableau pour stocker les r�f�rences des
// 9 boutons
cases = new Button[9];
// Instancie les boutons, stocke leurs r�f�rences dans le
// tableau, enregistre le r�cepteur aupr�s d'eux, peint
// les boutons en orange et les ajoute au panneau central
for(int i = 0; i < 9; i++) {
cases[i]= new Button();
cases[i].addActionListener(this);
cases[i].setBackground(Color.ORANGE);
panneauCentral.add(cases[i]);
}
}
/**
* Cette m�thode traite tous les �v�nements d'action
* @param �v�nement l'�v�nement � traiter
*/
public void actionPerformed(ActionEvent �v�nement) {
Button leBouton = (Button) �v�nement.getSource();
// S'agit-il du bouton Nouvelle partie ?
if (leBouton == boutonNouvellePartie) {
for(int i = 0; i < 9; i++) {
cases[i].setEnabled(true);
cases[i].setLabel("");
cases[i].setBackground(Color.ORANGE);
}
casesLibresRestantes = 9;
score.setText("A vous de jouer !");
boutonNouvellePartie.setEnabled(false);
return; // Sort de la m�thode
}
String gagnant = "";
// S'agit-il de l'une des cases ?
for (int i = 0; i < 9; i++) {
if (leBouton == cases[i]) {
cases[i].setLabel("X");
gagnant = chercherUnGagnant();
if(!"".equals(gagnant)) {
terminerLaPartie();
} else {
coupOrdinateur();
gagnant = chercherUnGagnant();
if (!"".equals(gagnant)) {
terminerLaPartie();
}
}
break;
}
} // Fin de la boucle for
if (gagnant.equals("X")) {
score.setText("Vous avez gagn� !");
} else if (gagnant.equals("O")) {
score.setText("Vous avez perdu !");
} else if (gagnant.equals("T")) {
score.setText("Partie nulle !");
}
} // Fin de actionPerformed
/**
* Cette m�thode est appel�e apr�s chaque coup jou� pour
* voir s'il y a un gagnant. Elle v�rifie pour chaque ligne,
* colonne et diagonale, s'il y a trois symboles identiques
* @return "X", "O", "T" (termin�, partie nulle) ou "" (pas
* fini)
*/
String chercherUnGagnant() {
String leGagnant = "";
casesLibresRestantes--;
// V�rifie la ligne 1 - �l�ments 0, 1 et 2 du tableau
if (!cases[0].getLabel().equals("") &&
cases[0].getLabel().equals(cases[1].getLabel()) &&
cases[0].getLabel().equals(cases[2].getLabel())) {
leGagnant = cases[0].getLabel();
montrerGagnant(0, 1, 2);
// V�rifie la ligne 2 - �l�ments 3, 4 et 5 du tableau
} else if (!cases[3].getLabel().equals("") &&
cases[3].getLabel().equals(cases[4].getLabel()) &&
cases[3].getLabel().equals(cases[5].getLabel())) {
leGagnant = cases[3].getLabel();
montrerGagnant(3, 4, 5);
// V�rifie la ligne 3 - �l�ments 6, 7 et 8 du tableau
} else if (!cases[6].getLabel().equals("") &&
cases[6].getLabel().equals(cases[7].getLabel()) &&
cases[6].getLabel().equals(cases[8].getLabel())) {
leGagnant = cases[6].getLabel();
montrerGagnant(6, 7, 8);
// V�rifie la colonne 1 - �l�ments 0, 3 et 6 du tableau
} else if (!cases[0].getLabel().equals("") &&
cases[0].getLabel().equals(cases[3].getLabel()) &&
cases[0].getLabel().equals(cases[6].getLabel())) {
leGagnant = cases[0].getLabel();
montrerGagnant(0, 3, 6);
// V�rifie la colonne 2 - �l�ments 1, 4 et 7 du tableau
} else if (!cases[1].getLabel().equals("") &&
cases[1].getLabel().equals(cases[4].getLabel()) &&
cases[1].getLabel().equals(cases[7].getLabel())) {
leGagnant = cases[1].getLabel();
montrerGagnant(1, 4, 7);
// V�rifie la colonne 3 - �l�ments 2, 5 et 8 du tableau
} else if (!cases[2].getLabel().equals("") &&
cases[2].getLabel().equals(cases[5].getLabel()) &&
cases[2].getLabel().equals(cases[8].getLabel())) {
leGagnant = cases[2].getLabel();
montrerGagnant(2, 5, 8);

// V�rifie la premi�re diagonale - �l�ments 0, 4 et 8
} else if (!cases[0].getLabel().equals("") &&
cases[0].getLabel().equals(cases[4].getLabel()) &&
cases[0].getLabel().equals(cases[8].getLabel())) {
leGagnant = cases[0].getLabel();
montrerGagnant(0, 4, 8);
// V�rifie la seconde diagonale - �l�ments 2, 4 et 6
} else if (!cases[2].getLabel().equals("") &&
cases[2].getLabel().equals(cases[4].getLabel()) &&
cases[2].getLabel().equals(cases[6].getLabel())) {
leGagnant = cases[2].getLabel();
montrerGagnant(2, 4, 6);
} else if (casesLibresRestantes == 0) {
return "T"; // Partie nulle
}
return leGagnant;
}
/**
* Cette m�thode applique un ensemble de r�gles afin de
* trouver le meilleur coup pour l'ordinateur. Si un bon
* coup ne peut �tre trouv�, elle choisit une case au
* hasard.
*/
void coupOrdinateur() {
int caseS�lectionn�e;
// L'ordinateur essaie d'abord de trouver une case
// vide pr�s de deux case marqu�es "O" pour gagner
caseS�lectionn�e = trouverCaseVide("O");
// S'il n'y a pas deux "O" align�s, essaie au moins
// d'emp�cher l'adversaire d'aligner trois "X" en
// pla�ant un "O" pr�s de deux "X"
if (caseS�lectionn�e == -1) {
caseS�lectionn�e = trouverCaseVide("X");
}
// Si caseS�lectionn�e vaut toujours -1, essaie d'occuper
// la case centrale
if ((caseS�lectionn�e == -1)
&& (cases[4].getLabel().equals(""))) {
caseS�lectionn�e = 4;
}
// Pas de chance avec la case centrale non plus...
// Choisit une case au hasard
if (caseS�lectionn�e == -1) {
caseS�lectionn�e = choisirCaseAuHasard();
}
cases[caseS�lectionn�e].setLabel("O");
}

/**
* Cette m�thode examine chaque ligne, colonne et diagonale
* pour voir si elle contient deux cases avec le m�me label
* et une case vide.
* @param joueur "X" pour l'utilisateur ou "O" pour
* l'ordinateur
* @return num�ro de la case vide � utiliser ou le nombre
* n�gatif -1 si la recherche est infructueuse
*/
int trouverCaseVide(String joueur) {
int poids[] = new int[9];
for (int i = 0; i < 9; i++ ) {
if (cases[i].getLabel().equals("O"))
poids[i] = -1;
else if (cases[i].getLabel().equals("X"))
poids[i] = 1;
else
poids[i] = 0;
}
int deuxPoids = joueur.equals("O") ? -2 : 2;
// Regarde si la ligne 1 a 2 cases identiques et une vide
if (poids[0] + poids[1] + poids[2] == deuxPoids) {
if (poids[0] == 0)
return 0;
else if (poids[1] == 0)
return 1;
else
return 2;
}
// Regarde si la ligne 2 a 2 cases identiques et une vide
if (poids[3] + poids[4] + poids[5] == deuxPoids) {
if (poids[3] == 0)
return 3;
else if (poids[4] == 0)
return 4;
else
return 5;
}

// Regarde si la ligne 3 a 2 cases identiques et une vide
if (poids[6] + poids[7] + poids[8] == deuxPoids) {
if (poids[6] == 0)
return 6;
else if (poids[7] == 0)
return 7;
else
return 8;
}
// Regarde si la colonne 1 a 2 cases identiques et une vide
if (poids[0] + poids[3] + poids[6] == deuxPoids) {
if (poids[0] == 0)
return 0;
else if (poids[3] == 0)
return 3;
else
return 6;
}
// Regarde si la colonne 2 a 2 cases identiques et une vide
if (poids[1] + poids[4] + poids[7] == deuxPoids) {
if (poids[1] == 0)
return 1;
else if (poids[4] == 0)
return 4;
else
return 7;
}
// Regarde si la colonne 3 a 2 cases identiques et une vide
if (poids[2] + poids[5] + poids[8] == deuxPoids) {
if (poids[2] == 0)
return 2;
else if (poids[5] == 0)
return 5;
else
return 8;
}
// Regarde si la diagonale 1 a 2 cases identiques et une
// vide
if (poids[0] + poids[4] + poids[8] == deuxPoids) {
if (poids[0] == 0)
return 0;
else if (poids[4] == 0)
return 4;
else
return 8;
}

// Regarde si la diagonale 2 a 2 cases identiques et une
// vide
if (poids[2] + poids[4] + poids[6] == deuxPoids) {
if (poids[2] == 0)
return 2;
else if (poids[4] == 0)
return 4;
else
return 6;
}
// Il n'y a pas de cases align�es identiques
return -1;
} // Fin de trouverCaseVide()
/**
* Cette m�thode s�lectionne une case vide quelconque.
* @return un num�ro de case choisi au hasard
*/
int choisirCaseAuHasard() {
boolean caseVideTrouv�e = false;
int caseS�lectionn�e = -1;
do {
caseS�lectionn�e = (int) (Math.random() * 9);
if (cases[caseS�lectionn�e].getLabel().equals("")) {
caseVideTrouv�e = true; // Pour terminer la boucle
}
} while (!caseVideTrouv�e);
return caseS�lectionn�e;
} // Fin de choisirCaseAuHasard()
/**
* Cette m�thode affiche la ligne gagnante en surbrillance.
* @param gagnante1 premi�re case � montrer.
* @param gagnante2 deuxi�me case � montrer.
* @param gagnante3 troisi�me case � montrer.
*/
void montrerGagnant(int gagnante1, int gagnante2, int
gagnante3) {
cases[gagnante1].setBackground(Color.CYAN);
cases[gagnante2].setBackground(Color.CYAN);
cases[gagnante3].setBackground(Color.CYAN);
}
// D�sactive les cases et active le bouton Nouvelle partie
void terminerLaPartie() {
boutonNouvellePartie.setEnabled(true);
for (int i = 0; i < 9; i++) {
cases[i].setEnabled(false);
}
}
} // Fin de la classe