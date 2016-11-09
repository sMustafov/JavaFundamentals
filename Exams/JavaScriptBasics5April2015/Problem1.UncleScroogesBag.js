function uncleScroogesBag(input) {
    let gold = 0;
    let silver = 0;
    let bronze = 0;

    let sumOfCoins = 0;

    for (let i = 0; i < input.length; i++) {
        let tokens = input[i].trim().toLowerCase().split(/\s+/).filter(e => e != '');
        let type = tokens[0].trim();
        let value = Number(tokens[1].trim());

        if (type == 'coin' && !isNaN(value) && value >= 0 && Math.round(value) == value) {
            sumOfCoins += Number(value);
        }
    }

    gold = Math.floor(sumOfCoins / 100);
    silver =  Math.floor((sumOfCoins % 100) / 10);
    bronze = sumOfCoins % 10;

    console.log('gold : ' + gold);
    console.log('silver : ' + silver);
    console.log('bronze : ' + bronze);
}