import { useState} from "react"
import { useNavigate} from "react-router-dom"
import { useAuth } from "./security/AuthConext"
function LogInComponent() {
    const [username, setUserName] = useState("Thinkitive")
    const [password, setPassword] = useState('')
    const [showErrorMessage, setshowErrorMessage] = useState(false)
    const navigate = useNavigate();
    const authContext = useAuth();

    function handleUsernameChnage(event) {
        setUserName(event.target.value)
    }

    function handlePasswordChnage(event) {
        setPassword(event.target.value)
    }

    function handleSubmit() {
        if (authContext.login(username, password)) {
            setshowErrorMessage(false)
            navigate(`/welcome/${username}`)
        } else {
            setshowErrorMessage(true)
        }
    }

    return (
        <div className="Login">
            <h1>Time To login</h1>
            {showErrorMessage && <div className="errorMessage">Authentication Failed. Please check your credentials.</div>}
            <div className="LoginForm">
                <div>
                    <label htmlFor="">UserName : </label>
                    <input type="text" name="username" placeholder="Enter Your UserName" value={username} onChange={handleUsernameChnage} />
                </div>
                <div>
                    <label htmlFor="">Password : </label>
                    <input type="password" name="password" placeholder="Enter Your Password" value={password} onChange={handlePasswordChnage} />
                </div>
                <div>
                    <button type="button" name="login" onClick={handleSubmit}>LogIn</button>
                </div>
            </div>
        </div>
    )
}
export default LogInComponent;