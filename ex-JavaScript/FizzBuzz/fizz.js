
var texto = document.getElementById("textito");
var boton = document.getElementById("botoncito");
boton.addEventListener("click",respuestica);

function respuestica(){

    numero = parseInt(texto.value);

    for(i = 1; i <=numero; i++){
    
        if(i%3 == 0 && i%5 == 0){
            document.write(i + " = FizzBuzz <br>");
        }
        else{
            if(i%3 == 0){
                document.write(i + " = Fizz <br>");
            }
            else if(i%5 == 0){
                document.write(i + " = Buzz <br>");
            }
            else if(i%3 !== 0 && i%5 !== 0){
                document.write(i + " <br>")
            }  
        }
    }  
}