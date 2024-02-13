import { BrowserRouter, Route, Routes } from 'react-router-dom'
import CadastroProduto from './pages/CadastroProduto'
import CadastroUsuario from './pages/CadastroUsuario'
import Home from './pages/Home'
import Login from './pages/Login'
import Erro from './pages/Erro'
import Produtos from './pages/Produtos'
import TelaDeCompra from './pages/Compra'

export const RoutesApp = () => {
  return (
    <BrowserRouter>
      <Routes>
        <Route path='/cadastroProduto' element={<CadastroProduto/>}/>
        <Route path='/cadastroUsuario' element={<CadastroUsuario/>}/>
        <Route path='/' element={<Home/>}/>
        <Route path='/logar' element={<Login/>}/>
        <Route path='*' element={<Erro/>}/>
        <Route path='/produtos' element={<Produtos/>}/>
        <Route path='/compra' element={<TelaDeCompra/>}/>
      </Routes>
    </BrowserRouter>
  )
}