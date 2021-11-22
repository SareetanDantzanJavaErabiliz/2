/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte
 */

import java.util.Scanner;

public class ZenbakiOsoaIrakurri {
    
    public static void main( String [] parametroak) {
  
        int zenbakiOsoa = 0;
        
        // Scanner klaseko Irakur objketua sortzen dugu
        Scanner irakur = new Scanner( System.in );
        System.out.print( "Mesedez, zenbaki osoa sartu: " );
        try {

            // Metodo honek zenbakia irakurtzen du
            zenbakiOsoa = irakur.nextInt( );
        }
	catch( Exception e ) {

            // sartutako informazioa ez bada zenbaki osoa
            zenbakiOsoa = 0;
            System.out.print( "\nSartutakoa ez da zenbaki osoa" );
        }

        // Scannerra itxi
        irakur.close( );
        
        // Zenbaki osoa bistaratu
        System.out.println( "\nzenbakiOsoa aldagaiaren balioaa: " +zenbakiOsoa );

    
    }
    
}
