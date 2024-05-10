// Obtener los datos almacenados en localStorage
const loginDataString = localStorage.getItem("loginData");

// Verificar si los datos existen
if (loginDataString) {
  // Convertir la cadena JSON almacenada en un objeto JavaScript
  const loginData = JSON.parse(loginDataString);

  // Aquí puedes acceder a los datos necesarios
  const userData = loginData.user;
  const rolesData = loginData.roles;
  const viewData = loginData.view;

  console.log(userData);
  console.log(rolesData);
  console.log(viewData);

  const username = loginData.user.user;


  const usernameDiv = document.getElementById("saludo");
usernameDiv.textContent = `¡Hola, ${username}!`; // O cualquier otro formato que desees
} else {
  // Manejar el caso en que no se encuentren los datos en localStorage
  console.log("No se encontraron datos de inicio de sesión en localStorage");
}


