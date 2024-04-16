import PropTypes from 'prop-types';
export default function CounterButton({ by , incrementMethod, decrementMethod}) {
   
    return (
        <>
            <div>
                <button className="buttonStyle" onClick={()=>incrementMethod(by)}>+{by}</button>
                <button className="buttonStyle" onClick={()=>decrementMethod(by)}>-{by}</button>
            </div>
        </>
    )
}
CounterButton.propTypes = {
    by: PropTypes.number
}
CounterButton.defaultProps = {
    by: 1
}