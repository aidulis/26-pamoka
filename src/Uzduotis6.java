public class Uzduotis6 {
    public static void main(String[] args) {

        String rezultatas1 = grazintiZodiKurisArciauPagalAbecele("ananasas", "anakonda");
        String rezultatas2 = grazintiZodiKurisArciauPagalAbecele("antanas", "mašina");
        String rezultatas3 = grazintiZodiKurisArciauPagalAbecele("ananasas", "ąsotis");
        System.out.println(rezultatas1);
        System.out.println(rezultatas2);
        System.out.println(rezultatas3);

    }
    public static String grazintiZodiKurisArciauPagalAbecele(String s1, String s2){
        if(s1.compareTo(s2) > 0){
            return s2;
        }
        else if(s1.compareTo(s2) < 0){
            return s1;
        }
        else{
            return "Zodziai prasideda vienodai";
        }
    }
}
