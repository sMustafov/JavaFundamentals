function XRemove(input) {
    let matrix = input.map(l => l.toLowerCase().split(''));
    let newMatrix = input.map(l => l.split(''));

    for (let row = 0; row < matrix.length; row++) {
        for (let col = 0; col < matrix[row].length; col++) {
            if(row - 1 >= 0 && col - 1 >= 0){
                if(row - 1 >= 0 && col + 1 < matrix[row - 1].length){
                    if(row + 1 < matrix.length && col - 1 >= 0){
                        if(row + 1 < matrix.length && col + 1 < matrix[row + 1].length){
                            if (matrix[row - 1][col - 1] == matrix[row][col] &&
                                matrix[row - 1][col + 1] == matrix[row][col] &&
                                matrix[row + 1][col - 1] == matrix[row][col] &&
                                matrix[row + 1][col + 1] == matrix[row][col]) {

                                newMatrix[row - 1][col - 1] = '';
                                newMatrix[row - 1][col + 1] = '';
                                newMatrix[row + 1][col - 1] = '';
                                newMatrix[row + 1][col + 1] = '';
                                newMatrix[row][col] = '';
                            }
                        }
                    }
                }
            }
        }
    }

    for (let i = 0; i < newMatrix.length; i++) {
        let str = '';
        for (let j = 0; j < newMatrix[i].length; j++) {
            if(newMatrix[i][j] != '') {
                str += newMatrix[i][j];
            }
        }
        console.log(str);
    }
}