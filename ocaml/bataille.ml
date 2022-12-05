type couleur = Coeur | Trefle | Pique | Carreau
type point = C2 | C3 | C4 | C5 | C6 | C7 | C8 | C9 | C10
type figure = V | D | R | A
type valeur = Point of point | Figure of figure
type carte = valeur * couleur
type carte' = Joker | Simple of carte
