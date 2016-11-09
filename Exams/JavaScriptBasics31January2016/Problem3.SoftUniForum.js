function softUniForum(input) {
    let namePattern = /#([a-zA-Z][\w-]+[a-zA-Z0-9])\b|<code>[\w\W]*?<\/code>/g;
    let line = '';
    let listOfBannedd = input[input.length - 1];
    let listOfBanned = listOfBannedd.split(' ');
    let printOnly = true;

    for (let j = 0; j < input.length - 1; j++) {
        let word = input[j];
        if (word == '<code>') {
            printOnly = false;
        }
        if(word == '</code>'){
            printOnly = true;
        }
        if (printOnly) {
            for (let i = 0; i < listOfBanned.length; i++) {
                let name = listOfBanned[i];
                let reg = new RegExp("#" + name, "g");
                word = word.replace(reg, m => '*'.repeat((m.replace('#', '').length)));
            }
            word = word.replace(namePattern, m => "<a href=\"/users/profile/show/" + m.replace('#', '').toString() + "\">" + m.replace('#', '').toString() + "</a>")
            console.log(word);
        } else {
            console.log(word);
        }
    }
}



/*#RoYaL: I'm not sure what you mean,
but I am confident that I've written
everything correctly. Ask #iordan_93
and #pesho if you don't believe me
<code>
#trying to print stuff
print("yoo")
</code>
pesho gosho*/

/*
softUniForum(['#RoYaL: I\'m not sure what you mean,', 'but I am confident that I\'ve written',
    'everything correctly. Ask #iordan_93', 'and #pesho if you don\'t believe me', '<code>',
    '#trying to print stuff', 'print("yoo")','</code>', 'pesho gosho' ]);*/


softUniForum(['<code>', '#lele', '#pochna se </code>', '<code> #mani_begai #gosho <code>',
    'gosho']);