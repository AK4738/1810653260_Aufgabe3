public class Aufgabe2 {
    public static void main(String[] args){

        for (int i=0; i<=2; i+=2){// i+=2 inkrementiert i um 2 und somit wird Kadir nur 2mal angezeigt
            printName();
        }
        for (int f=0; f<=4; f++) {
                printName();
                printAge(f+20);
            }
            printAge(20);
        }


    public static void printName(){
        String a = "Kadir";
        System.out.println(a);
    }

    public static void printAge(int age){
        System.out.println(age);
    }
}
