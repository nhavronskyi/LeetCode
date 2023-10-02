type Fn = (n: number, i: number) => any;

function filter(arr: number[], fn: Fn): number[] {
    return arr.reduce((filteredArr, currentValue, index) => {
        if (fn(currentValue, index)) {
            filteredArr.push(currentValue);
        }
        return filteredArr;
    }, []);
}