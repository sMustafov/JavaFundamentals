function filterMatrix(input) {
    let countToRemove = Number(input[input.length - 1]);
    let rows = Number(input.length - 1);
    let rowsEl = new Array();

    let allNums = new Array();
    for(let i = 0; i < input.length - 1; i++){
        let a = input[i].trim().split(' ');
        rowsEl[i] = Number(a.length);
        for (let j = 0; j < a.length ; j++) {
            allNums.push(a[j])
        }
    }

    for(let i = 0; i < allNums.length - 1; i++){
        let count = 1;
        for (let j = i; j < i + countToRemove - 1; j++) {
            if(allNums[j] == allNums[j + 1]){
                count++;
            }
        }
        if(count == countToRemove){
            for (let j = i; j < i + countToRemove; j++) {
                allNums[j] = ' ';
            }
        }
    }

    let first = 0;
    for (let i = 0; i < rows; i++) {
        let last = Number(rowsEl[i]) + first;
        let res = '';
        for (let j = first; j < last; j++) {
            if (allNums[j] != ' ') {
                res += ' ' + allNums[j];
            }
        }
        first = last;
        if (res == '') {
            console.log('(empty)');
        } else {
            console.log(res);
        }
    }
}


//filterMatrix(['3 3 3 2 5 9 9 9 9 1 2', '1 1 1 1 1 2 5 8 1 1 7', '7 7 1 2 3 5 7 4 4 1 2', '2']);
//filterMatrix(['1 2 3 3', '3 5 7 8', '3 2 2 1', '3']);
filterMatrix(['2 1 1 1', '1 1 1', '3 7 3 3 1', '2']);
//filterMatrix(['1 2 3 3 2 1', '5 2 2 1 1 0', '3 3 1 3 3', '2']);

