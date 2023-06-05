public class Uzduotis7 {
    public static void main(String[] args) {

        boolean rezultatas1 = patikrintiArSimbolisPagalIndeksaYraSkaicius("ana1konda", 4);
        boolean rezultatas2 = patikrintiArSimbolisPagalIndeksaYraSkaicius("ana1konda", 6);
        System.out.println(rezultatas1);
        System.out.println(rezultatas2);

    }

    public static boolean patikrintiArSimbolisPagalIndeksaYraSkaicius(String s1, int indeksas){
        if(Character.isDigit(s1.charAt(indeksas))){
            return true;
        }
        else{
            return false;
        }
    }
}
