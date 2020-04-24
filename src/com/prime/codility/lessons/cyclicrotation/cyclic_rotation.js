function solution (A, K){
    if ( A.length ===0) return A;

    var temp;
    for(let n=0; n<K; n++){
        temp = A[A.length - 1];
        for(let m=A.length - 1; m>0; m--){
            A[m] = A[m-1];
        }
        A[0] = temp;
    }
    return A;
}


//run
var A = [3, 8, 9, 7, 6]
var K = 3
var B = solution(A, K);
console.log(B);
