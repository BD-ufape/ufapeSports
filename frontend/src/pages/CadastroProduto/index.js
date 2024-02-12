import "./styles.css";

function CadastroProduto() {

  function handleSubmit(e) {
    e.preventDefault();

  }

  return(
    <div className='produto'>
      <h1>Cadastrar Produto</h1>
      <form onSubmit={handleSubmit}>
        <div className='inputs-produto'>
            <div>
              <label>Nome:</label>
              <input type='text'/>
              <label>Marca:</label>
              <input type='text'/>
              <label>Preço:</label>
              <input type='text'/>
              <label>Estoque:</label>
              <input type='text'/>
              <label>Descrição:</label>
              <input type='text'/>
              <label>Peso:</label>
              <input type='text'/>
              <label>Cor:</label>
              <input type='text'/>
            </div>
          </div>
        <button type='submit'>Cadastrar</button>
      </form>
    </div>
  )
}

export default CadastroProduto;