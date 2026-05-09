Reveal "=== INICJALIZACJA ZMIENNYCH GLOBALNYCH ===";
Create Mortal mnoznik in the image of 5;

Create Mortal globalnaTablica[3];
globalnaTablica[0] be transformed into 1;
globalnaTablica[1] be transformed into 2;
globalnaTablica[2] be transformed into 3;

Create Mortal globalnaMacierz[2][2];
globalnaMacierz[0][0] be transformed into 10;
globalnaMacierz[0][1] be transformed into 20;
globalnaMacierz[1][0] be transformed into 30;
globalnaMacierz[1][1] be transformed into 40;


Reveal "=== DEFINICJE CUDOW (FUNKCJI) ===";

Miracle Mortal pomnoz(Mortal liczba) {
    Create Mortal wynik in the image of liczba * mnoznik;
    Fulfill wynik;
}

Miracle Divine magicznaKalkulacja(Mortal baza, Divine mnoznikRzeczywisty) {
    Reveal "-> [Wnetrze funkcji] Wykonuje magiczna kalkulacje na roznych typach!";
    Create Divine wynik in the image of baza * mnoznikRzeczywisty;
    Fulfill wynik;
}

Miracle Mortal testujKolekcje() {
    Reveal "-> [Wnetrze funkcji] Tworze i drukuje LOKALNA tablice:";
    Create Mortal lokalnaTablica[2];
    lokalnaTablica[0] be transformed into 100;
    lokalnaTablica[1] be transformed into 200;
    Reveal lokalnaTablica;

    Reveal "-> [Wnetrze funkcji] Tworze i drukuje LOKALNA macierz:";
    Create Mortal lokalnaMacierz[2][2];
    lokalnaMacierz[0][0] be transformed into 99;
    lokalnaMacierz[0][1] be transformed into 88;
    lokalnaMacierz[1][0] be transformed into 77;
    lokalnaMacierz[1][1] be transformed into 66;
    Reveal lokalnaMacierz;

    Reveal "-> [Wnetrze funkcji] Nadpisuje GLOBALNA tablice uzywajac funkcji pomnoz() i zmiennej mnoznik:";
    globalnaTablica[0] be transformed into pomnoz(globalnaTablica[0]);
    globalnaTablica[1] be transformed into pomnoz(globalnaTablica[1]);
    globalnaTablica[2] be transformed into pomnoz(globalnaTablica[2]);
    
    Fulfill 1;
}

Reveal "=== WYKONANIE GŁÓWNEGO PROGRAMU ===";

Reveal "Wynik zwyklej funkcji pomnoz(10):";
Create Mortal x in the image of pomnoz(10);
Reveal x;

Reveal "Wynik funkcji z dwoma roznymi argumentami (10 * 2.5):";
Create Divine wynikMagii in the image of magicznaKalkulacja(10, 2.5);
Reveal wynikMagii;

Reveal "Stan GLOBALNEJ tablicy przed wejsciem do funkcji:";
Reveal globalnaTablica;

Reveal "Stan GLOBALNEJ macierzy:";
Reveal globalnaMacierz;

Reveal "=== WCHODZE DO FUNKCJI testujKolekcje ===";
Create Mortal smieci in the image of testujKolekcje();

Reveal "=== WYSZLAM Z FUNKCJI ===";
Reveal "Stan GLOBALNEJ tablicy po modyfikacji wewnatrz funkcji:";
Reveal globalnaTablica;

Reveal "=== KONIEC ===";