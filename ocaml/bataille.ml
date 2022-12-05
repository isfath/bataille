type couleur = Coeur | Trefle | Pique | Carreau
type point = N2 | N3 | N4 | N5 | N6 | N7 | N8 | N9 | N10
type figure = V | D | R | A
type valeur = Point of point | Figure of figure
type carte = valeur * couleur
type carte' = Joker | Simple of carte

let symbole c =
  match c with
  | Coeur -> "♥️"
  | Trefle -> "♣️"
  | Pique -> "♠️"
  | Carreau -> "♦️"

let int_of_point p =
  match p with
  | N2 -> 2
  | N3 -> 3
  | N4 -> 4
  | N5 -> 5
  | N6 -> 6
  | N7 -> 7
  | N8 -> 8
  | N9 -> 9
  | N10 -> 10

let to_string c =
  match c with
  | Joker -> "J"
  | Simple (valeur, couleur) ->
    let v =
      match valeur with
      | Point p -> string_of_int (int_of_point p)
      | Figure V -> "V"
      | Figure D -> "D"
      | Figure R -> "R"
      | Figure A -> "A"
    in
    v ^ symbole couleur

let nombre c =
  match c with
  | Joker -> 15
  | Simple (valeur, _couleur) ->
    match valeur with
    | Point p -> int_of_point p
    | Figure V -> 11
    | Figure D -> 12
    | Figure R -> 13
    | Figure A -> 14

let (<<) c c' = nombre c < nombre c'

let to_option x =
  match x with
  | Joker -> None
  | Simple s -> Some s

let of_option x =
  match x with
  | None -> Joker
  | Some s -> Simple s

let signe comp = String.get "<=>" (1 + comp)

let comparaison c c' =
  Printf.sprintf "%s%c%s"
    (to_string c)
    (signe (compare (nombre c) (nombre c')))
    (to_string c')

let () =
  let c = Simple (Point N10, Carreau) in
  let c' = Simple (Point N2, Coeur) in
  print_endline (comparaison c c);
  print_endline (comparaison c c');
  print_endline (comparaison c' c);
