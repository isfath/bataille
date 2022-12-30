with Ada.Text_IO;

procedure Bataille is
	type Couleur is (Coeur, Trefle, Pique, Carreau);

	type Point is range 2..10;

	type Figure is (Valet, Dame, Roi, As);

	type Sorte is (Pt, Fig);
	type Valeur (S : Sorte) is record
		case S is
			when Pt => Pt : Point;
			when Fig => Fig : Figure;
		end case;
	end record;

	--unconstrained thanks to the default value
	type Carte (S : Sorte := Pt) is record
		Val : Valeur(S);
		Coul : Couleur;
	end record;

	type Vraie_Couleur is (Rouge, Noir);
	type Avec_Joker (S : Sorte := Pt; J : Boolean := false) is record
		case J is
			when false => Simple : Carte(S);
			when true => Couleur : Vraie_Couleur;
		end case;
	end record;


	C : Carte;
	S : Avec_Joker;
begin
	C := (Pt, (Pt, 2), Trefle);
	C := (Fig, (Fig, Valet), Trefle);
	S := (C.S, false, C);
	S := (Pt, true, Noir);
end Bataille;
