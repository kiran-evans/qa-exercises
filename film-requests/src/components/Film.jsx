import { useEffect, useState } from 'react';
import { useParams, useNavigate } from 'react-router-dom';
import axios from 'axios';

const Film = () => {
    const navigate = useNavigate();
    const { id } = useParams();
    const [film, setFilm] = useState();
    const [visible, setVisible] = useState(false);

    useEffect(() => {
        const fetchData = async () => {
            try {
                const filmResponse = await axios.get(`http://www.omdbapi.com/?apikey=f9d3d94e&i=${id}`);
                // console.log(res);
                setFilm(filmResponse.data);
            } catch (err) {
                console.log(err);
            }
        };
        fetchData();
    }, []);

    return (
        <div className="film">
            <h1>Film Result</h1>
            {(film)
            ? (
            <div className="filmDetails"> 
                <div className="filmPoster">
                    <img src={film.Poster} alt={`Poster for ${film.Title} (${film.Year})`} />
                </div>
                <div className="filmText">
                    <h2>{film.Title} ({film.Year})</h2>
                    <h3>Director: {film.Director}</h3>
                    <h4>Starring: {film.Actors}</h4>
                    <p>{film.Plot}</p>
                {(visible)
                ? (
                    <div className="filmExtra">
                        <p>Relased: {film.Released}</p>
                        <p>Box office: {film.BoxOffice}</p>
                        <p>Runtime: {film.Runtime}</p>
                        <p>Written by: {film.Writer}</p>
                        <p>Awards: {film.Awards}</p>
                        <p>Rating:</p>
                        <p className="rating" title="Rating">{film.Rated}</p>
                    </div>
                )
                : ''}
                <button type="button" onClick={() => setVisible(!visible)}>{(!visible) ? 'View details' : 'Hide details'}</button>
                </div>
            </div>
            )
            : ''}
            <p />
            <button type="button" onClick={() => navigate('/')}>Back to search</button>
        </div>
    );
};

export default Film;