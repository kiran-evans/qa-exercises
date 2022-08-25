import { BrowserRouter, Routes, Route } from 'react-router-dom';
import './App.css';
import Calculator from './components/Calculator';
import Car from './components/Car';
import Content from './components/Content';
import FilmRequest from './components/FilmRequest';
import Line from './components/Line';
import MyComponent from './components/MyComponent';
import NameComponent from './components/NameComponent';
import ProductTable from './components/ProductTable';
import PropsExample from './components/PropsExample';
import ReadMore from './components/ReadMore';
import PageNotFound from './components/router-exercise-2/404';
import Contact from './components/router-exercise-2/Contact';
import Home from './components/router-exercise-2/Home';
import Users from './components/router-exercise-2/Users';
import SubContent from './components/SubContent';
import UserInput from './components/UserInput';

function App() {
  return (
    <div className="App">
      {/* Router Task */}
      <BrowserRouter>
        <Routes>
          <Route exact path="/" element={<Home />} />
          <Route path="/users/:id" element={<Users />} />
          <Route path="/contact" element={<Contact />} />
          <Route path="/*" element={<PageNotFound />} />
        </Routes>

        <h1>Hello there</h1>
        <h2>General Kenobi!</h2>
        <MyComponent />
        <Line />

        <PropsExample name="Jim" />
        <Line />

        <UserInput />
        <Car />
        <Line />

        <ProductTable />
        <Line />

        <Calculator />
        <Line />

        {/* <Content />
        <Line /> */}

        <SubContent />
        <Line />

        <ReadMore />
        <Line />

        <NameComponent />
        <Line />

        <FilmRequest />
        <Line />


      </BrowserRouter>

      <Line />
    
    </div>
  );
}

export default App;
