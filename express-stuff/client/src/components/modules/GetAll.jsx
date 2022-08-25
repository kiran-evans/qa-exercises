import PropTypes from 'prop-types';
import axios from 'axios';
import Biscuit from './Biscuit';

const GetAll = (props) => {

    const { biscuits, setBiscuits } = props;

    const getAll = async () => {
        try {
            const res = await axios.get('http://localhost:12499/biscuits/getAll');
            setBiscuits(res.data);
        } catch (err) {
            console.log(err);
        }
    };

    return (
        <>
            <button type="button" onClick={() => getAll()}>Display all biscuits</button>
            <p />
            {(biscuits !== []) ? biscuits.map((b) => (
                <Biscuit key={b.id} name={b.name} count={b.count} cost={b.cost} />
            )) : 'No biscuits found'}
        </>
    );

};

GetAll.propTypes = {
    biscuits: PropTypes.array.isRequired,
    setBiscuits: PropTypes.func.isRequired,
};

export default GetAll;