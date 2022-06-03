# Progetto gestionale Datacenter - Help
## Introduzione
Questo progetto è finalizzato alla gestione di molteplici datacenter e dei suoi componenti, in particolare
- Sale
- Rack
- Apparati di rete, host e client
- Cablaggi<br>
In seguito verranno chiamati **asset**
### Struttura

Azienda<br>
|_ Datacenter<br>
&nbsp;&nbsp;&nbsp;&nbsp;|_ Sale<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|_Rack<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|_Apparati

## Operazioni sugli asset

### Aggiunta asset
Ogni asset può essere inserito attraverso una sua speficifa interfaccia
### Aggiunta conduttura
Prima di essere utilizzato un conduttore deve essere inserito in 'magazzino'
a. Dallo start cliccare 'Aggiungi cavo a magazzino'
b. Selezionare materiale, tipo della presa, categoria e il nome della conduttura
c. Salvare

### Creazione cablaggio
a. Se non disponibilit, creare conduttura
b. Andare nell'interfaccia 'Apparati' o 'Condutture', e cliccare aggiungi cablaggio
c. Scegliere l'apparato e porta di partenza (A)
d. Scegliere l'apparato e porta di destinazione (B)
e. Selezionare tipo conduttura
f. Selezionare conduttura disponibile
g. Salvare

## Operazioni gestionali
### Occupazione dei rack
Sulla scheramta Start è possibile accedere alla maschera Occupazione dei rack.
Qui è possibile sapere grandezzae, posti occupati, disponibili e percentuale di occupazione di ogni singolo rack di una determinata sala
Per navigare nelle sale è possibile usare le frecce a pie di pagina

### Ricerca asset
