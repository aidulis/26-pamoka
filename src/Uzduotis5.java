public class Uzduotis5 {
    public static void main(String[] args) {

        boolean rezultatas1 = patikrintiArAtitinkamiZodzioSimboliaiVienodi("ananasas", 5, 7);
        boolean rezultatas2 = patikrintiArAtitinkamiZodzioSimboliaiVienodi("ananasas", 0, 7);
        System.out.println(rezultatas1);
        System.out.println(rezultatas2);

    }
    public static boolean patikrintiArAtitinkamiZodzioSimboliaiVienodi(String zodis, int i1, int i2){
        if (zodis.charAt(i1) == zodis.charAt(i2)){
            return true;
        }
        else{
            return false;
        }
    }
}
