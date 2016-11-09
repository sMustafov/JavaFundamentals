function goshkoTheRabbit(input) {
    let directions = input.shift().split(/,\s/);
    let matrix = input.map(l => l.split(/,\s/));
    let veggies = {'&': 0, '*': 0, '#': 0, '!': 0, 'wall hits': 0};
    let toLeave = '@';

    let row = 0;
    let col = 0;

    let visitedCells = [];

    for (let direction of directions){
            switch (direction) {
                case 'up':
                    if (canMove(row - 1, col, matrix)) {
                        row--;
                        makeMove(row, col);
                    } else
                        veggies['wall hits']++;
                    break;
                case 'right':
                    if (canMove(row, col + 1, matrix)) {
                        col++;
                        makeMove(row, col);
                    } else
                        veggies['wall hits']++;
                    break;
                case 'down':
                    if (canMove(row + 1, col, matrix)) {
                        row++;
                        makeMove(row, col);
                    } else
                        veggies['wall hits']++;
                    break;
                default:
                    if (canMove(row, col - 1, matrix)) {
                        col--;
                        makeMove(row, col);
                    } else
                        veggies['wall hits']++;
                    break;
            }
    }

    function canMove(row, col, matrix) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length;
    }

    function makeMove(row, col) {
        if (matrix[row][col] != undefined) {
            let regex = /(?:{)(&|\*|#|!)(?:})/g;
            let match;
            while (match = regex.exec(matrix[row][col])) {
                veggies[match[1]]++;
            }

            let cellValue = matrix[row][col].replace(regex, toLeave);
            visitedCells.push(cellValue);
            matrix[row][col] = undefined;
        }
    }

    console.log(JSON.stringify(veggies));
    console.log(visitedCells.length > 0 ? visitedCells.join('|') : 'no');
}