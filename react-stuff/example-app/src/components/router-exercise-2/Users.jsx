import { useParams } from 'react-router-dom';

const Users = () => {
    const { id } = useParams();
    return (<h1>Users: {id}</h1>);
};

export default Users;