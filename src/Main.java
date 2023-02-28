import javax.swing.JOptionPane;
public class Main {

    public static double leerValor() {
        String dato ="";
        do {
            dato = JOptionPane.showInputDialog("Introduce valor numerico");
        } while (!esNumero(dato));
        return Double.parseDouble(dato);
    }

    public static void imprimirValor(String valor) {
        JOptionPane.showMessageDialog(null, valor);
    }

    public static boolean esNumero(String valor) {
        for(int i=0;i<valor.length();i++) {
            if (Character.isDigit(valor.charAt(i))!=true) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        imprimirValor("Primer Prisma");
        Prismatri prisma1 = new Prismatri();
        prisma1.setLadotriangulo(leerValor());
        prisma1.setAltura(leerValor());
        String area1 = ""+prisma1.areaTotal();
        imprimirValor(area1);
        imprimirValor("Segundo Prisma");
        Prismatri prisma2 = new Prismatri();
        prisma2.setLadotriangulo(leerValor());
        prisma2.setAltura(leerValor());
        String area2 = ""+prisma2.areaTotal();
        imprimirValor(area2);
        imprimirValor("Tercer Prisma");
        Prismatri prisma3 = new Prismatri();
        prisma3.setLadotriangulo(leerValor());
        prisma3.setAltura(leerValor());
        String area3 =""+prisma3.areaTotal();
        imprimirValor(area3);
    }
}