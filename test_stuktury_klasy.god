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

Reveal "--- Miracle Legionu ---";
prophet.age be transformed into 150;
Reveal prophet.age;

Create Legion HolyPerson prophetest;
prophetest be transformed into rejuvenate(prophet);

Reveal "age (20): " + prophetest.age;
Reveal "purity (same): " + prophetest.purity;
Reveal "isSaint (same): " + prophetest.isSaint;

Reveal "===  METHODS & SACRED ===";

Reveal "=== ORDER (Klasa z hermetyzacją i metodami) ===";

Order Paladin {
    Sacred Mortal hiddenStrength;
    Profane Mortal publicLevel;

    Miracle Mortal Train(Mortal hours) {
        this.hiddenStrength be transformed into this.hiddenStrength + (hours * 2);
        this.publicLevel be transformed into this.publicLevel + 1;
        
        Reveal "  [Inside Miracle] Paladin trained! New hidden strength:";
        Reveal this.hiddenStrength;

        Fulfill this.hiddenStrength;
    }

    Miracle Dogma IsReadyForCrusade() {
        Judge this.hiddenStrength > 50 {
            Fulfill Heaven;
        } Otherwise {
            Fulfill Hell;
        }
    }
}

Create Order Paladin arthur;

arthur.publicLevel be transformed into 1;

Reveal "Arthur public level before training:";
Reveal arthur.publicLevel;

Reveal "--- Arthur is training for 30 hours ---";
arthur.Train(30); 

Reveal "Arthur public level after training:";
Reveal arthur.publicLevel;

Reveal "Is Arthur ready for Crusade?";
Create Dogma ready;
ready be transformed into arthur.IsReadyForCrusade();
Reveal ready;