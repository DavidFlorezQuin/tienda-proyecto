document
  .getElementById("loginForm")
  .addEventListener("submit", function (event) {
    event.preventDefault();

    const loginData = {
      username: document.getElementById("user").value,
      password: document.getElementById("password").value,
    };

    fetch("http://localhost:9000/registro/v1/api/user/login", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(loginData),
    })
      .then((response) => {
        if (!response.ok) {
          Swal.fire({
            icon: "error",
            title: "Oops...",
            text: "Credenciales incorrectas!",
          });

          throw new Error();
        }
        return response.json();
      })
      .then((data) => {
        
        localStorage.setItem("loginData", JSON.stringify(data.data));

        window.location.href = "./navbar.html";
      })
      .catch((error) => {});
  });
