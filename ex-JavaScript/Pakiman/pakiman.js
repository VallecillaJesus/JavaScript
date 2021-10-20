
var imagenes = [];
imagenes["Cauchin"] = "vaca.png";
imagenes["Pokacho"] = "pollo.png";
imagenes["Tocinauro"] = "cerdo.png";

var coleccion = [];

coleccion.push(new Pakiman("Cauchin",100,30));
coleccion.push(new Pakiman("Pokacho",80,50)); 
coleccion.push(new Pakiman("Tocinauro",120,40));

for( var camilito of coleccion)
{
    camilito.mostrar();
}

for(var amiguito in coleccion[0])
{
    console.log(amiguito);
}
