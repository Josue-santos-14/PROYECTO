// Call the dataTables jQuery plugin
$(document).ready(function() {

  cargarUsuarios();

  $('#usuarios').DataTable();
});

async cargarUsuarios()
{

  const request = await fetch('usuarios', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const usuarios = await request.json();

  let listadoHTML = '';
  for (let usuario of usuarios) {
    let usuarioHTML ='<tr><td>'+usuario.id+'</td><td>'+usuario.ape+'</td><td>'+usuario.email+'</td><td>'+usuario.telefono
    +' </td><td><a href="#" className="btn btn-danger btn-circle btn-sm"><i className="fas fa-trash"></i></a></td></tr>';


    ListadoHtml += usuarioHTML;
  }

  document.querySelector('#usuarios tbody').outerHTML = usuario;

}
