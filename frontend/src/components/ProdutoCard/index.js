import './styles.css';

const ProductCard = ({ produto, selecionado, toggleSelecionado }) => {
  return (
    <div className={`product-card ${selecionado ? 'selected' : ''}`} style={{ backgroundColor: produto.cor }}>
      <h2>{produto.nome}</h2>
      <p><strong>Marca:</strong> {produto.marca}</p>
      <p><strong>Preço:</strong> R$ {produto.preco}</p>
      <p><strong>Descrição:</strong> {produto.descricao}</p>
      <button onClick={toggleSelecionado}>
        {selecionado ? 'Desmarcar' : 'Selecionar'}
      </button>
    </div>
  );
}

export default ProductCard;

