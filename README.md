### Uppgift: Implementera inventariesystemet och skapa interaktioner i Java

**Scenariobeskrivning:**
I denna fortsättning på föregående uppgift ska ni nu implementera (en del av) ert designade inventariesystem i Java. 
Ni kommer att skapa Java-klasser som representerar några av de objekt ni tidigare modellerade i ert UML-diagram, och 
demonstrera systemets funktionalitet genom metodanrop och interaktioner.
Ni kommer jobba individuellt i denna del av uppgiften så se till att jobba med **en egen kopia av UML diagrammet** 
utifall att ni märker att ni vill ändra något i designen innan/medans ni börjar koda.

### Krav:

**Inventory:**
Implementera klassen `Inventory`, som representerar ett inventarie. Den ska ha en lista av `Item` och metoder för att:
- Lägga till ett föremål.
- Ta bort ett föremål.
- Visa alla föremål i inventariet.
- Fler metoder får läggas till vid behov

**Item och Subklasser:**
- Implementera basklassen `Item` med attribut som namn, vikt och värde i guld.
- Skapa minst tre subklasser (exempelvis `Weapon`, `Armor`, `Consumable`) med egna specifika attribut och metoder.

**Interfaces:**
Implementera minst två interfaces, t.ex. `Equippable` och `Usable`, som kan användas av vissa klasser.
- `Equippable` kan implementeras av klasser som `Weapon` och `Armor`.
- `Usable` kan implementeras av klasser som `Consumable` eller specifika föremål som drycker.

**Specifika föremål:**
Skapa minst tre specifika föremål, t.ex. `Sword`, `HealthPotion` eller `MagicOgreArmor`, som ärver från subklasser och 
implementerar ett eller flera av era interfaces.

**UML diagram:**
Koden och UML diagrammet skall reflektera varandra. Det är ok med designändringar medans ni kodar men då skall UML 
diagrammet uppdateras så det förblir en korrekt dokumentation av systemet.

**Testprogram – Del 1:**
Skriv ett testprogram som:
- Skapar ett inventarie.
- Lägger till och tar bort olika föremål i inventariet.
- Demonstrerar användningen av föremålens metoder genom att anropa dem och visa hur de fungerar.


### För högre betyg (VG):

**Ny klass och interaktioner:**
- Skapa en ny klass (eller klasser) som interagerar med `Inventory`, exempelvis `Player`, `Shop` eller `Enemy`.
- Klassen ska använda inventariesystemet och implementera metoder som t.ex.:
    - En spelare kan köpa eller sälja föremål i en affär.
    - En fiende kan ha ett eget inventarie eller släppa föremål när den besegras.

**Testprogram – Del 2:**
Utöka testprogrammet genom att:
- Skapa två objekt från de nya klasserna, t.ex. en spelare och en affär eller en spelare och en fiende.
- Implementera interaktioner mellan objekten och visa hur de använder inventariesystemet.

### Inlämning och redovisning:
Projektet lämnas in som github länk på omniway senst **fredag 11/10 kl 23.59**<br>
Individuell redovisning enligt:
[schema](https://docs.google.com/spreadsheets/d/1LpzxFrutM2tMXutu-EkiEUIXtPQ_K3vjM-9v1qOayqc/edit?usp=sharing)

