import { useState } from 'react';


const UserInput = () => {

    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');

    const logValues = (e) => {
        e.preventDefault();
        console.log(username, password);
    };    

    return (
        <form onSubmit={logValues}>
            <label htmlFor="usernameInput">Username: </label>
            <input type="text" id="usernameInput" placeholder="Username" value={username} onChange={(e) => setUsername(e.target.value)} />
            <br />
            <label htmlFor="passwordInput">Password: </label>
            <input type="password" id="passwordInput" placeholder="Password" value={password} onChange={(e) => setPassword(e.target.value)} />
            <br />
            <button type="submit">Login</button>
        </form>
    );
};

export default UserInput;
