//criando estrutura de decição

var numero = 10

if(numero > 5 ){

  println("$numero é maior que 5") //interpolação $ (+) variavel


}
else{
  println("$numero é menor que 5")
}


//if - else if - else

var number = 20

if(number < 5){
  println("$number é menor que 5")

}
  else if(number == 20){
    println("$number é igual a 20")
  }

else{
  println("Number é maior que 5 ou é diferente de 20, number é: $number")
}

/*
( ) - Parametro ou Condição
{ } - Bloco de comando 
*/


//estrutura de repetição - Laço de repetição (FOR)

for(i in 1..10){
    println("Me mostre i:$i")
    }
    