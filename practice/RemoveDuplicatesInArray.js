function removeDuplicates(arr) {
    return arr.filter((item, index) => arr.indexOf(item) === index);
}



const array = [1, 2, 2, 3, 4, 4, 5];
const uniqueArray = removeDuplicates(array);
console.log("Input -> ",array);
console.log("Output -> ", uniqueArray);
