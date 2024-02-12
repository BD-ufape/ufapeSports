import { Link } from 'react-router-dom';
import "./styles.css";

function Home() {
  return(
    <div>
      <h1>Bem-vindo a UfapeSports</h1>
      <div className='home-buttons'>
        <button><Link to={"/cadastroUsuario"}>Cadastrar</Link></button>
        <button><Link to={"/logar"}>Logar</Link></button>
        <button><Link to={"/cadastroProduto"}>Cadastrar um produto</Link></button>
      </div>
    </div>
  )
}

export default Home;