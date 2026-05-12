Create Mortal soulPower;
Confess soulPower;

Create Divine grace in the image of 7.77;
Create SmallDivine spark in the image of 1.1;
Create Eternal pilgrimName in the image of "Lazarus";
Create Dogma isAscended in the image of Hell;

Reveal "Blessings upon you, " + pilgrimName;

Judge soulPower > 100 {
    Reveal "Status: Divine Being";
    isAscended be transformed into Heaven;
} Otherwise Judge soulPower > 50 {
    Reveal "Status: Mortal Hero";
} Otherwise {
    Reveal "Status: Lost Soul";
}

Judge grace > spark {
    Reveal "Your grace shines brighter than the spark.";
}

Create Mortal purification;
Way of the Cross purification Stations 1 to 3 {
    Reveal "Purification at station: " + purification;
}

Create Mortal descent;
Way of the Cross descent Stations 10 to 0 step -2 {
    Reveal "Descending into the abyss: " + descent;
}

Create Mortal prayerCount in the image of 3;
Pilgrimage prayerCount > 0 AND isAscended {
    Reveal "Uttering prayer... " + prayerCount;
    prayerCount be transformed into prayerCount - 1;
}

Create Dogma finalJudgment in the image of isAscended OR (grace > 5.0);
Reveal "Final Judgment: " + finalJudgment;

Create Mortal artifacts[5];
artifacts[0] be transformed into 42;
artifacts[4] be transformed into 77;
Reveal "First artifacts: ";
Reveal artifacts[0:2];

Create Divine grid[3][3];
grid[1][1] be transformed into 3.14;
Reveal "Center of the grid: ";
Reveal row grid[1];

Legion Relic {
    Mortal age;
    Divine power;
}

Create Legion Relic holyGrail;
holyGrail.age be transformed into 2000;
holyGrail.power be transformed into 99.9;
Reveal "Relic Power: " + holyGrail.power;

Order Paladin {
    Profane Mortal health;
    Sacred Mortal hiddenFaith;

    Miracle Mortal strike(Mortal weaponDamage) {
        Fulfill this.health + this.hiddenFaith + weaponDamage;
    }
}

Create Order Paladin arthur;
arthur.health be transformed into 100;

Create Mortal totalDamage in the image of arthur.strike(15);
Reveal "Paladin strikes for: " + totalDamage;

Miracle Mortal calculateKarma(Mortal goodDeeds, Mortal sins) {
    Create Mortal karma in the image of goodDeeds - sins;
    Fulfill karma;
}

Create Mortal myKarma in the image of calculateKarma(100, 25);
Reveal "Your final karma is: " + myKarma;