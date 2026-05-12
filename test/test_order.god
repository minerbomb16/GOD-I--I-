Reveal "=== SACRED VISIBILITY TEST ===";

Order Vault {
    Sacred Mortal secretCode;
    Profane Mortal publicBalance;

    Miracle Mortal SetCode(Mortal newCode) {
        this.secretCode be transformed into newCode;
        Fulfill this.secretCode;
    }

    Miracle Mortal GetCode() {
        Fulfill this.secretCode;
    }
}

Create Order Vault myVault;

myVault.publicBalance be transformed into 1000;
Reveal "Public balance:";
Reveal myVault.publicBalance;

Reveal "Setting secret code via Miracle...";
myVault.SetCode(42);

Reveal "Reading secret code via Miracle:";
Reveal myVault.GetCode();

Reveal "Attempting forbidden access to Sacred field...";
myVault.secretCode be transformed into 999;