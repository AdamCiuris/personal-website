import './App.css';
import pfp from "./images/Ciuris_Adam.jpg"
import scraper from "./images/scrape01.png"
import git from "./images/github.png"
import gitico from "./images/sidebar/github.png"
import liico from "./images/sidebar/linkedin.png"
import twitterico from "./images/sidebar/twitter.png"


function App() {
  return (
    <div className="App">
      <div className="profile-pic-wrapper">

        <img src={pfp} className='profile-pic' alt="me"></img>
        <p className='email'>
        adamciuris@gmail.com
        </p>
        

        <ul className='links'>
          <li>
          <a href="https://www.linkedin.com/in/adam-ciuris-384005134/">
          <img src={liico} href="https://www.linkedin.com/in/adam-ciuris-384005134/" alt='linkedin'></img>
          </a>
          </li>
          <li>
          <a href="https://github.com/AdamCiuris/">
          <img src={gitico}  alt='github'></img>
          </a>
          </li>
          <li>
          <a href="https://twitter.com/ACiuris">
          <img src={twitterico} alt='twitter'></img>
          </a>
          </li>
        </ul>
        <p className='about'>
          Welcome to my personal site. It is hosted on my own linux server using: 
          <ul>
          <li>cloudflare</li>
          <li>nginx</li>
          <li>reactJS</li>
          </ul> 
        </p>

      </div>
      <div className='right-display'>
        <div className='projects'>
          <div className='project'>
            <h1>Selenium Twitter Tweet Scraper</h1>
            <p id="paragraph">ElectronJS, java, Selenium tweet scraper.</p>
            <img src={scraper} alt='Selenium testing software pulling tweets.' width='100%'></img>
            <a href="https://github.com/AdamCiuris/Selenium_Tweet_Scraper">
              <button className='github-button'>
                <img src={git} width='10%' align='center' alt='github button'></img>
                Github
              </button>
            </a>
          </div>
        </div>

      </div>
    </div>

  );
}

export default App;
