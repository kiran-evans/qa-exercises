import PropTypes from 'prop-types';

export default function PropsExample(props) {

    const { name, age } = props;

    return (
    <h1>Hello, {name} aged {age}.</h1>
  );
}

PropsExample.defaultProps = {
    age: 2
};

PropsExample.propTypes = {
    name: PropTypes.string.isRequired,
    age: PropTypes.number
};
