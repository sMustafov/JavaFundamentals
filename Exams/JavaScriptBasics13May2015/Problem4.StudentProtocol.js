function studentProtocol(input) {
    let data = new Map();
    let makeUpExams = 0;
    for (let i = 0; i < input.length; i++) {
        let parts = input[i].split(/\s*\-\s*/g);
        let name = parts[0].trim();
        let partTwo = parts[1].split(/s*\:\s*/g);
        let course = partTwo[0].trim();
        let result = Number(partTwo[1].trim());

        if(result > 400 || result < 0){
            continue;
        }

        if(!data.has(course)){
            data.set(course, new Map());
        }

        if(!data.get(course).has(name)){
            data.get(course).set(name, {name: name, result: result, makeUpExams: 0})
        }else{
            let prevResult = data.get(course).get(name).result;

            if(prevResult < result){
                prevResult = result;
            }

            data.get(course).get(name).result = prevResult;
            data.get(course).get(name).makeUpExams = data.get(course).get(name).makeUpExams + 1;
        }
    }

    let result = {};

    function sort(studentA, studentB) {
        if (studentA.result > studentB.result) {
            return -1;
        }
        if (studentA.result < studentB.result) {
            return 1;
        }
        if (studentA.makeUpExams > studentB.makeUpExams) {
            return 1;
        }
        if (studentA.makeUpExams < studentB.makeUpExams) {
            return -1;
        }

        return studentA.name.localeCompare(studentB.name);
    }

    for (let [course, name] of data) {
        result[course] = [...name.values()].sort(sort);
    }

    console.log(JSON.stringify(result));
}