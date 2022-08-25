import { useState } from 'react';
import GetAll from '../modules/GetAll';
import PostBiscuit from '../modules/PostBiscuit';

const Main = () => {
    const [biscuits, setBiscuits] = useState([]);

    return (
        <>
            <GetAll biscuits={biscuits} setBiscuits={setBiscuits} />
            <PostBiscuit biscuits={biscuits} setBiscuits={setBiscuits} />
        </>
    );
};

export default Main;