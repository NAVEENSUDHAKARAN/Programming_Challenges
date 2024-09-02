function intersectArrays(arr1, arr2) {

    const set1 = new Set(arr1);
   
    const intersection = arr2.filter(item => set1.has(item));
    return intersection;
}

const array1 = [1, 2, 2, 4, 1, 3];
const array2 = [2, 3, 4, 5, 2];
console.log(intersectArrays(array1, array2));
