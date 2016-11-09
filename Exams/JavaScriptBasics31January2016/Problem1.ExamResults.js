function examResults(input){

    let maxPts = 0;
    let count = 0;
    let courseForAvg;
    for (let i = 0; i < input.length - 1; i++) {
        let params = input[i].trim().split(/\s+/);
        let student = params[0].trim();
        let course = params[1].trim();
        let examPoints = Number(params[2].trim());
        let coursesBonuses = Number(params[3].trim());

        courseForAvg = input[input.length - 1].trim();
        if(courseForAvg == course){
            maxPts += examPoints;
            count ++;
        }
        let coursePoints = Math.round((((examPoints / 400) * 80) + coursesBonuses) * 100) / 100;
        let grade = (((coursePoints / 80) * 4) + 2).toFixed(2);
        if(grade >= 6.00){
            grade = '6.00';
        }

        if(examPoints < 100){
            console.log(student + ' failed at "' + course + '"');
        }else {
            console.log(student + ': Exam - ' + '"' + course + '";' + ' Points - ' + coursePoints + ';' + ' Grade - ' + grade);
        }
    }

    let avg = Math.round((maxPts / count) * 100) / 100;
    console.log('"' + courseForAvg +'" average points -> ' + avg);

}

//student, course, examPoints, coursesBonuses

// examResults(['Pesho C#-Advanced 100 3','Gosho Java-Basics 157 3',
//     'Tosho HTML&CSS 317 12','Minka C#-Advanced 57 15','Stanka C#-Advanced 157 15',
//     'Kircho C#-Advanced 300 0','Niki C#-Advanced 400 10', 'C#-Advanced']);


// examResults(['EDUU    JS-Basics                317          15', 'RoYaL        HTML5        121         10',
// 'ApovBerger      OOP   0    10', 'Stamat OOP   190 10', 'MINKA OOP   230 10', 'OOP']);

let arr = [
    "   Bankin    HTML&CSS                0          0         ",
    "           RoYaL        HTML5&CSS        340         10        ",
    "       Bi0GaMe      Java   10    10     ",
    "Stamat HQC   190 10",
    "MINKA OOP   230 10",
    "   Java    "
];


// examResults(['Bankin    HTML&CSS                0          0', 'RoYaL        HTML5&CSS        340         10',
// 'Bi0GaMe      Java   10    10', 'Stamat HQC   190 10', 'MINKA OOP   230 10', 'Java']);

examResults(arr);


