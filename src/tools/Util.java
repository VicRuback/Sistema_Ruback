/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class Util {
    public static void habilitar(boolean valor, JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);
        }
    }

    public static void Limpar(JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] instanceof JTextField) {
                ((JTextField) componentes[i]).setText("");
            }
            if (componentes[i] instanceof JComboBox) {
                ((JComboBox) componentes[i]).setSelectedIndex(-1);
            }

        }
    }

    public static void mensagem(String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }

    public static boolean perguntar(String cad) {
         int opcao = JOptionPane.showConfirmDialog(
            null,
            cad,
            "Confirmação",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
    );
    return opcao == JOptionPane.YES_OPTION;
}
     public static int strToInt(String num) {
        return Integer.valueOf(num); 
       
    }
    public static String intToStr(int num) {
        return String.valueOf(num); 
       
    }
    public static double strToDouble(String num) {
        return 0; 
       
    }
    public static String doubleToStr(double num) {
        return ""; 
       
    }
    public static Date strDate(String data) {
        return null;
    }
     public static String dateToStr(Date data) {
        return "";
    }
}
