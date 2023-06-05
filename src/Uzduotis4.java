public class Uzduotis4 {
    public static void main(String[] args) {

        char rezultatas1 = isvestiZodzioRaidePagalIndeksa("ananasas", 5);
        char rezultatas2 = isvestiZodzioRaidePagalIndeksa("Sakinys.", 3);
        char rezultatas3 = isvestiZodzioRaidePagalIndeksa("meška", 2);
        char rezultatas4 = isvestiZodzioRaidePagalIndeksa("meška", 10);
        System.out.println(rezultatas1);
        System.out.println(rezultatas2);
        System.out.println(rezultatas3);
        System.out.println(rezultatas4);
    }
    public static char isvestiZodzioRaidePagalIndeksa(String zodis, int indeksas) {
        if(indeksas < zodis.length()){
            return zodis.charAt(indeksas);
        }
        else if (indeksas > zodis.length()){
             System.out.println("Per didelis indeksas");
        }

    return 0;
    }

    }

