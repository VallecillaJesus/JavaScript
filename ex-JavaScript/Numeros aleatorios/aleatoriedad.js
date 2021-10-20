var boton = document.getElementById("botoncito");
var texto = document.getElementById("numero");
var numeroMax = document.getElementById("numeritoMax");
var numeroMin = document.getElementById("numeritoMin");
boton.addEventListener("click",numeroLineas);


function numeroLineas(){ 
    var textito = parseInt(texto.value);
    var maximo = parseInt(numeroMax.value);
    var minimo = parseInt(numeroMin.value);
    
    var z; 
    var comas = "<br>";
    
    for(var i =0; i < textito; i++){
        z = aleatorio(minimo,maximo);
        document.write( z + comas);
    }  

    function aleatorio (min, max){
        var resultado;
        resultado = Math.floor(Math.random() * (max-min +1))+ min;
        return resultado;
    }
}