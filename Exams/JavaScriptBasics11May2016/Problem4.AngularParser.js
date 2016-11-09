function angularParser(input) {
    let map = new Map();
    let secondMap = new Map();

    for (let i = 0; i < input.length; i++) {
        let pattern = /^\$(app|controller|model|view)='([^']+)'(?:&app='([^']+)')?$/;

        let type = input[i].match(pattern)[1];
        let name = input[i].match(pattern)[2];
        let appName = input[i].match(pattern)[3];

        if(appName === undefined) {
            map.set(name, {controllers: [], models: [], views: []});

            if(secondMap.has(name)){
                map.get(name)['controllers'] =  map.get(name)['controllers'].concat(secondMap.get(name)['controllers']);
                map.get(name)['models'] = map.get(name)['models'].concat(secondMap.get(name)['models']);
                map.get(name)['views'] = map.get(name)['views'].concat(secondMap.get(name)['views']);
            }
        }else{
            if (!map.has(appName)) {
                if (!secondMap.has(appName)) {
                    secondMap.set(appName, {controllers: [], models: [], views: []});
                }
                secondMap.get(appName)[type + 's'].push(name);
            } else {
                map.get(appName)[type + 's'].push(name);
            }
        }
    }

    let result = {};

    function sortApps(appA, appB, allApps) {
        let appAControllersCount = allApps.get(appA).controllers.length;
        let appBControllersCount = allApps.get(appB).controllers.length;
        if (appAControllersCount == appBControllersCount) {
            let appAModelsCount = allApps.get(appA).models.length;
            let appBModelsCount = allApps.get(appB).models.length;

            return appAModelsCount - appBModelsCount;
        }

        return appBControllersCount - appAControllersCount;
    }

    let sortedApps = [...map.keys()].sort((a1, a2) => sortApps(a1, a2, map));
    for (let app of sortedApps) {
        result[app] = {controllers: [], models: [], views: []};
        result[app].controllers = map.get(app).controllers.sort((a, b) => a.localeCompare(b));
        result[app].models = map.get(app).models.sort((a, b) => a.localeCompare(b));
        result[app].views = map.get(app).views.sort((a, b) => a.localeCompare(b));
    }

    console.log(JSON.stringify(result));
}