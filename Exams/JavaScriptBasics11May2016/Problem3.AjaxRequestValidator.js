function ajaxRequestValidator(input) {
    let hashPattern = input.pop().split('');

    function isValidAuth(auth, hash) {
        let arr = auth.split('');
        for (let i = 0; i < hash.length; i+=2) {
            let count = Number(hash[i]);
            let letter = hash[i + 1];

            if (count === arr.filter(l => l === letter).length) {
                return true;
            }
        }

        return false;
    }

    for (let i = 0; i < input.length; i+=3) {
        let methodPattern = /^Method:\s(GET|PUT|POST|DELETE)$/;
        let credentialsPattern = /^Credentials:\s(Basic|Bearer)\s([A-Za-z0-9]+)$/;
        let contentPattern =  /^Content:\s([0-9a-zA-Z\.]+)$/;

        let method = input[i];
        let credentials = input[i + 1];
        let content = input[i + 2];

        if(methodPattern.test(method) && credentialsPattern.test(credentials) && contentPattern.test(content)) {
            let methodType = method.match(methodPattern)[1];
            let [credentialsType,auth]  = credentials.match(/^Credentials:\s(Basic|Bearer)\s([A-Za-z0-9]+)$/).filter((e, i) => i > 0);

            if (methodType !== 'GET' && credentialsType === 'Basic') {
                console.log(`Response-Method:${methodType}&Code:401`);
                continue;
            }

            if (!isValidAuth(auth, hashPattern)) {
                console.log(`Response-Method:${methodType}&Code:403`);
                continue;
            }

            console.log(`Response-Method:${methodType}&Code:200&Header:${auth}`);
        }else {
            console.log('Response-Code:400');
        }
    }
}