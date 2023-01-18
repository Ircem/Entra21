var tr = document.createElement("tr");
var t1 = document.createElement("td");
var t2 = document.createElement("td");
var id = document.cookie;



var recebe_pro;
var sOs;

function Procura_pessoa() {
    recebe_pro = JSON.parse(localStorage.getItem('Procura_nv'))
    Chamado_v()
}
function Procura() {
    recebe_pro = JSON.parse(localStorage.getItem('Nome_entrada'))
    Chama_Cronometro()
}


async function Chamado_v() {
    const response = await fetch('http://localhost:8080/Pessoa');
    const names = await response.json();
    var idp
    var o = 0;
    
    for (let i = 0; i < names.length; i++) {       
        if (names[i].nm_Pessoa == recebe_pro) {                       
            t1.innerHTML = "Proprietario: " + names[i].nm_Pessoa + "<br>"           
            tr.appendChild(t1)            
            document.getElementById("Vem_nome").appendChild(tr)
            tr = document.createElement("tr")           
            idp = names[i].id_Pessoa
            recebe_pro = ""
            o = 1
            break;
        }
        
        
        
    }
    const retonar = await fetch('http://localhost:8080/RegistroComplementar/' + idp + "/Pessoa");
    const car = await retonar.json();
    for (let y = 0; y < car.length; y++) { 
        if (car[y].id_Pessoa.id_Pessoa == idp) {            
            t2.innerHTML = "Veiculo: " + car[y].mr_carro + "\n Placa: " +  car[y].pl_carro + "\n Ano: " + car[y].ano_carro;
            tr.appendChild(t2)                    
            document.getElementById("Vem_nome").appendChild(tr);
            tr = document.createElement("tr");
            t2 = t2 = document.createElement("td"); 
            o = 1
        }
    }
    for (let i = 0; i < car.length; i++) {
        if (car[i].pl_carro == recebe_pro) {
            window.alert('oi')
            t1.innerHTML = "Proprietario: " + car[i].id_Pessoa.nm_Pessoa + "<br>"
            tr.appendChild(t1)
            document.getElementById("Vem_nome").appendChild(tr)
            tr = document.createElement("tr")
            t2.innerHTML = "Veiculo: " + car[i].mr_carro + "\n Placa: " + car[i].pl_carro + "\n Ano: " + car[i].ano_carro;
            tr.appendChild(t2)
            document.getElementById("Vem_nome").appendChild(tr);
            tr = document.createElement("tr");
            t2 = document.createElement("td");
            Procura_placa = "";
            o = 1;
            break;




        }
    }
    if (o == 0) {
        tr = document.createElement("tr");
        t1.innerHTML = recebe_pro + " não encontrado"
        tr.appendChild(t1)
        document.getElementById("Vem_nome").appendChild(tr)
    }
}

async function Chamado_pTempo() { 
    tr = document.createElement("tr");
    t1 = document.createElement("td");
    t2 = document.createElement("td");      
    const response = await fetch('http://localhost:8080/Pessoa');
    const names = await response.json();

    sOs =  JSON.parse(localStorage.getItem('Placa_pesquisa'))

    const retonar = await fetch('http://localhost:8080/RegistroComplementar/' + id + "/Pessoa");
    const car = await retonar.json();        
    
    for (let y = i; y < car.length; y++) {                
    if (car[y].pl_carro == sOs) { 
        console.log('oi')                                    
        t2.innerHTML = "Veiculo: " + car[y].mr_carro + "\n Placa: " +  car[y].pl_carro + "\n Ano: " + car[y].ano_carro;
            tr.appendChild(t3)                    
            document.getElementById("Vem_nome").appendChild(tr);
            tr = document.createElement("tr");   
            t2 = document.createElement("td");         
        }
}
}

async function Chama_Cronometro() {    
    const response = await fetch('http://localhost:8080/Pessoa');
    const names = await response.json();    
    for (let i = 0; i < names.length; i++) {       
        if (names[i].nm_Pessoa == recebe_pro) {                       
            t1.innerHTML = "Proprietario: " + names[i].nm_Pessoa + "<br>"           
            tr.appendChild(t1)            
            document.getElementById("Recebe_Cro").appendChild(tr)
            tr = document.createElement("tr")           
            recebe_pro = ""
            break;
        }
        
        
        
    }
    const retonar = await fetch('http://localhost:8080/RegistroComplementar/' + id + "/Pessoa");
    const car = await retonar.json();    
    for (let y = 0; y < car.length; y++) {             
        if (car[y].id_Pessoa.id_Pessoa == id) {
            t2.innerHTML = "Veiculo: " + car[y].mr_carro + "\n Placa: " +  car[y].pl_carro + "\n Ano: " + car[y].ano_carro;
            tr.appendChild(t2)                    
            document.getElementById("Recebe_Cro").appendChild(tr); 
            tr = document.createElement("tr");   
            t2 = document.createElement("td"); 
        }
    }
}