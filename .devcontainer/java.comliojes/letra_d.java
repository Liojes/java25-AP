void main (){

Float Nota1 = Float.parseFloat(IO.readln( " qual sua nota? "));
Float Nota2 = Float.parseFloat(IO.readln( " qual sua outra nota? "));
Float Nota3 = Float.parseFloat(IO.readln( " e a outra? "));
Float Media = (Nota1+Nota2+Nota3) / 3; 
IO.println ("Sua média é : " + Media);
}
