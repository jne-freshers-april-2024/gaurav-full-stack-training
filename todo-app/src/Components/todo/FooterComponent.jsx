// import { useContext } from "react";
// import { AuthConext } from "./security/AuthConext";

function FooterComponent() {
    // const authContext = useContext(AuthConext)
    // console.log(`Footer Printed Context Api - ${authContext.number}`)
    return (
        <footer className="footer">
            <div className="container">
                &copy; Thnkitive Technologies pvt ltd | All righst reserved privacy policy.
            </div>
        </footer>
    )
}
export default FooterComponent;