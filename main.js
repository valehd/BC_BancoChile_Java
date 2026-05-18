let boton1 = document.getElementById("iniciarsesionbtn");
boton1.addEventListener("click", function () {
  boton1.innerText = "Cerrar sesión";
});

let boton2 = document.getElementById("definicionbtn");
boton2.addEventListener("click", function () {
  boton2.style.display = "none";
});

let likesAtrigrado = 0;

let boton3 = document.getElementById("atigradobtn");
boton3.addEventListener("click", function () {
  likesAtrigrado++;
  atigradobtn.innerText = likesAtrigrado + " me gusta";
  alert("¡Gato atigrado was liked!");
});

let likesRetriever = 0;
let boton4 = document.getElementById("retrieverbtn");
boton4.addEventListener("click", function () {
  likesRetriever++;
  retrieverbtn.innerText = likesRetriever + " me gusta";
  alert("¡Golden Retriever was liked!");
});
