public class Aufgabe2 {
    public static void main(String[] args){
        printName();
        for (int i=0; i<=2; i+=2){// i+=2 inkrementiert i um 2 und somit wird Kadir nur 2mal angezeigt
            System.out.println(printName());
        }
    }

    public static String printName(){
        String a = "Kadir";
        return a;

    }
}
