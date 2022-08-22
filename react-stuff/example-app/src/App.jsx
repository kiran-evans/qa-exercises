import logo from './logo.svg';
import './App.css';
import MyComponent from './MyComponent';
import PropsExample from './PropsExample';

function App() {
  return (
    <div className="App">
      <h1>Hello there</h1>
      <h2>General Kenobi!</h2>
      <MyComponent />
      <PropsExample name="Jim" />
    
    </div>
  );
}

export default App;
