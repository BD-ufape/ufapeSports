import { useState } from 'react';
import "./styles.css";
import ClienteService from '../../services/ClienteService';
import SucessoCard from '../../components/SucessoCard';

function CadastroUsuario() {
  const [nome, setNome] = useState('')
  const [cpf, setCpf] = useState('')
  const [telefone, setTelefone] = useState('')
  const [email, setEmail] = useState('')

  const [cep, setCep] = useState('')
  const [estado, setEstado] = useState('')
  const [cidade, setCidade] = useState('')
  const [logradouro, setLogradouro] = useState('')
  const [bairro, setBairro] = useState('')

  const [card, setCard] = useState(false);

  const clienteService = new ClienteService();


  function handleSubmit(e) {
    e.preventDefault();
    clienteService.createCliente({
      nome: nome,
      cpf: cpf,
      telefone: telefone,
      email: email,
      endereco: {
        cep:cep,
        estado: estado,
        cidade: cidade,
        logradouro: logradouro,
        bairro: bairro
      }
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

  function handleChangeCpf(e) {
    setCpf(e.target.value)
  }

  function handleChangeTelefone(e) {
    setTelefone(e.target.value)
  }

  function handleChangeEmail(e) {
    setEmail(e.target.value)
  }

  function handleChangeCep(e) {
    setCep(e.target.value)
  }

  function handleChangeEstado(e) {
    setEstado(e.target.value)
  }

  function handleChangeCidade(e) {
    setCidade(e.target.value)
  }

  function handleChangeLogradouro(e) {
    setLogradouro(e.target.value)
  }

  function handleChangeBairro(e) {
    setBairro(e.target.value)
  }

  return(
    <div className='cadastro'>
      <h1>Cadastrar conta</h1>
      <form onSubmit={handleSubmit}>
        <div className='inputs-cadastro'>
          <div className='input-box'>
          <h2>Dados pessoais</h2>
            <label>Nome:</label>
            <input type='text'placeholder='Ex.: João Vitor'onChange={handleChangeNome} value={nome}/>
            <label>CPF:</label>
            <input type='text'placeholder='Ex.: 000.000.000-00' onChange={handleChangeCpf} value={cpf}/>
            <label>Telefone:</label>
            <input type='text'placeholder='Ex.: (00)0000-0000'onChange={handleChangeTelefone} value={telefone}/>
            <label>Email:</label>
            <input type='text'placeholder='Ex.: exemplo@email.com' onChange={handleChangeEmail} value={email}/>
          </div>
          <div className='input-box'>
          <h2>Endereço</h2>
            <label>CEP:</label>
            <input type='text'placeholder='Ex.: 00000-000' onChange={handleChangeCep} value={cep}/>
            <label>Estado:</label>
            <input type='text'placeholder='Ex.: Pernambuco'onChange={handleChangeEstado} value={estado}/>
            <label>Cidade:</label>
            <input type='text'placeholder='Ex.: Recife'onChange={handleChangeCidade} value={cidade}/>
            <label>Logradouro:</label>
            <input type='text'placeholder='Ex.: Frei caneca'onChange={handleChangeLogradouro} value={logradouro}/>
            <label>Bairro:</label>
            <input type='text'placeholder='Ex.: Vila madalena'onChange={handleChangeBairro} value={bairro}/>
          </div>
        </div>

        <button type='submit'>Cadastrar</button>
      </form>
      {card && <SucessoCard/>}
    </div>
  )
}

export default CadastroUsuario;