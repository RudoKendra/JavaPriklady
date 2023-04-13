import java.lang.reflect.Array;
import java.text.Normalizer;
import java.util.*;

public class Hangman {

    public static void main(String[] args) {
        String[] slovnik = {
                "stôl", "počítač", "chlieb", "auto", "kvet",
                "pes", "kvapka", "doktor", "cesta", "rieka",
                "strom", "hory", "riadenie", "prúd", "kvapalina",
                "vzduch", "zviera", "zima", "leto", "jeseň",
                "jar", "slnečnica", "kvapka", "televízia", "okno",
                "kniha", "hračka", "banka", "zrkadlo", "fľaša",
                "jablko", "voda", "káva", "hodiny", "kabelka",
                "obrázok", "pohár", "kosť", "klávesnica", "pohovka",
                "stolička", "kámen", "tráva", "mrak", "lampa",
                "váza", "lístie", "paprika", "uhlie", "železo",
                "drevo", "hruška", "diamant", "kuchyňa", "sprcha",
                "dvere", "lakeť", "výstava", "skriňa", "krabica",
                "obchod", "prášok", "rubín", "krab", "kríž",
                "papier", "lepenka", "písmeno", "farba", "balón",
                "broskyňa", "hra", "gymnasta", "cibuľa", "reštaurácia",
                "sestra", "starosta", "skleník", "vodačka", "knihkupectvo",
                "koza", "kráľovná", "truhla", "piecka", "pláž",
                "pohár", "súmrak", "sýr", "škola", "zem",
                "zelenina", "šperk", "žena", "mesiac", "hovno",
                "hobby", "záhrada", "hrnček", "obraz", "posteľ"
        };

        ArrayList<Character> abeceda = new ArrayList<Character>(Arrays.asList('a', 'b',
                'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));

        ArrayList<Character> guessedLetters = new ArrayList<>();


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomIndex = random.nextInt(100);
        String guessWord = slovnik[randomIndex];
        int lifeCounter = 6;
        boolean coveredLetterCounter = true;

        System.out.println("Zacina hra Obesenec.\nMas 6 zivotov.");
        //ZAVOLAME METODU HIDEORSHOWLETTERS, KTORA NAM VRATI ODKAZ NA HASHMAPU, KTORU VYTVORILA OBSAHUJUCU ENTRY.
        //ENTRY SA SKLADA Z KLUCA=STRING CO JE HADANE SLOVO A HODNOTA=INTEGER CO JE POCET ZIVOTOV.
        Map<String, Integer> initMap = hideOrShowLetters(guessWord, guessedLetters);
        for(Map.Entry<String, Integer> entry : initMap.entrySet()){
            System.out.println("Hladane slovo je: " + entry.getKey());
        }

        while(lifeCounter != 0 && coveredLetterCounter){
            System.out.println("Vase pismena k dispozicii su: " + abeceda);
            System.out.println("Zadaj pismeno a zmackni enter.");
            try {
                char pismenkoOdUzivatela = scanner.nextLine().charAt(0);
                guessedLetters.add(pismenkoOdUzivatela);
                abeceda .remove(Character.valueOf(pismenkoOdUzivatela));
            } catch (NoSuchElementException e){
                System.out.println("Nezadali ste pismeno.");
                continue;
            } catch (IllegalStateException e){
                continue;
            } catch (IndexOutOfBoundsException e){
                System.out.println("Pismenko poprosim.");
                continue;
            }


            Map<String, Integer> mapInLoop = hideOrShowLetters(guessWord, guessedLetters);
            for(Map.Entry<String, Integer> entry : mapInLoop.entrySet()){
                System.out.println("Hladane slovo je: " + entry.getKey());
                System.out.println("Pocet ostavajucich zivotov: " + entry.getValue());
                lifeCounter = entry.getValue();
                coveredLetterCounter = entry.getKey().contains("_");
            }
        }
        System.out.println("Koniec hry.");
        if(lifeCounter == 0){
            System.out.println("Hladane slovo bolo: " + guessWord);
        } else {
            System.out.println("Gratulujem.");
        }


    }

    public static Map<String, Integer> hideOrShowLetters(String wordToGuess, ArrayList<Character> guessedLettersFromUser) {
        char[] coveredWord = odstranDiakritiku(wordToGuess).replaceAll("[a-zA-Z]", "_").toCharArray();
        int livesCounter = 6;
        boolean wasLetterPresent = false;

        for (Character ch : guessedLettersFromUser) {
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (odstranDiakritiku(wordToGuess).charAt(i) == ch) {
                    coveredWord[i] = ch;
                    wasLetterPresent = true;
                }
            }
            if(!wasLetterPresent){
                livesCounter--;
            }
            wasLetterPresent = false;
        }
        Map<String, Integer> result = new HashMap<>();
        result.put(String.valueOf(coveredWord), livesCounter);
        return result;
    }

    public static String odstranDiakritiku(String s)
    {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }

}
