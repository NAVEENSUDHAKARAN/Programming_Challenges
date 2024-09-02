function uniqueElements(arr) {
    let uniqueArr = [];

    for (let i = 0; i < arr.length; i++) {
 
        if (uniqueArr.indexOf(arr[i]) === -1) {
            uniqueArr.push(arr[i]);
        }
    }

    return uniqueArr;
}

function sortObjectsByProperty(arr, property) {
    return arr.slice().sort((a, b) => {
        if (a[property] < b[property]) return -1;
        if (a[property] > b[property]) return 1;
        return 0;
    });
}


let arr = [1,2,3,1,3,4];

console.log(uniqueElements(arr));