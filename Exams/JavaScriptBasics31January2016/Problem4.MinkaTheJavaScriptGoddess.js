function minkaTheJavaScriptGoddess(input) {
    let data = {};
    for (let i = 0; i < input.length; i++) {
        let row = input[i].trim().split(/\s+&\s+/g);

        let name = row[0];
        let type = row[1];
        let taskNumber = row[2];
        let score = Number(row[3]);
        let linesOfCode = Number(row[4]);

        let task = "Task " + taskNumber;

        if(!data[task]){
            data[task] = {
                tasks: [],
                average: 0,
                lines : 0
            }
        }

        data[task].tasks.push({
            name: name,
            type: type
        });

        data[task].average += Number(score);
        data[task].lines += linesOfCode;
    }

    Object.keys(data).forEach(function (key) {
        data[key].average = parseFloat((data[key].average / data[key].tasks.length).toFixed(2));
        data[key].tasks.sort(function (a, b) {
            return a.name.localeCompare(b.name);
        });
    });

    var keysSorted = Object.keys(data).sort(function (a, b) {
        if (data[a].average == data[b].average) {
            return data[a].lines - data[b].lines;
        }

        return data[b].average - data[a].average;
    });

    var sortedObject = {};
    keysSorted.forEach(function (el) {
        sortedObject[el] = data[el];
    });

    console.log(JSON.stringify(sortedObject));
}

minkaTheJavaScriptGoddess(['Array Matcher & strings & 4 & 100 & 38', 'Magic Wand & draw & 3 & 100 & 15', 'Dream Item & loops & 2 & 88 & 80',
'Knight Path & bits & 5 & 100 & 65', 'Basket Battle & conditionals & 2 & 100 & 120', 'Torrent Pirate & calculations & 1 & 100 & 20',
'Encrypted Matrix & nested loops & 4 & 90 & 52', 'Game of bits & bits & 5 &  100 & 18', 'Fit box in box & conditionals & 1 & 100 & 95',
'Disk & draw & 3 & 90 & 15', 'Poker Straight & nested loops & 4 & 40 & 57','Friend Bits & bits & 5 & 100 & 81']);


//Name & Type & Task Number & Score & Lines of code

/*
{"Task 1":{"tasks":[{"name":"Fit box in box","type":"conditionals"},
    {"name":"Torrent Pirate","type":"calculations"}],"average":100,"lines":115},
    "Task 5":{"tasks":[{"name":"Friend Bits","type":"bits"},
    {"name":"Game of bits","type":"bits"},{"name":"Knight Path","type":"bits"}],
    "average":100,"lines":164},"Task 3":{"tasks":[{"name":"Disk","type":"draw"},
    {"name":"Magic Wand","type":"draw"}],"average":95,"lines":30},
    "Task 2":{"tasks":[{"name":"Basket Battle","type":"conditionals"},
    {"name":"Dream Item","type":"loops"}],"average":94,"lines":200},
    "Task 4":{"tasks":[{"name":"Array Matcher","type":"strings"},
    {"name":"Encrypted Matrix","type":"nested loops"},{"name":"Poker Straight","type":"nested loops"}],
    "average":76.67,"lines":147}}
*/
