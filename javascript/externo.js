document.write('<p>Paragráfo novo na pagina</p>')

var a = 5

var b = 10

window.alert()
var firstName = "John"; lastName = "Doe"; age = 35;
x = ["marcos", 5, true]
const nome = "peidos morais" // ja recebeu um atributo e ela é imutavel 
//nome = "nome" // causa erro por que ela ja esta definida com imutavel com o (const name) onde ja recebeu um atributo
console.log(nome) // tambem causa erro
c = a + b; //a - b, a * b, a / b, a % b, a **b
a = a + b

if( a > b){
    console.log('A é menor que B');
}else{
    console.log("Elas são iguais")
}

str1 = "Wellinton"
str2 = "WELLINGTON"

if(str1 = str2){
    console.log("String iguais")
}else{
    console.log("String são diferentes")
}
console.log(str1)

x = 5
y = 3
if(x !=  y){
    console.log("variaveis diferentes")
}

(x == y) ? console.log("variaveis iguais") : console.log("variavais diferentes");

z = (x == y) ? x + y : x - y;
console.log(z)

h = "5"
k = "3"
console.log(Number(h)+Number(k)); // parseFloat parseint

console.log(String(h)+String(k)); // toString() forma de fazer a fariavel se torna string
console.log(h.toString() + k.toString())

string1 = "Blumenau"
entrada = 0;
for (i = entrada; i < string1.length; i++){
    entrada += i;
}
if(string1 == "Blumenau"){    
    for (i = entrada; i > -1 ; i--){ // use o laço para inverter a string "uanemuLB"
        console.log(string1[i])
    }
}else {
    for (i = 0; i < string1.length; i++){
        console.log(string1[i])
    }
}

function chamada(){
    console.log('Função chamada')
}

function chamadaParametro(p1){
    console.log('Paramatro -> 1' +p1);
}

function epar(pNumero){
    if((pNumero % 2) == 0){
       return true;
    }else{
        return false;

    }

}

function trocaestilo(){
    document.getElementById("Paragrafo").style.color='blue';
    document.getElementById('paragrafo').style.backgroundColor='red';
    document.getElementById('paragrafo').style.fontFamily='Verdana';

}