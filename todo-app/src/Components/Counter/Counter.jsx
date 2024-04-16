import './Counter.css'
import CounterButton from './CounterButton'
import { useState } from "react"

export default function Counter(by) {
    const [count, setCount] = useState(0);
    
    function parentIncrement(by){
        setCount(count + by)
    }

    function parentDecrement(by){
        setCount(count - by)
    }

    function resetFunction(){
        setCount(0)
    }
    return (
        <>
            <div className="countStyle">{count}</div>
            <CounterButton incrementMethod={parentIncrement} decrementMethod={parentDecrement}/>
            <CounterButton by={2} incrementMethod={parentIncrement} decrementMethod={parentDecrement}/>
            <CounterButton by={5} incrementMethod={parentIncrement} decrementMethod={parentDecrement}/>
            <button className="resetButton" onClick={resetFunction}>Reset</button>
        </>
    )
}
