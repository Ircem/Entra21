//1ª Etapa
//Listener fica observando o usuário modificar o input todo, para executar tudo que vemos acima.
document.getElementById("uInput").addEventListener("input", validation); //Observa se o usuário colocou uma nova hora, então, captura ela.

//Função para invocar as duas anteriores e fazer a validação que você quer.
function validation(){
  //2ª Etapa
  //Função para obter os segundos proporcionais a hora do sistema.
  sysTime();
  //Função para obter os segundos proporcionais a hora informada pelo usuário.
  userTime();

  //3ª Etapa
  //Faz validação que você deseja.
  if(uTimeSecs < sysTimeSecs){//Condição confere se o usuário possui menos segundos que o sistema, portanto, se o horário é menor.
    document.getElementById('msg').innerHTML = "Hora inválida!"
    document.getElementById('submit').disabled = true;
  } else{
    document.getElementById('msg').innerHTML = "Hora válida!"
    document.getElementById('submit').disabled = false;
  }
}

function sysTime(){
  d = new Date(); //Obtém data, hora e etc...
  sysTimeSplit = [d.getHours(), d.getMinutes()]; //Separa horas e minutos, em uma array.
  sysTimeSecs = (sysTimeSplit[0] * 60 * 60) + (sysTimeSplit[1] * 60); //Converte as horas e minutos, em segundo, enquanto soma.
}

function userTime(){
  uTime = document.getElementById('uInput').value; //Obtém a hora digitada pelo usuário.
  uTimeSplit = uTime.split(':'); //Separa as horas e os minutos, usando sinal de dois pontos (:) como referência.
  uTimeSecs = (uTimeSplit[0] * 60 * 60) + (uTimeSplit[1] * 60); //Converte as horas e minutos, em segundo, enquanto soma.
}