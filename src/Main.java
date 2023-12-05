// Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
// (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum,
// crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
// Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo.

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("987.65");
        BigDecimal num2 = new BigDecimal("432.10");
        BigDecimal risultatoArrotondato = operazioneAritmetica(num1, num2, Operazioni.DIVISIONE).setScale(2, RoundingMode.HALF_EVEN); //sto trasformando ris operaZIONE IN UN RISULTATO APPROSSIMATO

        System.out.println("Il risultato della operazione è: " + risultatoArrotondato);
    }

    public static BigDecimal operazioneAritmetica(BigDecimal num1, BigDecimal num2, Operazioni operazione) { //funzione

        BigDecimal risultato = null;

        switch (operazione) {
            case SOMMA:
                risultato = num1.add(num2);
                break;
            case SOTTRAZIONE:
                risultato = num1.subtract(num2);
                break;
            case MOLTIPLICAZIONE:
                risultato = num1.multiply(num2);
                break;
            case MIN:
                risultato = num1.min(num2);
                break;
            case MAX:
                risultato = num1.max(num2);
                break;
            case DIVISIONE:
                risultato = num1.divide(num2, new MathContext(3));
                break;
        }
        return risultato;
    }
}







        /*SOMMA(+) {
            public BigDecimal calcola(BigDecimal num1, BigDecimal num2) {
                return num1.add(num2);
            }
        },
        SOTTRAZIONE(-) {
            public BigDecimal calcola(BigDecimal num1, BigDecimal num2) {
                return num1.subtract(num2);
            }
        },
        MOLTIPLICAZIONE(*)

        {
            public BigDecimal calcola (BigDecimal num1, BigDecimal num2){
            return num1.multiply(num2);
        }
        },

        DIVISIONE(/) {
            public BigDecimal calcola (BigDecimal num1, BigDecimal num2){
                return num1.divide(num2);
            }
        },

        MINIMO(min) {
            public BigDecimal calcola (BigDecimal num1, BigDecimal num2){
                return num1.min(num2);
            }
        },

        MASSIMO(max) {
            public BigDecimal calcola (BigDecimal num1, BigDecimal num2){
                return num1.max(num2);
            }
        }*/



       /* BigDecimal somma = num1.add(num2);
        BigDecimal sottrazione = num1.subtract(num2);
        BigDecimal moltiplicazione = num1.multiply(num2);
        BigDecimal divisione = num1.divide(num2, 2, BigDecimal.ROUND_HALF_UP);

        System.out.println("Somma: " + somma);
        System.out.println("Differenza: " + sottrazione);
        System.out.println("Moltiplicazione: " + moltiplicazione);
        System.out.println("Divisione: " + divisione);*/



