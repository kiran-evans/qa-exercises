import axios from 'axios';
import { useEffect, useState } from 'react';
import Film from './Film';

const FilmRequest = () => {

    const [title, setTitle] = useState('');
    const [film, setFilm] = useState('');

    useEffect(() => {
        const fetchData = async () => {
            try {
                const res = await axios.get(`http://www.omdbapi.com/?apikey=f9d3d94e&t=${title}`);
                setFilm(res.data);
                console.log(res.data);
            } catch (err) {
                console.log(err);
            }
        };
        fetchData();
    }, [title]);
    


    return (
        <>
            <h1>Film Search</h1>
            <input type="text" placeholder="Film title" onChange={(e) => setTitle(e.target.value)} />
            <p />
            {(film.Response !== 'False' && film !== '') ? <Film title={film.Title} year={film.Year} director={film.Director} actors={film.Actors} plot={film.Plot} poster={film.Poster} /> : <p>No film found</p>}
        </>
    );
};

export default FilmRequest;