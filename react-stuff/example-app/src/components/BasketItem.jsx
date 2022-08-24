import PropTypes from 'prop-types';

const BasketItem = (props) => {

    const { id, name, cost, removeFromBasket } = props;

    return (
        <div id={id}>
            <span>{name}: £{cost} </span>
            <button type="button" className="removeFromBasketButton" onClick={() => removeFromBasket(id)}>Remove from basket</button>
        </div>
    );
};

BasketItem.propTypes = {
    id: PropTypes.number.isRequired,
    name: PropTypes.string.isRequired,
    cost: PropTypes.number.isRequired,
    removeFromBasket: PropTypes.func.isRequired,
};

export default BasketItem;