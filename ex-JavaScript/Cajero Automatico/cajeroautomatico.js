class Billete{
    constructor(v,c){
        this.valor = v;
        this.cantidad = c;
    }
}


function entregarDinero(){
    
    var t = document.getElementById("cantidad");
    dinero = parseInt(t.value);
    dinero = Math.floor(dinero);
    for(var bi of caja)
    {
        if(dinero > 0){
            div = Math.floor(dinero/bi.valor);
            if(div > bi.cantidad){
                papeles = bi.cantidad;
            }
            else{
                papeles = div;
            }
            entregado.push(new Billete(bi.valor,papeles));
            dinero -= (bi.valor * papeles);
        }
        bi.cantidad -= papeles;
    }
    if(dinero>0){

        registro.innerHTML= "La cantidad que esta solicitando de billetes es demasiada, por lo tanto le estoy dando <br>todo lo que tengo maldito imbecil de mierda RESPETEMEEE!!!!.";
        registro.innerHTML ="ERROR, Mucho dinero, no lo puedo soportar";
    }
    else{
        for( var e of entregado){

            registro.innerHTML += e.cantidad + " billete de $" + e.valor + ".000<br><hr>";
        }
    }

}

var entregado = [];
var caja=[];

caja.push(new Billete(50,3));
caja.push(new Billete(20,2));
caja.push(new Billete(10,2));
var dinero;
var div = 0;
var papeles = 0;
var registro = document.getElementById("registro");
var screen = document.getElementById("estilo");
var resultado = document.getElementById("resultado");
var b = document.getElementById("botonsito");
b.addEventListener("click",entregarDinero);