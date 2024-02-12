import "./styles.css";

function CadastroUsuario() {

  function handleSubmit(e) {
    e.preventDefault();

  }

  return(
    <div className='cadastro'>
      <h1>Cadastrar conta</h1>
      <form onSubmit={handleSubmit}>
        <div className='inputs-cadastro'>
          <div className='input-box'>
          <h2>Dados pessoais</h2>
            <label>Nome:</label>
            <input type='text'placeholder='Ex.: João Vitor'/>
            <label>CPF:</label>
            <input type='text'placeholder='Ex.: 000.000.000-00'/>
            <label>Telefone:</label>
            <input type='text'placeholder='Ex.: (00)0000-0000'/>
            <label>Email:</label>
            <input type='text'placeholder='Ex.: exemplo@email.com'/>
          </div>
          <div className='input-box'>
          <h2>Endereço</h2>
            <label>CEP:</label>
            <input type='text'placeholder='Ex.: 00000-000'/>
            <label>Estado:</label>
            <input type='text'placeholder='Ex.: Pernambuco'/>
            <label>Cidade:</label>
            <input type='text'placeholder='Ex.: Recife'/>
            <label>Logradouro:</label>
            <input type='text'placeholder='Ex.: Frei caneca'/>
            <label>Bairro:</label>
            <input type='text'placeholder='Ex.: Vila madalena'/>
          </div>
        </div>

        <button type='submit'>Cadastrar</button>
      </form>
    </div>
  )
}

export default CadastroUsuario;