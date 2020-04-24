solution = (A) =>{
	if ( !A.length ) return;
	var map = []
	var answer = new Set();

   let i;
   //var forTime = Date.now();
   for(let n = 0; n < A.length; n++){
   	    i = A[n];
   	    if( !map[i] ) map[i] = []; //create array if it doesnt exist
   	    map[ i ].push(i);
   	    console.log(i);
   	    if( map[i].length % 2 !== 0) {  answer.add(i);
   	        console.log( "\ni : " + i
   	        	+ "\nlength : " + map[i].length
   	        	+ "\nanswer : " + answer + "\n") ;
   	    } else {
   	    	answer.delete(i);
   	    }
    };//end for
    var endTime = Date.now();
    //console.log(  "For time: " + ((endTime - forTime)/1000) + "s");
  console.log(map)
   return answer.values().next().value;
}