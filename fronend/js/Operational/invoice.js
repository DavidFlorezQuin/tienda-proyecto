
document.addEventListener('DOMContentLoaded', function () {
    loadData();
  
  });


function loadData(){

fetch('http://localhost:9000/registro/v1/api/invoice/list',{
    method: 'GET',
    headers:{
        'Content-Type': 'application/json'
    }
})
.then((response)=>{
    if(!response.ok){
        throw new Error();
    }
    return response.json();
})
.then((data)=>{
    var html = '';

    const invoice = data.data

    invoice.forEach((item) => {
        html += `<tr>
        <td>`+ item.id + `</td>
        <td>`+ item.total + `</td>
        <td>`+ item.person + `</td>
        <td>`+ item.date + `</td>
        <td>`+ (item.state == true ? 'Activo' : 'Inactivo') + `</td>
        <th><img src="../../assets/icons/pencil-square.svg" alt="" onclick="findById(`+ item.id + `)"></th>
        <th><img src="../../assets/icons/trash3.svg" alt="" onclick="deleteById(`+ item.id + `)"></th>
        <th><button class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal"><img src="../../assets/icons/search.svg" alt="" onclick="detailsProduct(`+ item.id + `)"></a></th>
    </tr>`;
    });

    document.getElementById('resultData').innerHTML = html;

})

}

function detailsProduct(id){
    fetch('http://localhost:9000/registro/v1/api/invoice-detail/detail-data/' + id, {
    method: 'GET',
    headers: {
      'Content-Type': 'application/json'
    }
  })
  .then(response => {
    if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    return response.json();
  })

    
    .then(data => {
        var html = '';

        const supply = data.data
    
        supply.forEach((item) => {
            html += `<tr>
            <td>`+ item.id + `</td>
            <td>`+ item.name + `</td>
            <td>`+ item.quantity + `</td>
            <td>`+ item.price + `</td>
            <td>`+ item.totalProduct + `</td>
            <td>`+ (item.state == true ? 'Activo' : 'Inactivo') + `</td>
        </tr>`;
        });
    
        document.getElementById('resultSupply').innerHTML = html;
    
    })
    .catch(error => {
      // Función que se ejecuta si hay un error en la solicitud
      console.error('Error en la solicitud:', error);
    });
}