public class Uzduotis3 {
    public static void main(String[] args) {

        int rezultatas1 = patikrintiKurisZodisIlgesnis("Antanas", "ropė");
        int rezultatas2 = patikrintiKurisZodisIlgesnis("kelmas", "skruzdėlynas");
        int rezultatas3 = patikrintiKurisZodisIlgesnis("mašina", "metras");
        System.out.println(rezultatas1);
        System.out.println(rezultatas2);
        System.out.println(rezultatas3);

    }

    public static int patikrintiKurisZodisIlgesnis(String zodis1, String zodis2){
        if(zodis1.length() > zodis2.length()){
            return -1;
        }
        else if(zodis2.length() > zodis1.length()){
            return 1;
        }
        else{
            return 0;
        }
    }
}
