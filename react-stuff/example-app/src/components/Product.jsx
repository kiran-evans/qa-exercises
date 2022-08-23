import PropTypes from 'prop-types';

const Product = (props) => {

    const { name, cost } = props;

    return (
        <p>{name}: £{cost}</p>
    );
};

Product.propTypes = {
    name: PropTypes.string.isRequired,
    cost: PropTypes.number.isRequired
};

export default Product;