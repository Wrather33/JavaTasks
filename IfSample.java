class IfSample {
public static void main (String [] args) { 
int a, b; 
a = 10; 
b = 20; 
if(a < b) System.out . println ( "Знaчeниe a меньше b") ; 
a = a * 2; 
if (a == b) System.out . println ( "Tenepь значение a равно b") ; 
a = a * 2; 
if (a > b) System.out . println ("Teпepь значение a больше b") ; 
// Здесь ничего не отобразится 
if (a == b) System.out . println ( "Этoт вывод вы не увидите") ; 
}}