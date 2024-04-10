//Bibliotekos aplikacija:
//
//Sukurti klasę Autorius. Autorius turi vardą, pavardę, gimimo metus.
//
//Sukurti klasę Knyga, kuri turi išleidimo metus, autorių bei pavadinimą.
//
//Sukurti klasę Biblioteka, kuri turi knygų sąrašą. Klasėje turi būti pridėjimo
//į sąrašą metodas ir gražaus knygos iš sąrašo spausdinimo metodas.
//
//Klasėje su main metodu pridėkite naujų knygų į biblioteką ir atspausdinkite
//knygų sąrašą ekrane. (Darome prielaidą, kad vieną konkrečią knygą parašė vienas autorius).
//
//
//Jei susipažinote su klasėmis Paths ir Files atliekame sekančią užduotį:
//Ašsaugoti visą knygų sąrašą projekto šakninėje direktorijoje pavadinimu knygos.txt

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        var aut1 = new Autorius("Balys", "Sruoga",1896);

        var jaunyste = new Knyga(1912,"Jaunystė");
        var tarpukaris = new Knyga(1918,"Tarpukaris");
        var okupacijuMetai = new Knyga(1941,"Okupacijų metai");

        var bib = new Biblioteka();

        jaunyste.setAutorius(aut1);
        tarpukaris.setAutorius(aut1);
        okupacijuMetai.setAutorius(aut1);


        bib.pridetiKnyga(jaunyste);
        bib.pridetiKnyga(tarpukaris);
        bib.pridetiKnyga(okupacijuMetai);

        FileWriteris.saugoti(bib);
    }
}