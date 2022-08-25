import PropTypes from 'prop-types';

const Biscuit = (props) => {
    const { name, count, cost } = props;

    return (
        <div className="biscuit">
            <p>Name: {name}</p>
            <p>Count: {count}</p>
            <p>Cost: £{cost}</p>
        </div>
    );
};

Biscuit.propTypes = {
    name: PropTypes.string.isRequired,
    count: PropTypes.number.isRequired,
    cost: PropTypes.number.isRequired,
};

export default Biscuit;