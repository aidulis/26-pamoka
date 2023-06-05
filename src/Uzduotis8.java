public class Uzduotis8 {
    public static void main(String[] args) {

        String rezultatas1 = patikrintiZodzioGimine("anakonda");
        String rezultatas2 = patikrintiZodzioGimine("antanas");
        String rezultatas3 = patikrintiZodzioGimine("gervė");
        String rezultatas4 = patikrintiZodzioGimine("rikis");
        System.out.println(rezultatas1);
        System.out.println(rezultatas2);
        System.out.println(rezultatas3);
        System.out.println(rezultatas4);

    }

    public static String patikrintiZodzioGimine(String s1) {
        if (s1.endsWith("as")) {
            return "Vyriškos";
        } else if (s1.endsWith("is")) {
            return "Vyriškos";
        } else if (s1.endsWith("ys")) {
            return "Vyriškos";
        } else if (s1.endsWith("(i)us")) {
            return "Vyriškos";
        } else if (s1.endsWith("uo")) {
            return "Vyriškos";
        }
        else if(s1.endsWith("a")){
            return "Moteriškos";
        }
        else if(s1.endsWith("ė")){
            return "Moteriškos";
        }
        else if(s1.endsWith("i")){
            return "Moteriškos";
        }
        else if(s1.endsWith("is")){
            return "Moteriškos";
        }
        else if(s1.endsWith("uo")){
            return "Moteriškos";
        }
        else{
            return "Niekatrosios";
        }

    }
}
