import { BrowserRouter, Route, Routes } from 'react-router-dom'
import CadastroProduto from './pages/CadastroProduto'
import CadastroUsuario from './pages/CadastroUsuario'
import Home from './pages/Home'

export const RoutesApp = () => {
  return (
    <BrowserRouter>
      <Routes>
        <Route path='/cadastroProduto' element={<CadastroProduto/>}/>
        <Route path='/cadastroUsuario' element={<CadastroUsuario/>}/>
        <Route path='/' element={<Home/>}/>
      </Routes>
    </BrowserRouter>
  )
}