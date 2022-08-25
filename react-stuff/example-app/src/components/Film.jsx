import PropTypes from 'prop-types';

const Film = (props) => {
    const { title, year, director, actors, plot, poster } = props;

    return (
        <>
            <img src={poster} width="150px" alt={`Poster for ${title} (${year})`} />
            <h2>{title} ({year})</h2>
            <h3>Director: {director}</h3>
            <h4>Starring: {actors}</h4>
            <p>{plot}</p>
        </>
    );
};

Film.propTypes = {
    title: PropTypes.string.isRequired,
    year: PropTypes.number.isRequired,
    director: PropTypes.string.isRequired,
    actors: PropTypes.string.isRequired,
    plot: PropTypes.string.isRequired,
    poster: PropTypes.string.isRequired,
};

export default Film;