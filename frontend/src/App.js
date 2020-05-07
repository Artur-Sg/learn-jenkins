import React from 'react';
import logo from './jenkins.png';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          If you see this, Jenkins build successful!
        </p>
      </header>
    </div>
  );
}

export default App;
