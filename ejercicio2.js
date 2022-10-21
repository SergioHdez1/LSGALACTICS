/* Don José hace un 5% de descuento a los clientes que compran más de 3 productos y al
menos uno de ellos tiene un valor mayor a 10.000, realiza una función que calcule el
total verificando si corresponde o no el descuento.
*/

function descuentoPorProductos(valores) {
    let esMayor = false;
    let total = 0;
    for(var i=0; i<valores.length; i++) {
        //chequeamos si existe algun elemento mayor a 1000
        if(valores[i]>10000) {
            esMayor = true;
        }
        total = total + valores[i];
    }
    // verificamos las condiciones para aplicar el descuento
    if(valores.length>3 && esMayor) {
        //si se cumple, retornamos el valor con descuento
        return total*0.95;
    } else {
        //no se cumple, por lo que retornamos solo el total de la compra
        return total;
    }
}

console.log(descuentoPorProductos([1000,500,650,8000]));
console.log(descuentoPorProductos([10001,500,650,8000]));
console.log(descuentoPorProductos([10001,500,650]));