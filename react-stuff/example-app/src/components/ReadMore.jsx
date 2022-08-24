import { useState } from 'react';

const ReadMore = () => {

    const [visible, setVisible] = useState(false);

    return (
        <>
        <h1>Sample text</h1>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur sit amet pretium neque, id vulputate mi. In malesuada in urna vitae maximus. Quisque dapibus efficitur urna, nec condimentum felis iaculis at. Cras tincidunt tempus laoreet.</p>
        <button type="button" onClick={() => setVisible(!visible)}>Read more</button>
        {visible && <p>Integer eu lacus eget ex lacinia pellentesque. Sed vel commodo tortor, id congue purus. Suspendisse id orci iaculis, commodo nisl non, congue justo. Donec nec euismod purus, nec dignissim arcu. Mauris aliquam, purus a vehicula aliquet, ex sem finibus diam, id euismod elit ex ac quam. Etiam quis diam libero.</p>}
        </>
    );

};

export default ReadMore;