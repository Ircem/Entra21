
  
  var modal = document.getElementById('id01');
  
  // clique (leo)
  window.onclick = function(event) {
      if (event.target == modal) {
          modal.style.display = "none";
      }
  }

  
function openNav() {
    document.getElementById("mySidepanel").style.width = "250px";
  }
  
  
  function closeNav() {
    document.getElementById("mySidepanel").style.width = "0";
  }