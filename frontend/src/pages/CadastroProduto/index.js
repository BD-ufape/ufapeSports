import { useState } from 'react';
import "./styles.css";
import ProdutoService from '../../services/ProdutoService';
import SucessoCard from '../../components/SucessoCard';

function CadastroProduto() {

  const [nome, setNome] = useState('');
  const [marca, setMarca] = useState('');
  const [preco, setPreco] = useState('');
  const [estoque, setEstoque] = useState('');
  const [descricao, setDescricao] = useState('');
  const [peso, setPeso] = useState('');
  const [cor, setCor] = useState('');

  const [card, setCard] = useState(false);

  const produtoService = new ProdutoService();

  function handleSubmit(e) {
    e.preventDefault();
    produtoService.createProduto({
      nome: nome,
      marca: marca,
      preco: preco,
      estoque: estoque,
      descricao: descricao,
      peso: peso,
      cor: cor
    }).then((response) => {
      console.log('deu bom')
      setCard(true);
      setTimeout(() => {
        setCard(false)
      }, 3000);
    }).catch((error) => {
      console.log('deu ruim')
    })

  }

  function handleChangeNome(e) {
    setNome(e.target.value)
  }

  function handleChangeMarca(e) {
    setMarca(e.target.value)
  }

  function handleChangePreco(e) {
    setPreco(e.target.value)
  }

  function handleChangeEstoque(e) {
    setEstoque(e.target.value)
  }

  function handleChangeDescricao(e) {
    setDescricao(e.target.value)
  }

  function handleChangePeso(e) {
    setPeso(e.target.value)
  }

  function handleChangeCor(e) {
    setCor(e.target.value)
  }

  return(
    <div className='produto'>
      <h1>Cadastrar Produto</h1>
      <form onSubmit={handleSubmit}>
        <div className='inputs-produto'>
            <div>
              <label>Nome:</label>
              <input type='text'onChange={handleChangeNome} value={nome}/>
              <label>Marca:</label>
              <input type='text'onChange={handleChangeMarca} value={marca}/>
              <label>Preço:</label>
              <input type='text'onChange={handleChangePreco} value={preco}/>
              <label>Estoque:</label>
              <input type='text'onChange={handleChangeEstoque} value={estoque}/>
              <label>Descrição:</label>
              <input type='text'onChange={handleChangeDescricao} value={descricao}/>
              <label>Peso:</label>
              <input type='text'onChange={handleChangePeso} value={peso}/>
              <label>Cor:</label>
              <input type='text'onChange={handleChangeCor} value={cor}/>
            </div>
          </div>
        <button type='submit'>Cadastrar</button>
      </form>
      {card && <SucessoCard/>}
    </div>
  )
}

export default CadastroProduto;