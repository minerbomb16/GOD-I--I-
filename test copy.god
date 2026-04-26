Create Mortal sins2[5];

sins2[0] be transformed into 10;
sins2[1] be transformed into 20;
sins2[2] be transformed into 30;
sins2[3] be transformed into 40;
sins2[4] be transformed into 50;

Reveal sins2[:2];
Reveal sins2[1:2];
Reveal sins2[1:];

Create Mortal newsins[3];

Confess newsins[0];
Confess newsins[1];

newsins[2] be transformed into newsins[0] + newsins[1];

Reveal newsins;

Create Mortal sins[3];

sins[0] be transformed into 10;
sins[1] be transformed into 20;
sins[2] be transformed into sins[0] + sins[1];

Reveal sins[1];
Reveal sins;

Create Divine graces[3];

graces[0] be transformed into 3.14;
graces[1] be transformed into graces[0] * 2.0;
Confess graces[2];
Reveal graces;

Create SmallDivine smalls[2];

smalls[0] be transformed into 1.5;
smalls[1] be transformed into smalls[0] * 2.0;

Reveal smalls;

Create Dogma signs[2];

signs[0] be transformed into Heaven;
signs[1] be transformed into Hell;

Reveal signs;