import PropTypes from 'prop-types';

const Person = (props) => {

    const { name, city } = props;

    return (
        <p>This is {name}, they are from {city}.</p>
    );
};

Person.propTypes = {
    name: PropTypes.string.isRequired,
    city: PropTypes.string.isRequired
};

export default Person;