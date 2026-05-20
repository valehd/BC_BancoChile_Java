


// creo variable que captura el ID del boton like del html
let like1= document.querySelector("#like1");

//creo un contador que parte de 0 
let contarLikes = 0;

like1.addEventListener("click", function() {
    contarLikes++;  // aqui se van sumando los likes del click (evento)
    like1.innerHTML = contarLikes + "likes(s)";
});





// creo variable que captura el ID del boton like del html
let like2= document.querySelector("#like2");

//creo un contador que parte de 0 


like2.addEventListener("click", function() {
    contarLikes++;  // aqui se van sumando los likes del click (evento)
    like2.innerHTML = contarLikes + "likes(s)";
});
