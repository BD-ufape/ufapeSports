import ApiService from './api';

class ProdutoService extends ApiService {
  constructor() {
    super('api/produtos')
  }

  getProdutoById(id) {
    return this.get(`/produto/${id}`)
  }

  createProduto(credenciais) {
    return this.post('/salvar', credenciais)
  }

  updateProduto(id, credenciais) {
    return this.put(`/atualizar/${id}`, credenciais)
  }

  deleteProduto(id) {
    return this.delete(`/deletar/${id}`)
  }

  countProdutos() {
    return this.get('/count')
  }

  getAllProducts() {
    return this.get('/todos')
  }

  getProdutosPorIDs(ids) {
    return this.get('/produtos', ids);
  }
}

export default ProdutoService;