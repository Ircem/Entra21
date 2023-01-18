////Retonar os dados da pessoa logado no pervil Tabela RegistroComplementar (leo)
async function Retonar_Rcom() {    
    const retonar = await fetch('http://localhost:8080/RegistroComplementar');
    const names = await retonar.json();
    for (let i = 0; i < names.length; i++) {
        if (names[i].id_complemtar == id) {
            var rt = document.createElement("td");
            var rt2 = document.createElement("td");
            var rt3 = document.createElement("td");
            rt.innerHTML = names[i].mr_carro;
            document.getElementById("modeloCarpf").appendChild(rt)
            rt2.innerHTML = names[i].pl_carro;
            document.getElementById("Placa_car_pf").appendChild(rt2);
            rt3.innerHTML = names[i].ano_carro;
            document.getElementById("Ano_car_pf").appendChild(rt3)
        }
    }
}

//Retonar os dados da pessoa logado no pervil Tabela Pessoa (leo)
async function Retonar_Pessoa() {
    const response = await fetch('http://localhost:8080/Pessoa');
    const names = await response.json();
    for (let i = 0; i < names.length; i++) {
        if (names[i].id_Pessoa == id) {
            var t = document.createElement("td");
            var t2 = document.createElement("td");
            var t3 = document.createElement("td");
            var t4 = document.createElement("td");
            t.innerHTML = names[i].nm_Pessoa;
            document.getElementById("Rnm_pessoa").appendChild(t)
            t2.innerHTML = names[i].sn_Pessoa;
            document.getElementById("sbPessoa").appendChild(t2)
            t3.innerHTML = names[i].em_Pessoa;
            document.getElementById("E-mail_pf").appendChild(t3)
            t4.innerHTML = names[i].ida_Pessoa
            document.getElementById("Idade_pessoa").appendChild(t4)

        }

    }
}
// sistema de fazer log etenor (leo)
async function logado_log() {
    const response = await fetch('http://localhost:8080/Pessoa');
    const name = await response.json();
    for(let i = 0;i < name.length;i++){
    if(document.cookie == 0){
        return;
    }
    if (document.cookie == name[i].id_Pessoa) {
        document.getElementById('Perfil').style.display = 'block'        
        document.getElementById('Sair').style.display = 'block'
        document.getElementById('log_sum').style.display = 'none'
        document.getElementById('res_sum').style.display = 'none'
        document.getElementById('Placa_pesquisa').style.display = 'block' 
        document.getElementById('PesBoPla').style.display = 'block'
        Retonar_Rcom()
    }

    }

}
// fazer login(volta_log) (leo)
async function logar() {    
    var email = document.getElementById('email_log').value
    var senha = document.getElementById('password_log').value
    const response = await fetch('http://localhost:8080/Pessoa');
    const name = await response.json();
    for(let i = 0;i < name.length;i++){        
        if(name[i].em_Pessoa == email && name[i].senha_Pessoa == senha){
            localStorage.setItem('Nome_entrada',JSON.stringify(name[i].nm_Pessoa))
            return document.cookie = name[i].id_Pessoa
        }
        
    }
     window.alert("Senha errada")
}
// sair da conta (leo)
function Saircoocke(){
  document.cookie =  0;
  localStorage.clear();
}

