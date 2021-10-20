
var teclas = {
    UP : 38,
    DOWN : 40,
    LEFT : 37,
    RIGHT : 39
};

var lienzo = document.getElementById("fondito");
var papel = lienzo.getContext("2d");

var vaca = new Image();
vaca.src = "vaca.png";
vaca.addEventListener("load",dibujar);

var cerdo = new Image();
cerdo.src = "cerdo.png";
cerdo.addEventListener("load",dibujar);

var pollo = new Image();
pollo.src = "pollo.png";
pollo.addEventListener("load",dibujar);

var fondo = new Image();
fondo.src= "tile.png";
fondo.addEventListener("load", dibujar);


function dibujar(){
    var x = 250;
    var y = 250;

    document.addEventListener("keyup",caminar);
    
    papel.drawImage(fondo,0,0);
    var cantidadVacas = aleatorio(3,25);

    for (var v = 0; v < cantidadVacas; v++){
        papel.drawImage(vaca,aleatorio(0,5)*70,aleatorio(0,5)*70);
    }
    var cantidadPollos = aleatorio(2,10);

    for(var p = 0; p < cantidadPollos; p++){
        papel.drawImage(pollo,aleatorio(50,450),aleatorio(50,450));
    }  
    
       papel.drawImage(cerdo,x,y); 


    function caminar(teclado){
        var distanciaRecorrido = 10;

        switch(teclado.keyCode){
            case teclas.UP:
                papel.drawImage(cerdo,x,y - distanciaRecorrido); 
                y = y  - distanciaRecorrido;
                papel.drawImage.clearRect();  
            break;
            case teclas.DOWN:
                papel.drawImage(cerdo,x, y + distanciaRecorrido);
                y = y + distanciaRecorrido;
            break;
            case teclas.RIGHT:
                papel.drawImage(cerdo,x + distanciaRecorrido, y);
                x = x + distanciaRecorrido;
            break;
            case teclas.LEFT:
                papel.drawImage(cerdo,x - distanciaRecorrido, y);
                x = x - distanciaRecorrido;
            break;
        }
    }
}



function aleatorio (min, max){
    var resultado;
    resultado = Math.floor(Math.random() * (max-min +1))+ min;
    return resultado;
}

    
   



