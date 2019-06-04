public class Opdracht2 {

    public static void main (String[] args) {

        Replace();
    }

    public static void Replace() {
        String tekst =
                "Dit is een tekst met \" en ** en ?? "+
                        "en allerlei andere niet wenselijke tekens zoals ®, !, @, #, $, %, ^, &.";

        tekst = tekst.replaceAll("['\"'|?|*|®|!|@|#|$|%|^|&]", "");

        System.out.println(tekst);
    }

}
