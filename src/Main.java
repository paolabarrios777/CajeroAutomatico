import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int saldo=1000;
        int opcion = 0;
        float ingreso,retiro;
        while (opcion!=3) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("bienvenido al cajero automatico las estrellitas \n"
                    + "por favor ingrese 1 si desea ingresar el dinero a la cuenta \n"
                    + "por favor ingrese 2 si desea retirar el dinero de la cuenta \n"
                    + "por favor ingrese 3 si desea salir"));
            switch (opcion) {
                case 1:
                    ingreso = Float.parseFloat(JOptionPane.showInputDialog("por favor ingresar la cantidad que desea ingresar en la cuenta"));
                    saldo = (int) (saldo + ingreso);
                    JOptionPane.showMessageDialog(null, " dinero en la cuenta:" + saldo);
                    break;
                case 2:
                    retiro = Float.parseFloat(JOptionPane.showInputDialog("por favor ingrese la cantidad que desea retirar de la cuenta:"));

                    if (retiro > saldo) {
                        JOptionPane.showMessageDialog(null, "fondos insuficientes para realizar el retiro");
                    } else {
                        saldo = (int) (saldo - retiro);
                        JOptionPane.showMessageDialog(null, "dinero en la cuenta:" + saldo);
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "se equivoco al ingresar la opcion de menu");
                    break;
            }
        }
    }
}