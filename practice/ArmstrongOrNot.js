function isArmstrongNumber(number) {
   
    const numStr = number.toString();
    const numDigits = numStr.length;
    
    let sum = 0;
    for (let digit of numStr) {
        sum += Math.pow(parseInt(digit), numDigits);
    }

    return sum === number;
}

console.log(isArmstrongNumber(153));
console.log(isArmstrongNumber(123));
console.log(isArmstrongNumber(1634));