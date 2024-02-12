import ApiService from './api';

class ClienteService extends ApiService{
  constructor() {
    super('/api/clientes')
  }

  getClienteById(id) {
    return this.get(`/${id}`)
  }

  createCliente(credenciais) {
    return this.post('/salvar', credenciais)
  }

  updateCliente(id, credenciais) {
    return this.put(`/atualizar/${id}`, credenciais)
  }

  deleteCliente(id) {
    return this.delete(`/deletar/${id}`)
  }

  countClientes() {
    return this.get('/count')
  }
}

export default ClienteService;