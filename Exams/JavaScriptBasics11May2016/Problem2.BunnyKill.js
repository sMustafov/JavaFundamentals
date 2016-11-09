function solutionTwo(input) {
    let coords = input.pop().split(/[\s,]+/g).map(Number);
    let arr = input.map(l => l.split(/\s+/g).map(Number));/*[];
    for (let i = 0; i < input.length - 1; i++) {
        let a = input[i].split(' ');
        arr[i] = [];
        for (let j = 0; j < a.length; j++) {
            arr[i].push(Number(a[j]));
        }
    }*/
    let sum = 0;
    let counter = 0;

    for (let i = 0; i < coords.length; i+=2) {
        let row = coords[i];
        let col = coords[i + 1];

        let bombBunny = Number(arr[row][col]);

        if(bombBunny > 0) {
            sum += bombBunny;
            counter++;
            for (let r = Math.max(0, row - 1); r <= Math.min(arr.length - 1, row + 1); r++) {
                for (let c = Math.max(0, col - 1); c <= Math.min(arr[r].length - 1, col + 1); c++) {
                    if (r != row || c != col) {
                        arr[r][c] -= bombBunny;
                        if (arr[r][c] < 0) {
                            arr[r][c] = 0;
                        }
                    }
                }
            }
           arr[row][col] = 0;
        }
    }

    for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < arr[i].length; j++) {
            if(arr[i][j] > 0 ){
                sum += arr[i][j];
                counter++;
            }
        }
    }

    console.log(sum);
    console.log(counter);
}




solutionTwo(['5 10 15 20', '10 10 10 10', '10 15 10 10', '10 10 10 10', '2,2 0,1']);

//solutionTwo(['10 10 10', '10 10 10', '10 10 10', '0,0']);