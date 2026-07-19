
// funcionalidades 1: click en iniciar sesion muertra alertacon: bienvenido a la tienda de flores

let iniciarSesion= document.getElementById("iniciosesion")
iniciarSesion.addEventListener("click",function() {
alert("Bienvenido a la tienda de flores")
})

//pasar cursor en enviar flores el texto debe cambiar a envia bouquetes

let enviar= document.getElementById("enviaflores")
enviar.addEventListener("mouseover",(event) =>{
    event.target.textContent = "Envía Bouquetes";

})
enviar.addEventListener("mouseout", (e) => {
    e.target.textContent = "Envía Flores";
})

//click en boton comprar desaparace el boton comprar 

let comprarBotones = document.querySelectorAll(".comprar");

comprarBotones.forEach(boton => {
    boton.addEventListener("click", () => {
        boton.style.display = "none";
    });
});