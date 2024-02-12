import ApiService from './api';

class CompraService extends ApiService {
  constructor() {
    super('/api/compras')
  }

  buscarCompraPorId(id) {
    return this.get(`/buscarCompra/${id}`)
  }

  salvarCompra(credenciais) {
    return this.post('/salvar', credenciais)
  }

  buscarComprasPorClienteId(id) {
    return this.get(`/cliente/${id}`)
  }
}

export default CompraService;