type couleur = Coeur | Trefle | Pique | Carreau
type point = C2 | C3 | C4 | C5 | C6 | C7 | C8 | C9 | C10
type figure = V | D | R | A
type valeur = Point of point | Figure of figure
type carte = valeur * couleur
type carte' = Joker | Simple of carte

let nombre x =
  match x with
  | Joker -> 15
  | Simple s ->
    match s with
    | valeur, _couleur ->
      match valeur with
      | Point C2 -> 2
      | Point C3 -> 3
      | Point C4 -> 4
      | Point C5 -> 5
      | Point C6 -> 6
      | Point C7 -> 7
      | Point C8 -> 8
      | Point C9 -> 9
      | Point C10 -> 10
      | Figure V -> 11
      | Figure D -> 12
      | Figure R -> 13
      | Figure A -> 14

let (<<) c c' = nombre c < nombre c'
