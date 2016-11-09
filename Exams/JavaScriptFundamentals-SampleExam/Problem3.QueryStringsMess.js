function queryStringsMess(input) {
    let map = new Map();
    let pattern  = new RegExp(/([^&=?]*)=([^&=]*)/g);

    for (let i = 0; i < input.length; i++) {
        let line = input[i].replace(/%20/gi, ' ').replace(/\+/gi, ' ').replace(/\?/gi, '&').replace(/\s+/gi, ' ');

        let result = '';
        while ((result = pattern.exec(line)) !== null) {
            let arr = result[0].trim().split('=');
            let name = arr[0].trim();
            let value = arr[1].trim();

            if (!map.has(name)) {
                map.set(name, []);
            }

            map.get(name).push(value);
        }

        let res = '';
        for (let [key, values] of map) {
            res += key + '=[' + values.join(', ') + ']';

        }
        console.log(res);
        map = new Map();
    }
}


/*queryStringsMess(['field=value1&field=value2&field=value3',
    'http://example.com/over/there?name=ferret']);*/


queryStringsMess(['foo=%20foo&value=+val&foo+=5+%20+203',
    'foo=poo%20&value=valley&dog=wow+',
    'url=https://softuni.bg/trainings/coursesinstances/details/1070',
    'https://softuni.bg/trainings.asp?trainer=nakov&course=oop&course=php']);







