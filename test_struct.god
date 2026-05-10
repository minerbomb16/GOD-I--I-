Reveal "=== LEGION ===";

Legion HolyPerson {
    Mortal age;
    Divine purity;
    Dogma isSaint;
}

Create Legion HolyPerson prophet;

prophet.age be transformed into 120;
prophet.purity be transformed into 99.99;
prophet.isSaint be transformed into Heaven;

Reveal prophet.age;
Reveal prophet.purity;
Reveal prophet.isSaint;

Reveal "---";

Create Mortal nextEra in the image of prophet.age + 80;
Reveal "nextEra (age + 80): " + nextEra;

Create Dogma holyCheck in the image of prophet.isSaint AND Heaven;
Reveal "holyCheck (isSaint AND Heaven): " + holyCheck;

Reveal "";

Miracle HolyPerson rejuvenate(HolyPerson target) {
    target.age be transformed into 20;
    Fulfill target;
}

Reveal "--- Test przekazywania Legionu ---";
prophet.age be transformed into 150;
Reveal prophet.age;

Create Legion HolyPerson prophetest;
prophetest be transformed into rejuvenate(prophet);

Reveal "age (20): " + prophetest.age;
Reveal "purity (same): " + prophetest.purity;
Reveal "isSaint (same): " + prophetest.isSaint;