function daggersAndSwords(input) {
    console.log('<table border="1">');
    console.log('<thead>');
    console.log('<tr><th colspan="3">Blades</th></tr>');
    console.log('<tr><th>Length [cm]</th><th>Type</th><th>Application</th></tr>');
    console.log('</thead>');
    console.log('<tbody>');

    for (let i = 0; i < input.length; i++) {
        let num = Number(input[i]);
        num = Math.floor(num);
        let str = '';

        if(num <= 10){
            continue;
        }

        let swordOrDagger = '';
        if(num <= 40){
            swordOrDagger = 'dagger';
        }else{
            swordOrDagger = 'sword';
        }

        if(num % 5 == 0){
            str = '*rap-poker';
        }else if(num % 5 == 1){
            str = 'blade';
        }else if(num % 5 == 2){
            str = 'quite a blade';
        }else if(num % 5 == 3){
            str = 'pants-scraper';
        }else if(num % 5 == 4){
            str = 'frog-butcher';
        }

        console.log('<tr><td>' + num + '</td><td>' + swordOrDagger + '</td><td>' + str + '</td></tr>');
    }
    console.log('</tbody>');
    console.log('</table>');
}