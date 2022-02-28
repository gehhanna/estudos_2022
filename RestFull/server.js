const express = require ("express");
const app = express();
const data = require ("./data.json");
// usando a notação json.
app.use(express.json());

// Verbos HTPP.
// GET: Receber dados de um Resource.
// POST: Enviar dados ou informações para serem processadas por um Resource.
// PUT: Atualizar dados de um Resource.
// DELETE: Deletar um Resource.

// end point que e no clients.
// uri que e o caminho completo. ->  http://localhost300/clients
// clients e o nome do meu Resource.
// essa uri e onde chamo o garçon. para anotar os pedidos bloquinho de notas.

// usaremos o end point que e o "/clients" 
//#boa pratica não utilizar barras no final do seu endpoint.

app.get("/clients", function(req, res) {
    res.json(data);
});

// pegar um unico client. colocar o id que e o parametro para pegar um unico cliente
// assim como no put e no delete so vai alterar um cliente ou deletar um cliente.
// req - requisição res - resposta.
app.get("/clients/:id", function(req, res) {
    const { id } = req.params;
    const client = data.find(cli => cli.id == id);
    // se não encontrar o cliente retorna status 204.
    if(!client) res.status(204).json();

    res.json(client);
});
app.post("/clients", function(req, res){
    const { name, email } = req.body;

    // salvar
    res.json({name, email});

});
app.put("/clients/:id", function(req, res){
    const { id } = req.params;
    const client = data.find(cli => cli.id == id);
    // se não encontrar o cliente retorna status 204.
    if(!client) res.status(204).json();
    // se achar o cliente pegar o nome do meu body.
    const { name } = req.body;
    // cliente name e igual o novo name que peguei do meu body.
    client.name = name;
    // se deu tudo certo responde para mim o cliente atualizado.
    res.json(client);

});
app.delete("/clients/:id", function(req, res){
    // recebo o id do cliente.
    const { id } = req.params;
    // e faço uma filtragem retornando todos clientes que o id for != diferente
    // do id que foi passado como parametro e assim gera uma Lista nova.
    const clientsFiltered = data.filter(client => client.id != id);

    // retorna uma lista nova com os clientes filtrados.
    res.json(clientsFiltered);
});

app.listen(3000, function(){
    console.log("Server is running");
});

