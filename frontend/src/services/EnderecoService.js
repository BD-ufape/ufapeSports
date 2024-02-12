import ApiService from './api';

class EnderecoService extends ApiService {
  constructor() {
    super('/api/enderecos')
  }

  getEnderecoById(id) {
    return this.get(`/endereco/${id}`)
  }

  createEndereco(credenciais) {
    return this.post('/salvar', credenciais)
  }

  updateEndereco(id, credenciais) {
    return this.put(`/atualizar/${id}`, credenciais)
  }

  deleteEndereco(id) {
    return this.delete(`/deletar/${id}`);
  }

  countEnderecos() {
    return this.get('/count')
  }
}

export default EnderecoService;