import React, { useEffect, useState } from 'react';
import ProductCard from '../../components/ProdutoCard';
import axios from 'axios';
import { Link } from 'react-router-dom';

const Produtos = () => {
  const [produtosSelecionados, setProdutosSelecionados] = useState([]);
  const [todosProdutos, setTodosProdutos] = useState([]);

  const toggleProdutoSelecionado = (produto) => {
    if (produtosSelecionados.includes(produto)) {
      setProdutosSelecionados(produtosSelecionados.filter((p) => p !== produto));
    } else {
      setProdutosSelecionados([...produtosSelecionados, produto]);
    }
  };

  useEffect(() => {
    console.log("Produtos selecionados:", produtosSelecionados);
  }, [produtosSelecionados]);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await axios.get('http://localhost:8080/api/produtos/todos');
        const produtosTemporario = response.data;
        setTodosProdutos(produtosTemporario);
      } catch (error) {
        console.error('Erro ao buscar produtos:', error);
      }
    };
  
    fetchData();
  }, []);

  return (
    <div>
      <h1>Produtos</h1>
      <div>
        {todosProdutos.map((produto) => (
          <ProductCard
            key={produto.id}
            produto={produto}
            selecionado={produtosSelecionados.includes(produto)}
            toggleSelecionado={() => toggleProdutoSelecionado(produto)}
          />
        ))}
      </div>
      <Link
        to={{
          pathname: '/compra',
          search: `?produtos=${produtosSelecionados.map((produto) => produto.produtoID).join(',')}`,
        }}
      >
        <button>Levar para a tela de compra</button>
      </Link>
    </div>
  );
}

export default Produtos;

