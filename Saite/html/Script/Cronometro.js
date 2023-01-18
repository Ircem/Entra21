var tr = document.createElement("tr");
var t1 = document.createElement("td");
var t2 = document.createElement("td");
id = document.cookie
// usado para dar a contagem de tempo (wili)
function myFunction23() {
    var d = new Date();
    d.setHours(d.getHours() + 1);
    var deadline = new Date(d).getTime();
    var x = setInterval(function () {
        var now = new Date().getTime();
        var t = deadline - now;
        var hours = Math.floor((t % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
        var minutes = Math.floor((t % (1000 * 60 * 60)) / (1000 * 60));
        var seconds = Math.floor((t % (1000 * 60)) / 1000);
        document.getElementById("demo").innerHTML = hours + "h " + minutes + "m " + seconds + "s ";
        if (t < 0) {
            clearInterval(x);
            document.getElementById("demo").innerHTML = "EXPIRED";
        }
    }, 1000);
}
// usado para pegar a placa do veiculo (leo)
async function Buscar_Placa() {
    const retonar = await fetch('http://localhost:8080/RegistroComplementar/' + id + "/Pessoa");
    const car = await retonar.json();
    var Procura_placa = JSON.parse(localStorage.getItem('Placa_pesquisa'))
    var o = 0;
    for (let i = 0; i < car.length; i++) {
        if (car[i].pl_carro == Procura_placa) {
            t1.innerHTML = "Proprietario: " + car[i].id_Pessoa.nm_Pessoa + "<br>"
            tr.appendChild(t1)
            document.getElementById("Tempo_Cro").appendChild(tr)
            tr = document.createElement("tr")
            t2.innerHTML = "Veiculo: " + car[i].mr_carro + "\n Placa: " + car[i].pl_carro + "\n Ano: " + car[i].ano_carro;
            tr.appendChild(t2)
            document.getElementById("Tempo_Cro").appendChild(tr);
            tr = document.createElement("tr");
            t2 = document.createElement("td");
            Procura_placa = "";
            o = 1;
            break;




        }
    }
    if (o == 0) {
        tr = document.createElement("tr");
        t1.innerHTML = Procura_placa + " não encontrado"
        tr.appendChild(t1)
        document.getElementById("Tempo_Cro").appendChild(tr)
    }

}