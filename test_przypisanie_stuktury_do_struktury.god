Reveal "=== TYPE MISMATCH TEST ===";

Legion Point {
    Mortal x;
    Mortal y;
}

Legion Vector {
    Mortal dx;
    Mortal dy;
}

Create Legion Point myPoint;
myPoint.x be transformed into 10;
myPoint.y be transformed into 20;

Create Legion Vector myVector;

Reveal "Attempting forbidden magic...";
myVector be transformed into myPoint;

Reveal myVector.dx;