# UNO

Le but du projet semble de permettre de représenter une table de jeu de carte. 

Chaque classe représente un élément des participants du jeu. 
- Card : représente une carte de jeu (couleur et valeur)
- Hand : représente la main d'un joueur (ensemble de cartes)
- Player : représente un joueur (nom, main et table à laquelle il est assi)
- Table : représente la table de jeu (ensemble de joueurs, le joueur a avoir joué en dernier (lastPlayed) et un "LastPlayedCardProvider" qui permet de récupérer la dernière carte jouée)
- Deck : représente le jeu de carte (deux listes de cartes : celles déja jouée et celles de la pioche.) Le Deck est un LastPlayedCardProvider ; il peut signaler la dernière carte jouée.