import "./styles.css"

function Login() {

  function handleSubmit(e) {
    e.preventDefault();
  }

  return (
    <div className='login'>
      <h1>Logar na conta</h1>
      <form onSubmit={handleSubmit} className='inputs-login'>
        <input type='text' placeholder='Seu email'/>
        <input type="password" placeholder='Sua senha'/>
        <button type='submit'>Logar</button>
      </form>
      
    </div>
  )
}

export default Login;