function obtenerFortuna() {
    fetch('/obtenerFortuna')
        .then(response => response.text())
        .then(mensaje => {
            document.getElementById('mensajeFortuna').textContent = mensaje;
        })
        .catch(error => console.error('Error:', error));
}