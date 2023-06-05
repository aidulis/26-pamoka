public class Uzduotis1 {
    public static void main(String[] args) {

        boolean rezultatas1 = patikrintiArZodisYraIlgesnisNeiX("Antanas", 5);
        System.out.println(rezultatas1);
        boolean rezultatas2 = patikrintiArZodisYraIlgesnisNeiX("ropė", 7);
        System.out.println(rezultatas2);

    }

    public static boolean patikrintiArZodisYraIlgesnisNeiX(String zodis, int x){
        if(zodis.length() > x){
            return true;
    }
        else{
            return false;
        }

    }
}
