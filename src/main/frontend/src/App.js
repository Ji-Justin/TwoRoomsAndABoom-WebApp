import logo from './logo.svg';
import './App.css';
import Home from './pages/Home.tsx'
import Lobby from './pages/Lobby.tsx'
import { BrowserRouter, Routes, Route } from "react-router-dom";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" >
          <Route index element={<Home/>} />
          <Route path="lobby" element={<Lobby/>} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
