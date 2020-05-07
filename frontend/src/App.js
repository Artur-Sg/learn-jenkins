import React from 'react';
import logo from './jenkins.png';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          If you see this, Jenkins builded successful!
        </p>
        <p>
          And If you see this, Ansible works too!
        </p>
      </header>
    </div>
  );
}

export default App;
