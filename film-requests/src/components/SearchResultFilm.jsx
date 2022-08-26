import PropTypes from 'prop-types';
import { useNavigate } from 'react-router-dom';

const SearchResultFilm = (props) => {
    const { title, year, imdbID, poster } = props;
    const navigate = useNavigate();

    return (
        <div className="searchResultFilm">
            <img src={poster} alt={`Poster for ${title} (${year})`} />
            <h2>{title} ({year})</h2>
            <button type="button" onClick={() => navigate(`/film/${imdbID}`)}>Details</button>
        </div>
    );
};

SearchResultFilm.propTypes = {
    title: PropTypes.string.isRequired,
    year: PropTypes.string.isRequired,
    imdbID: PropTypes.string.isRequired,
    poster: PropTypes.string.isRequired,
};

export default SearchResultFilm;