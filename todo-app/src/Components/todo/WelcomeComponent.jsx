import { useParams, Link } from "react-router-dom"
function WelcomeComponent() {
    const { username } = useParams();

    return (
        <div className="WelcomeComponent">
            <h1>Welcome {username}</h1>
            <div>
                Manage Your Todos - <Link to="/todo" >Go Here</Link>
            </div>
        </div>
    )
}
export default WelcomeComponent;