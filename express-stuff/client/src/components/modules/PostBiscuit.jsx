import PropTypes from 'prop-types';
import axios from 'axios';

const PostBiscuit = (props) => {

    const { biscuits, setBiscuits } = props;

    const postBiscuit = async (e) => {
        e.preventDefault();

        const newBiscuit = { name: e.target.biscuitNameInput.value, count: e.target.biscuitCountInput.value, cost: e.target.biscuitCostInput.value };

        try {
            const res = await axios.post('http://localhost:12499/biscuits/create', newBiscuit);
            setBiscuits(res.data);
        } catch (err) {
            console.log(err);
        }
    };

    return (

        <form onSubmit={(e) => postBiscuit(e)}>
         <label htmlFor="biscuitNameInput">Name </label>
         <input type="text" name="biscuitNameInput" placeholder="Name" />
         <br />
         <label htmlFor="biscuitCountInput">Count </label>
         <input type="number" name="biscuitCountInput" placeholder="Count" />
         <br />
         <label htmlFor="biscuitCostInput">Cost (£) </label>
         <input type="number" name="biscuitCostInput" placeholder="Cost" />
         <br />
         <button type="submit">Submit</button>
        </form>

    );

};

PostBiscuit.propTypes = {
    biscuits: PropTypes.array.isRequired,
    setBiscuits: PropTypes.func.isRequired,
};

export default PostBiscuit;