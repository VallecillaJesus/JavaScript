function dibujarLinea(color,xinicial,yinicial,xfinal,yfinal)
{
    lienzo.beginPath();
    lienzo.strokeStyle = color;
    lienzo.moveTo(xinicial,yinicial);
    lienzo.lineTo(xfinal,yfinal);
    lienzo.stroke();
    lienzo.closePath();
}

function dibujarBordes(){//Dibuja los bordes del cuadrado del Canvas
    dibujarLinea("white",1,1,1,299);
    dibujarLinea("white",1,1,299,1);
    dibujarLinea("white",1,299,299,299);
    dibujarLinea("white",299,1,299,299);
}


var d = document.getElementById("dibujo");
var textobebe = document.getElementById("textobebesito");
var boton = document.getElementById("botoncito");
var lienzo = d.getContext("2d");
dibujarBordes();

boton.addEventListener("click",cuandoHagaClick);

function cuandoHagaClick(){
    var l;
    var ancho = d.clientWidth;
    var lineas = parseInt(textobebe.value);
    var yi,xf;
    var espacio = ancho/lineas;

    for(l=0;l<lineas;l++){
        xf=espacio*(l+1);
        yi=espacio*l;
        dibujarLinea("brown",0,yi,xf,300);
        xf=(-espacio*(l+1))+300;
        yi=(-espacio*l)+300;
        dibujarLinea("brown",300,yi,xf,0);
        yi=(-espacio*l)+300;
        xf=espacio*(l+1);
        dibujarLinea("brown",0,yi,xf,0);
        dibujarLinea("brown",300,yi,xf,300);
}
}






