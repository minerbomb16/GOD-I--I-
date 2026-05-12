Reveal "=== NESTED MIRACLES TEST ===";

Miracle Mortal doublePower(Mortal val) {
    Fulfill val * 2;
}

Miracle Mortal calculateRitualPower(Mortal basePower, Mortal bonus) {
    Create Mortal doubledBase in the image of doublePower(basePower);
    Create Mortal result in the image of doubledBase + bonus;
    Fulfill result;
}

Create Mortal initialPower in the image of 10;

Reveal "Initial Power:";
Reveal initialPower;

Create Mortal finalPower in the image of calculateRitualPower(initialPower, 5);

Reveal "Final Power (10 * 2 + 5):" + finalPower;