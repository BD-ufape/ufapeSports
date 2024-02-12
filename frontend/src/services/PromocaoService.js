import ApiService from './api';

class PromocaoService extends ApiService {
  constructor() {
    super('api/promocoes')
  }

  criarPromocao(credenciais) {
    return this.post('/adicionar', credenciais)
  }

  buscarPorId(id) {
    return this.get(`/promocao/${id}`)
  }

  listarTodas() {
    return this.get('/listarTodos')
  }

  deletarPromocao(id) {
    return this.delete(`/deletar/${id}`)
  }
}

export default PromocaoService;