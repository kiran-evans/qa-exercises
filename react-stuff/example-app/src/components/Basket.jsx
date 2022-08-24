import PropTypes from 'prop-types';
import BasketItem from './BasketItem';

const Basket = (props) => {

    const { basket } = props;

    return (
        <>
            {basket.map((basketItem, i) => (
                <BasketItem key={basketItem.name + i} name={basketItem.name} cost={basketItem.cost} />
            ))}
        
        </>
    );

};

Basket.propTypes = {
    basket: PropTypes.array.isRequired,
};

export default Basket;