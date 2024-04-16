import { BrowserRouter, Routes, Route, Navigate } from "react-router-dom"
import './ToDoApp.css'
import LogOutComponent from "./LogOutComponent"
import FooterComponent from "./FooterComponent"
import HeaderComponent from "./HeaderComponent"
import ListToDosComponent from "./ListToDosComponent"
import ErrorComponet from "./ErrorComponet"
import WelcomeComponent from "./WelcomeComponent"
import LogInComponent from "./LogInComponent"
import AuthProvider, { useAuth } from "./security/AuthConext"

function AuthenticatedRoute({ children }) {
    const authContext = useAuth()
    if (authContext.isAuthenticated)
        return children;

    return <Navigate to='/' />
}

export default function ToDoApp() {
    return (
        <div className="ToDoApp">
            <AuthProvider>
                <BrowserRouter>
                    <HeaderComponent />
                    <Routes>
                        <Route path="/" element={<LogInComponent />} />
                        <Route path="/login" element={<LogInComponent />} />
                        <Route path="/welcome/:username" element={
                            <AuthenticatedRoute>
                                <WelcomeComponent />
                            </AuthenticatedRoute>
                        } />
                        <Route path="/todo" element={
                            <AuthenticatedRoute>
                                <ListToDosComponent />
                            </AuthenticatedRoute>
                        } />
                        <Route path="/logout" element={
                            <AuthenticatedRoute>
                                <LogOutComponent />
                            </AuthenticatedRoute>
                        } />
                        <Route path="*" element={<ErrorComponet />} />
                    </Routes>
                    <FooterComponent />
                </BrowserRouter>
            </AuthProvider>
        </div>
    )
}