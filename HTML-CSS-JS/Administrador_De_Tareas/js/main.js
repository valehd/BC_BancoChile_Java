//funcionalidad 1: alerta con input

//obtener el texto del imput
let texto = document.querySelector("#textoingresado");

//obtener el boton
let boton = document.querySelector("#crearTarea");

//agregar el evento on click --> uso eventlistener
boton.addEventListener("click", function () {
  alert("agregando:" + texto.value);
});

//funcionalidad 2: modificar p en tareas, dejarlo subrayado al hacer click

//capturo el primer p de la clase tarea
let tareaClick = document.querySelectorAll(".tarea p");

tareaClick.forEach(function (tarea) {
  tarea.addEventListener("click", function () {
    tarea.style.textDecoration = "line-through";
  });
});

//funcionalidad 3: cursor sobre icono, cambia a otro icono

function cambiarImagen() {
  let imgNotificacion = document.getElementById("notificacion");
  if (imgNotificacion.src.includes("notificaciones-1.png")) {
    imgNotificacion.src = "imgs/notificaciones-2.png";
  } else {
    imgNotificacion.src = "imgs/notificaciones-1.png";
  }
}
