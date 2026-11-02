void main() {

float salarioatual = Float.parseFloat (IO.readln("qual seu salário? "));
float percentualganho = Float.parseFloat (IO.readln("e aumentou quanto? "));
float resultado = salarioatual + (salarioatual * percentualganho / 100);

IO.println("seu novo salário é: " + resultado);

}
