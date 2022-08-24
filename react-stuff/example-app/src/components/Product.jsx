import PropTypes from 'prop-types';

const Product = (props) => {
    const { name, cost, addToBasket } = props;

    const thisItem = { name, cost };

    return (
        <div>
            <span>{name}: £{cost} </span>
            <button type="button" className="addToBasketButton" onClick={() => addToBasket(thisItem)}>Add to basket</button>
        </div>
    );
};

Product.propTypes = {
    name: PropTypes.string.isRequired,
    cost: PropTypes.number.isRequired,
    addToBasket: PropTypes.func.isRequired,
};

export default Product;