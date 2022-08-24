import { useEffect, useState } from 'react';
import { PropTypes } from 'prop-types';

const NameComponent = () => {

    const [name, setName] = useState('React App');

    useEffect(() => {
        document.title = name;
    }, [name]);

    return (
        <input placeholder="Document Title" onChange={(e) => setName(e.target.value)} />
    );

};

export default NameComponent;