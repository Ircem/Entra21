var id = document.cookie;

//cadastra uma pessoa no banco (leo)
function enviar_log() {
  var ent1 = document.getElementById('password_res').value;
  var ent2 = document.getElementById('passwordconfirmation').value;
  if(ent1 == ent2){
  var EntradaPessoa = {
    nm_Pessoa: document.getElementById('name_res').value,
    sn_Pessoa: document.getElementById('lastname_res').value,
    em_Pessoa: document.getElementById('email_res').value,
    senha_Pessoa: document.getElementById('password_res').value,
    ida_Pessoa: 0
  };
  
  //enviando os dados para o banco (leo)
  fetch("http://localhost:8080/Pessoa",
    {
      method: "POST",
      body: JSON.stringify(EntradaPessoa),
      headers: {
        'Content-Type': 'application/json'
      }

    })
    .then(function (res) { return res.json(); })
    .then(function (data) { alert(JSON.stringify(data)) })
      
    return
  }else{
    window.alert("senhas não são identicas")
  }
}





//cadastra o Complemento no banco (leo)
function enviar_Rcpleta() {    
  var novo = {
    mr_carro: document.getElementById('ModeloCar_Cadas').value,
    pl_carro: document.getElementById('PlacaCar_Cadas').value,
    ano_carro: document.getElementById('AnoCar_Cadas').value,    
  };


  fetch('http://localhost:8080/RegistroComplementar/' + id,
    {
      method: "POST",
      body: JSON.stringify(novo),
      headers: {
        'Content-Type': 'application/json'
      }

    })
    .then(function (res) { return res.json(); })
    .then(function (data) { alert(JSON.stringify(data)) })

}






//Alterar os dados do banco ja criado (leo)
function Autera_Pessoa() {  
  if (document.getElementById('senha_Edit').value == document.getElementById('SenhaComfimar_Edit').value) {
    var Empessoa = {
      nm_Pessoa: document.getElementById('nmPessoa').value,
      sn_Pessoa: document.getElementById('smPessoa_Edit').value,
      em_Pessoa: document.getElementById('Email_Edit').value,
      senha_Pessoa: document.getElementById('senha_Edit').value,
      ida_Pessoa: document.getElementById('idadePessoa_Edit').value

    }
    fetch('http://localhost:8080/Pessoa/' + id,
      {
        method: 'PUT',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(Empessoa),
      })
      .then(function (res) { return res.json(); })
      .then(function (data) { alert(JSON.stringify(data)) })
  } else
    return window.alert("As senha não estão batendo")
}

function TrocaImagem(Imagem_per,caminhoNovaImagem){
  document.getElementById(Imagem_per).src = caminhoNovaImagem; 
}