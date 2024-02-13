import './styles.css'
import React, { useEffect, useState } from 'react';
import ProdutoService from '../../services/ProdutoService';

const TelaDeCompra = () => {
  const [produtosSelecionadosDetalhes, setProdutosSelecionadosDetalhes] = useState([]);
  const [titular, setTitular] = useState('');
  const [dataVencimento, setDataVencimento] = useState('');
  const [numeroCartao, setNumeroCartao] = useState('');

  useEffect(() => {
    const searchParams = new URLSearchParams(window.location.search);
    const selectedProductIds = searchParams.get('produtos');

    if (selectedProductIds) {
      const selectedIdsArray = selectedProductIds.split(',').map(id => parseInt(id));
      console.log(selectedIdsArray);
      carregarDetalhesProdutosSelecionados(selectedIdsArray);
    }
  }, []);

  const carregarDetalhesProdutosSelecionados = async (selectedIdsArray) => {
    try {
      const produtoService = new ProdutoService();
      const detalhesProdutos = await produtoService.getProdutosPorIDs(selectedIdsArray);
      setProdutosSelecionadosDetalhes(detalhesProdutos);
    } catch (error) {
      console.error('Erro ao buscar detalhes dos produtos:', error);
    }
  };

  function handleSubmit(e) {
    e.preventDefault();
  }

  function handleChangeTitular(e) {
    setTitular(e.target.value)
  }

  function handleChangeDataVencimento(e) {
    setDataVencimento(e.target.value)
  }

  function handleChangeNumeroCartao(e) {
    setNumeroCartao(e.target.value)
  }

  return (
    <div className='compra'>
      <h1>Esses foram seus itens escolhidos:</h1>
      {produtosSelecionadosDetalhes.length > 0 ? (
        <ul>
          {produtosSelecionadosDetalhes.map((produto) => (
            <li key={produto.id}>
              <h2>{produto.nome}</h2>
              <p><strong>Marca:</strong> {produto.marca}</p>
              <p><strong>Preço:</strong> R$ {produto.preco}</p>
              <p><strong>Descrição:</strong> {produto.descricao}</p>
              <p><strong>Cor:</strong> {produto.cor}</p>
            </li>
          ))}
        </ul>
      ) : (
        <p>Nenhum produto selecionado</p>
      )}
      <form onSubmit={handleSubmit}>
        <label>Titular do cartão</label>
        <input type='text'placeholder='Ex.: Paulo Pereira Silva'value={titular} onChange={handleChangeTitular}/>
        <label>Data de vencimento do cartão</label>
        <input type='text' placeholder='Ex.: 04/28'value={dataVencimento} onChange={handleChangeDataVencimento}/>
        <label>Número do cartão</label>
        <input type='text' placeholder='Ex.: 0000 0000 0000 0000'value={numeroCartao} onChange={handleChangeNumeroCartao}/>
        <p>TOTAL DA COMPRA:</p>
        <button type='submit'>Finalizar a compra</button>
      </form>
    </div>
  );
};

export default TelaDeCompra;

















