Reveal "";
Reveal "========= The Ultimate Trial of Faith =========";

Create Mortal cycle in the image of 0;
Create Dogma isFaithful in the image of Heaven;

Reveal "--- Phase 1: Pilgrimage with Dogma AND Equation ---";

Pilgrimage isFaithful AND (5 - cycle) > 0 {
    Reveal "Current cycle: " + cycle;

    Judge cycle == 2 {
        Reveal "  [!] Reached cycle 2. Testing deeper faith...";
        Create Mortal testVal in the image of 10;

        Judge (testVal * 2) > 15 {
            Reveal "    [*] (testVal * 2) > 15. Faith is strong!";
        } Otherwise {
            Reveal "    [-] Faith wavered.";
        }
        
    } Otherwise Judge cycle == 4 {
        Reveal "  [!] Reached cycle 4. Faith is fading...";
    
        isFaithful be transformed into Hell;
    }

    cycle be transformed into cycle + 1;
}

Reveal "";
Reveal "--- Phase 2: Pilgrimage with pure Dogma ---";

Create Dogma pureDogma in the image of Heaven;
Create Mortal countdown in the image of 3;

Pilgrimage pureDogma {
    Reveal "Countdown: " + countdown;
    
    Judge countdown <= 0 {
        Reveal "  [!] Countdown is 0. Exiting pure dogma loop.";
        pureDogma be transformed into Hell;
    }

    countdown be transformed into countdown - 1;
}

Reveal "========= Amen =========";

Reveal "";

Reveal "========= Way of the Cross =========";
Create Mortal stepValue in the image of 2;
Create Mortal iterator;

Reveal "Way of the Cross by step of 2:";
Way of the Cross iterator Stations 0 to 3 + 3 step stepValue {
    Reveal "  Stepping up: " + iterator;

    Create Mortal iterator2;
    Way of the Cross iterator2 Stations 0 to 2 {
        Reveal "    inner: " + iterator2;
    }
}

Reveal "";
Reveal "Way of the Cross downwards into the abyss:";
Way of the Cross iterator Stations 5 to 1 step -1 {
    Reveal "  Stepping down: " + iterator;
}

Reveal "All journeys complete.";