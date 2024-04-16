import { createContext, useState, useContext } from "react"

// 1. Create context at the top position
export const AuthConext = createContext()

export const useAuth = () => useContext(AuthConext)

// 2. Share the created context with other components
export default function AuthProvider({ children }){

    // 3. Put some state in the context
    const[isAuthenticated, setAuthenticated] = useState(false)

    function login(username, password){
        if (username === 'Thinkitive' && password === 'dummy') {
            setAuthenticated(true)
           return true;
        } else {
            isAuthenticated(false)
            return false;
        }
    }

    function logout(){
        setAuthenticated(false)
    }

    return(
        <AuthConext.Provider value={ {isAuthenticated, setAuthenticated, login, logout} }>
            { children }
        </AuthConext.Provider>
    )
}