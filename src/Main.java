import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        final int primer_saldo=1000;
        int opcion;
        float ingreso, saldo_actual,retiro;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("bienvenido al cajero automatico las estrellitas \n"
        + "por favor ingrese 1 si desea ingresar el dinero a la cuenta \n"
        + "por favor ingrese 2 si desea retirar el dinero de la cuenta \n"
        + "por favor ingrese 3 si desea salir"));
             switch (opcion){
             case 1: ingreso= Float.parseFloat(JOptionPane.showInputDialog("por favor ingresar la cantidad que desea ingresar en la cuenta"));
                     saldo_actual=primer_saldo+ingreso;
                     JOptionPane.showMessageDialog(null," dinero en la cuenta:"+ saldo_actual);
             break;
             case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("por favor ingrese la cantidad que desea retirar de la cuenta:"));

             if (retiro>primer_saldo){
                     JOptionPane.showMessageDialog(null,"fondos insuficientes para realizar el retiro");
            }
             else {
                    saldo_actual = primer_saldo - retiro;
                     JOptionPane.showMessageDialog(null,"dinero en la cuenta:" + saldo_actual);
            }
             break;
             case 3:break;
             default:JOptionPane.showMessageDialog(null,"se equivoco al ingresar la opcion de menu"); break;
        }

    }
}