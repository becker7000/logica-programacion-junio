import javax.swing.*;

public class CalculadoraIMC {

    public static void main(String[] args) {

        // Entradas:
        double masa;
        double estatura;
        double imc;

        // Atajo: ctrl + d
        masa = Double.parseDouble(JOptionPane.showInputDialog("Escribe tu masa(kg): "));
        estatura = Double.parseDouble(JOptionPane.showInputDialog("Escribe tu estatura(m): "));

        // Calculos:
        imc = masa / Math.pow(estatura,2);

        // Salidas:
        JOptionPane.showMessageDialog(null,
                "Tu índice de masa corporal es: "+String.format("%.3f",imc),
                "IMC",JOptionPane.INFORMATION_MESSAGE);

    }

}
