import axios from 'axios';
import { useEffect, useState } from 'react';
import SearchResultFilm from './SearchResultFilm';

const FilmRequest = () => {

    // const [title, setTitle] = useState('');
    const [searchTerm, setSearchTerm] = useState('');
    const [searchResult, setSearchResult] = useState('');

    useEffect(() => {
        const fetchData = async () => {
            try {
                const res = await axios.get(`http://www.omdbapi.com/?apikey=f9d3d94e&s=${searchTerm}`);
                setSearchResult(res.data);
                // console.log(res.data);
            } catch (err) {
                console.log(err);
            }
        };
        fetchData();
    }, [searchTerm]);
    


    return (
        <div className="filmRequest">
            <div className="filmRequestTitle">
                <h1>Film Search</h1>
            </div>
            <div className="filmRequestForm">
                <form onSubmit={(e) => { e.preventDefault(); setSearchTerm(e.target.titleInput.value); }}>
                    <input name="titleInput" type="text" placeholder="Film title" />
                    <button className="search" type="submit">Search</button>
                </form>
            </div>
            <div className="filmRequestResults">
            {(searchResult !== '' && searchResult.Response !== 'False')
                ? searchResult.Search.map(film => (<SearchResultFilm key={film.imdbID} title={film.Title} year={film.Year} imdbID={film.imdbID} poster={film.Poster} />))
                : ''}
            {(searchTerm !== '' && searchResult.Response === 'False')
                ? <h2>Try another search.</h2>
                : ''}
            </div>
        </div>
    );
};

export default FilmRequest;