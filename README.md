<h1 align="center">Lotteria</h1>

## Descrizione
L'obiettivo di questo progetto è simulare una partita di pallavolo tra due giocatori utilizzando la programmazione multithreading in Java. Ogni giocatore è rappresentato da un oggetto della classe Giocatore che implementa l'interfaccia Runnable. Ogni giocatore incrementa il numero di passaggi effettuati e stampa il suo numero durante l'esecuzione. I giocatori vengono eseguiti su thread separati.

## Classi

1) Giocatore
- Attributi:
 - idGiocatore: Identificatore numerico del giocatore.
 - numeroPassaggi: Conta il numero di passaggi effettuati dal giocatore.
- Metodi:
 - Giocatore(int idGiocatore): Costruttore della classe che inizializza il giocatore con un identificatore.
 - void run(): Metodo eseguito quando il thread viene avviato. Incrementa il numero di passaggi del giocatore e stampa i dettagli.

2) Pallavolo

- metodi
 - main: instanzia due oggetti di tipo Giocatore, crea 2 thread usando il costruttore: Thread(oggetto,"nome"). con t1.setPriority(Thread.MAX_PRIORITY) si imposta il thread 1 alla massima priorità. Stampa le specifiche di ogni giocatore(id, priorità e nome). Infine, Avvia i thread usando Start() 

## metodi e attributi della classe Thread usati 

- start(): Inizia l'esecuzione del thread.
- getId(): Restituisce l'ID univoco del thread.
- getPriority(): Restituisce la priorità corrente del thread.
- setPriority(): Imposta la priorità del thread.
- getName(): Restituisce il nome del thread.
- Thread.currentThread(): Restituisce il thread attualmente in esecuzione.
- yield(): Il thread corrente cede il controllo a tutti gli altri thread prima di continuare la sua esecuzione. 
- Thread.MAX_PRIORITY: attributo che imposta la massima priorità ad un thread

## descrizione 

1) nel metodo main vengono instanziati due oggetti di tipo Giocatore.
2) vengono creati 2 thread usando il costruttore Thread(oggetto,"nome").
3) i thread vengono avviati con start();
4) viene modificata la priorità del il primo thread con t1.setPriority(Thread.MAX_PRIORITY);
5) vengono stampati a video gli attributi dei 2 thread giocatori usando i metodi della classe thread: getId(), getPriority() e getName() 
6) tramite le istruzioni del metodo run() della classe Giocatore, i Giocatori aumentano il loro numero di passaggi alternadosi tra di loro e stampando a video l'attuale numero di passaggi. Questo crea l'effetto di due giocatori che si scambiano la palla tra di loro


