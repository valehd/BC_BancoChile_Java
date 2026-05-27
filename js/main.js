//funcionalidad 1: hacer click en votar aumenta  en uno la cantidad de votos

let botones = document.querySelectorAll(".votar");

botones.forEach(function (boton) {

  let votos = 0;

  boton.addEventListener("click", function () {
    votos++;
     let contador = boton.parentElement.querySelector(".contador");

    contador.textContent = votos;
  });

});

// funcionalidad 2: click en boton filtrar muestra alerta

document.querySelector("#btnFiltrar").addEventListener("click", function () {
  alert("Agregando filtros...");
});


//funcionalidad 3: cambio de color al pasar el click


let titulo = document.querySelector("h1");

titulo.addEventListener("mouseover", function () {

  titulo.style.color = "rgb(253, 230, 128)";
});

titulo.addEventListener("mouseout", function () {
  titulo.style.color = "white";
});