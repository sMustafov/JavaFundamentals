function kitadorTheMiner(input) {
    let silver = 0;
    let gold = 0;
    let diamonds = 0;

    for (let i = 0; i < input.length; i++) {
        let input2 = input[i].split(/\s*\-\s*/);
        if(input2.length > 1) {
            let line = input2[1].split(/\s*\:\s*/);
            if(line.length > 1) {
                let type = line[0];
                let quantity = Number(line[1].replace('\"', ''));

                if (type.toLowerCase() == 'silver') {
                    silver += quantity;
                } else if (type.toLowerCase() == 'gold') {
                    gold += quantity;
                } else if (type.toLowerCase() == 'diamonds') {
                    diamonds += quantity;
                }
            }
        }
    }

    console.log("*Silver: " + silver);
    console.log("*Gold: " + gold);
    console.log("*Diamonds: " + diamonds);
}
