import { useEffect, useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [whiskies, setWhiskies] = useState([])

  useEffect(() => {
    fetch('http://localhost:8080/whiskies')
      .then(res => res.json())
      .then(whiskyData => setWhiskies(whiskyData))
  }, [])

  const whiskyItems = whiskies.map((whisky) => {
    return <li>{whisky.name}</li>
  })

  return (
    <>
      <h1>Whiskies</h1>
      <ul>
        {whiskyItems}
      </ul>
    </>
  )
}

export default App
