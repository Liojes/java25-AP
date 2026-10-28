public class questao {
    void main(){
        String s1 = IO.readln("insira um número: ");
        String s2 = IO.readln("insira outro número: ");
        
        float Num1 = java.lang.Float.parseFloat(s1);
        float Num2 = java.lang.Float.parseFloat(s2);

        float mult = Num1 * Num2;

        IO.println(mult);
    }
}