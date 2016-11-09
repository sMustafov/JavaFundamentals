function fleaRacing(input) {
    let numsOfJumpsAllowed = Number(input.shift());
    let trackLenght = Number(input.shift());

    console.log('#'.repeat(trackLenght));
    console.log('#'.repeat(trackLenght));
    let arr = [];

    for (let i = 0; i < input.length; i++) {
        let tokens = input[i].split(/\s*\,\s*/);
        let name = tokens[0];
        let jumpDistance = Number(tokens[1]);

        arr.push( {name: name, trackLenght: trackLenght - 1, jumpDistance: jumpDistance});
    }

    let winner;
    let hasWinner = false;
    let best = Number.POSITIVE_INFINITY;

    for (let j = 0; j < numsOfJumpsAllowed; j++) {
        for (let flee in arr) {
            arr[flee].trackLenght -= arr[flee].jumpDistance;

            if (arr[flee].trackLenght <= best) {
                best = arr[flee].trackLenght;
                winner = arr[flee].name;
            }

            if (arr[flee].trackLenght <= 0) {
                arr[flee].trackLenght = 0;
                hasWinner = true;
                break;
            }
        }

        if(hasWinner){
            break;
        }
    }

    for (let flee in arr) {
        let firstPart = trackLenght - 1 - arr[flee].trackLenght;
        console.log(`${'.'.repeat(firstPart)}${arr[flee].name[0].toUpperCase()}${'.'.repeat(trackLenght - 1 - firstPart)}`);
    }

    console.log('#'.repeat(trackLenght));
    console.log('#'.repeat(trackLenght));
    console.log(`Winner: ${winner}`);
}