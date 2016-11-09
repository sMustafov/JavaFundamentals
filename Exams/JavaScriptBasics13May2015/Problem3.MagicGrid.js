function magicGrid(input) {
    let str = input.shift().split('');
    let magicNumber = Number(input.shift());
    let matrix = input.map(l => l.split(/\s+/g).map(Number));

    let sum = 0;
    let num = 0;

    loop:
    for (let startRow = 0; startRow < matrix.length; startRow++) {
        for (let startCol = 0; startCol < matrix[startRow].length; startCol++) {
            let firstNum = matrix[startRow][startCol];
            sum = firstNum;
            for (let row = startRow; row < matrix.length; row++) {
                let coll = row == startRow ? startCol + 1 : 0;
                for (let col = coll; col < matrix[row].length; col++) {
                    if(row != startRow || col != startCol) {
                        sum += matrix[row][col];
                    }
                    if(sum == magicNumber){
                        num = startRow + startCol + row + col;
                        break loop;
                    }

                    sum = firstNum;
                }
            }
        }
    }

    let s = '';
    let res = '';
    for (let i = 0; i < str.length; i++) {
        let charCode = str[i].charCodeAt(0);
        if(i % 2 == 0){
            charCode += num;
        }else{
            charCode -= num;
        }

        s = String.fromCharCode(charCode);
        res += s;
    }

    console.log(res);
}