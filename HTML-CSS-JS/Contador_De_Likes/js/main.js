


// variable que obtiene la clase de html de los botones
let botonLike= document.querySelectorAll(".btn-like");
// variable que obtiene la clase de html del texto de likes
let Likes = document.querySelectorAll(".textoLike"); 

for (let i = 0; i < botonLike.length; i++){
    let contador = 0;
    botonLike[i].addEventListener("click", function(){
        contador++;
        Likes[i].textContent = contador + " like(s)";       
    });
}