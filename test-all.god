Reveal "";
Reveal "========= Mortal operations =========";
Create Mortal sin;
Reveal "Value of Mortal:";
Confess sin;
Create Mortal sin2 in the image of sin * 2;
Reveal "Value of Mortal * 2: " + sin2;
sin2 be transformed into 0;
Reveal "Value of Mortal transformed into 0: " + sin2;
Reveal "";

Reveal "========= Divine operations =========";
Create Divine grace;
Reveal "Value of Divine:";
Confess grace;
Create Divine grace2 in the image of grace * 3.14;
Reveal "Value of Divine * 3.14: " + grace2;
grace2 be transformed into 2.0 + 4.2 * (3.0 + 1.0) - 5.0 / 5.0;
Reveal "Value of Divine transformed into 17.8: " + grace2;
Reveal "";

Reveal "========= SmallDivine operations =========";
Create SmallDivine smallGrace;
Reveal "Value of SmallDivine:";
Confess smallGrace;
Create SmallDivine smallGrace2 in the image of smallGrace * 2.0;
Reveal "Value of SmallDivine * 2: " + smallGrace2;
smallGrace2 be transformed into 1.0 + 2.0;
Reveal "Value of SmallDivine transformed into 3.0: " + smallGrace2;
Reveal "";

Reveal "========= Eternal operations =========";
Create Eternal glory;
Reveal "Value of Eternal:";
Confess glory;
Create Eternal glory2 in the image of "holy " + glory;
Reveal "Value of 'holy ' + Eternal: " + glory2;
glory2 be transformed into 3 + " is a value of " + 7.0;
Reveal "Value of Eternal transformed 3 + ' is a value of ' + 7.0: " + smallGrace2;
Reveal "";

Reveal "========= Divine + SmallDivine operations =========";
Create Divine grace3;
Reveal "Value of Divine:";
Confess grace3;
Create SmallDivine smallGrace3;
Reveal "Value of SmallDivine: ";
Confess smallGrace3;
Create Divine grace4 in the image of grace3 + smallGrace3;
Reveal "Value of Divine + SmallDivine: " + grace4;
Create SmallDivine grace5 in the image of smallGrace3 * grace3;
Reveal "Value of SmallDivine * Divine: " + grace5;
Reveal "";

Reveal "========= Dogma operations =========";
Create Dogma dog;
Reveal "Value of Dogma:";
Confess dog;
Reveal "Povided value of Dogma: " + dog;

Create Dogma dogT in the image of Heaven;
Create Dogma dogF in the image of Hell;

Create Dogma andV in the image of dogT AND dogF;
Reveal "Value of Heaven AND Hell: " + andV;

Create Dogma orV in the image of dogT OR dogF;
Reveal "Value of Heaven OR Hell: " + orV;

Create Dogma xorV in the image of dogT XOR dogF;
Reveal "Value of Heaven XOR Hell: " + xorV;

Create Dogma negVT in the image of NEG dogT;
Reveal "Value of NEG Heaven: " + negVT;

Create Dogma negVF in the image of NEG dogF;
Reveal "Value of NEG Hell: " + negVF;

Create Dogma multV in the image of dogT AND dogT AND NEG dogT;
Reveal "Value of Heaven AND Heaven AND NEG Heaven: " + multV;
Reveal "";

Reveal "========= Table operations =========";
Create Mortal legion[5];
legion[0] be transformed into 10;
legion[1] be transformed into 20;

Create Mortal index in the image of 2;
legion[index] be transformed into legion[0] + legion[1];
legion[3] be transformed into 40;
legion[4] be transformed into 50;
Reveal "Value by idx: " + legion[index];

Reveal "Whole Mortal table:";
Reveal legion;

Reveal "Table idx 0: " + legion[0];

Reveal "Table idx 1 to 3:";
Reveal legion[1:3];

Reveal "Table idx start to 2:";
Reveal legion[:2];

Reveal "Table idx 3 to end:";
Reveal legion[3:];

Create Divine legion2[2];
legion2[0] be transformed into 1.1;
Reveal "Whole Divine table:";
Reveal legion2;

Create SmallDivine legion3[2];
legion3[0] be transformed into 1.1;
Reveal "Whole SmallDivine table:";
Reveal legion3;

Create Dogma legion4[2];
legion4[0] be transformed into 1;
Reveal "Whole Dogma table:";
Reveal legion4;
Reveal "";