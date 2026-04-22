import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int A, B;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));
        if (A > B){
            JOptionPane.showMessageDialog(null,"O maior número é: " + A);
        }else{ 
           if (A == B) {
               JOptionPane.showMessageDialog(null,"Os números " + A + " e " + B + " são iguais.");
           }else{
               JOptionPane.showMessageDialog(null,"O maior número é: " + B);
           }
        }
    }
}
