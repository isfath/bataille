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

let couleurs = [Coeur; Trefle; Pique; Carreau]
let points = [N2; N3; N4; N5; N6; N7; N8; N9; N10]
let figures = [V; D; R; A]
let valeurs =
  List.map (fun x -> Point x) points @
  List.map (fun x -> Figure x) figures

let jeu =
  List.concat_map (fun v ->
    List.map (fun c -> v, c) couleurs
  ) valeurs

(* https://discuss.ocaml.org/t/more-natural-preferred-way-to-shuffle-an-array/217/6 *)
let rec shuffle = function
  | [] -> []
  | [single] -> [single]
  | list ->
    let (before, after) = List.partition (fun _ -> Random.bool ()) list in
    List.rev_append (shuffle before) (shuffle after)

let () =
  let c = Simple (Point N10, Carreau) in
  let c' = Simple (Point N2, Coeur) in
  print_endline (comparaison c c);
  print_endline (comparaison c c');
  print_endline (comparaison c' c);
  List.iter (fun x -> print_string (to_string (Simple x))) (shuffle jeu);
  print_newline ()
