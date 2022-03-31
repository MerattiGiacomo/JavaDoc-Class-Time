/**
 * Gestione della classe Time
 * @author Meratti
 */

public class Time {
    /**
     * Numero di ore dell'oggetto time
     */
    protected int ore;
    /**
     * Numero di minuti dell'oggetto time
     */
    protected int minuti;
    /**
     * Numero di secondi dell'oggetto time
     */
    protected int secondi;

    /**
     * Costruisce un oggetto Time dato in ingresso il numero di secondi. <br>
     * <u>Vengono distribuite in automatico i secondi tra le ore, minuti e secondi.</u>
     * Esempio: se in input viene passato 100 allora ora 0, minuti 1 e secondi 40
     * @param secondi
     */
    public Time(int secondi) {
        this.ore = secondi / 3600;
        this.minuti = secondi / 60 - 60;
        this.secondi = secondi - (minuti * 60 + 60);
    }

    /**
     * Costruisce un oggetto Time dato in ingresso ore, minuti e secondi. <br>
     * <u>Se i parametri di ingresso non sono validi (es. minuti 78) allora l'oggetto Time verra'  inizializzato con tutti ore, minuti e secondi impostati a 0</u>
     * @param ore ore da assegnare al nuovo oggetto
     * @param minuti minuti da assegnare al nuovo oggetto
     * @param secondi secondi da assegnare al nuovo oggetto
     */
    public Time(int ore, int minuti, int secondi) {
        this.ore = ore;
        this.minuti = minuti;
        this.secondi = secondi;
    }

    /**
     * Restituisce il numero di ore
     * @return il numero di ore dell'oggetto Time
     */
    public int getOre() {
        return this.ore;
    }

    /**
     * @deprecated
     * @param ore
     */
    public void setOre(int ore) {
        this.ore = ore;
    }

    /**
     * Restituisce il numero di minuti
     * @return il numero di minuti dell'oggetto Time
     */
    public int getMinuti() {
        return this.minuti;
    }

    /**
     * @deprecated
     * @param ore
     */
    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    /**
     * Restituisce il numero di secondi
     * @return il numero di secondi dell'oggetto Time
     */
    public int getSecondi() {
        return this.secondi;
    }

    /**
     * @deprecated
     * @param ore
     */
    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }

    /**
     * Vengono addizionati il numero di secondi specificati. Il tempo viene normalizzato in automatico.
     * @param secondi numero di secondi da aggiungere
     */
    public void addSecondi(int secondi) {
        this.secondi += secondi;
    }

    /**
     * Esprime le ore, i minuti e i secondi dell'oggetto Time in secondi. Esempio: 1 ora, 20 min, 10 secondi -> 4810s
     * @return il numero totale dei secondi
     */
    public int convertiSecondi() {
        return this.ore*3600 + this.minuti*60 + this.secondi;
    }

    /**
     * Restituisce una stringa che rappresenta l'oggetto
     * @Override Restituisce una stringa che rappresenta l'oggetto
     * @return Rappresentazione testuale dell'oggetto Time {ore:minuti:secondi}
     */
    @Override
    public String toString() {
        return this.ore + ":" + this.minuti + ":" +secondi;
    }
}

    
