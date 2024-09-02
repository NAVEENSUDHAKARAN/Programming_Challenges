
function calculate(operation, num1, num2) {
    let result;
    switch (operation) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            if (num2 === 0) {
                console.log('Error: Division by zero');
                return;
            }
            result = num1 / num2;
            break;
        default:
            console.log('Error: Invalid operator');
            return;
    }
    console.log(`Result: ${result}`);
}

calculate("/", 20,10);
