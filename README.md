# TP-PileouFace

Aboutissement de nos deux semaines de cours de POO, notre intervenant nous a proposés plusieurs énoncés d'exercice pour expérimenter, nous améliorer sur nos compétences Java. Nous avions eu une initialisation Java d'une semaine + une semaine d'algorithmique auparavant. 

TP qui reprend beaucoup de notions apprises ces dernières semaines. 

## Enoncé

On organise un tournoi de Pile ou Face à Janzé, ville célèbre pour ses poulets. 

**Règles à suivre pour ce TP:**
  - Chaque membre ne peut être inscrit qu'une seule fois, pas de doublon. 
  - Pas d'inscription après le début du tournoi.
  - Les inscriptions se terminent dès que "Donald" s'inscrit
  - Une fois les inscriptions terminées, chaque participant joue, chacun son tour
  - pour jouer, un participant annonce "pile" ou "face", puis, la piece est lancée.
  - on conserve en mémoire le score de chaque joueur.
  - dès qu'un joueur atteint le score de 4 :
         > s'il reste des joueurs ce tour de jeu, ils peuvent jouer leur tour normalement
         > s'il ne reste aucun joueur, la partie est terminée
 
  - si la partie se termine avec plus d'un joueur ayant un score de 4, on entre en mode "Golden Coin" : 
        > chaque joueur joue a tour de role
        > chaque joueur qui perd est elimine, sauf si tous les joueurs perdent
        > le "Golden coin" se poursuit jusqu'a ce qu'il ne reste plus qu'un joueur en lice
  
->  A la fin du tournoi, le nom du joueur gagnant est annoncé
 
