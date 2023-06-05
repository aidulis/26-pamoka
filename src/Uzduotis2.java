public class Uzduotis2 {
    public static void main(String[] args) {

        char rezultatas1 = grazintiZodzioPaskutineRaide("ananasas");
        char rezultatas2 = grazintiZodzioPaskutineRaide("Sakinys.");
        char rezultatas3 = grazintiZodzioPaskutineRaide("meška");
        System.out.println(rezultatas1);
        System.out.println(rezultatas2);
        System.out.println(rezultatas3);

    }

    public static char grazintiZodzioPaskutineRaide(String zodis){
        return (zodis.charAt(zodis.length() - 1));
    }
}
