/**
 * OperacijeStroja.java
 * 
 * Opis:
 * Vmesnik za osnovne operacije strojev
 *
 * @version Vaja 34 (OperacijeStroja) 
 * @author Matej Germovnik
 */
public interface OperacijeStroja {
    
    /** Vklopi stroj
     * @return Vrne true, če je bilo vklapljanje uspešno, ali false, če je bil stroj že vklopljen
     */
    boolean vklopi();
    
    /** Izklopi stroj
     * @return Vrne true, če je bilo izklapljanje uspešno, ali false, če je bil stroj že izklopljen
     */
    boolean izklopi();
    
    /** Dodaj ure delovanja
     * @param ure Število ur za povečanje
     */
    void dodajUreDelovanja(int ure);
}