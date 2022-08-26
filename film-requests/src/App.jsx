import { BrowserRouter, Routes, Route } from 'react-router-dom';
import './App.css';
import Film from './components/Film';
import FilmRequest from './components/FilmRequest';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route exact path="/" element={<FilmRequest />} />
          <Route path="/film/:id" element={<Film />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
