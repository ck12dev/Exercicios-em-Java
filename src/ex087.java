/* Crie um programa que melhore o procedimento Gerador() da questão anterior
para que mostre uma mensagem personalizada, passada como parâmetro.
Ex: Ao chamar Gerador("Aprendendo Java") aparece:
+-------=======------+
 Aprendendo Java
+-------=======------+ */

public class ex087 {
    static void Gerador(String txt) {
        System.out.println("+-------=======------+");
        System.out.println("| " + txt + " |");
        System.out.println("+-------=======------+");
    }
    public static void main(String[] args) {
        Gerador("Aprendendo Java");
    }
    
}
