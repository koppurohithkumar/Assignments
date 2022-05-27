
import './App.css';
import { BrowserRouter as Router,
  Routes,
  Route,
  NavLink} from 'react-router-dom'
  import Home from './components/Home'
  import Contact from './components/Contact'
  import Projects from './components/Projects'
  import Services from './components/Services'

function App() {
  return (
    <Router>
      <div className='complete'>
      <div className='tab'>
        <ul>
          <li><NavLink to='/Home' style={{textDecoration:"none", color:'white'}}>Home</NavLink></li>
          <li><NavLink to='/Contact' style={{textDecoration:"none", color:'white'}}>Contact</NavLink></li>
          <li><NavLink to='/Projects' style={{textDecoration:"none", color:'white'}}>Projects</NavLink></li>
          <li><NavLink to='/Services' style={{textDecoration:"none", color:'white'}}>Services</NavLink></li>
        </ul>
      </div>
      <div className='Display'>
      <Routes>
        <Route path='/Home' element={<Home/>}></Route>
        <Route path='/Contact' element={<Contact/>}></Route>
        <Route path='/Projects' element={<Projects/>}></Route>
        <Route path='/Services' element={<Services/>}></Route>
      </Routes>
      </div>
      </div>
    </Router>
  );
}

export default App;
