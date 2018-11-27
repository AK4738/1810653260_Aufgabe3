import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String eingabe = JOptionPane.showInputDialog("Geben Sie etwas ein:");


        switch(eingabe){
            case "20":
                int zahl = Integer.parseInt(eingabe);
                int alter = zahl * 18;
                System.out.println(alter);
                break;

            case "Peterpan":
                System.out.println("Bangarang");
                break;

            default:
                System.out.println("System.err.println");
                break;
        }
    }
}
