import './App.css';
import Calculator from './components/Calculator';
import Car from './components/Car';
import Content from './components/Content';
import Line from './components/Line';
import MyComponent from './components/MyComponent';
import ProductTable from './components/ProductTable';
import PropsExample from './components/PropsExample';
import SubContent from './components/SubContent';
import UserInput from './components/UserInput';

function App() {
  return (
    <div className="App">
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
    
    </div>
  );
}

export default App;
