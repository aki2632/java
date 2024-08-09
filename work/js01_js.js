console.log("hello...1");
console.log('hello...2');
console.log(`hello...3`);

//데이터들의 표현방식
//"문자열a-zA-Z한글...",'문자열a-zA-Z한글...',`문자열+변수표현식`
//숫자 : 123, 3.14 
//참거짓 : true,false
//배열 : [],[1,2,3],['aaa','bbb']
//객체 : {},{name:"kim",age:33}
//무명함수 : function(){}

let bool = true;
bool = false;
console.log(bool);
console.log(typeof(bool));//boolean type

console.log("가나다 'abc'");
console.log(1234);
console.log("가나다"+"abc"+1234);
console.log(typeof("가나다"+1234));

let arr = [11,22,33,"kim"];//array,배열
console.log(arr);
console.log(typeof(arr));//object type

let obj = {name:"kim",age:33};//object,객체
console.log(obj);
console.log(typeof(obj));//object type    


let fn = function(){};
console.log(fn);
console.log(typeof(fn));//function type   

let kor = 99;
let eng = "088";
console.log(kor + eng);//9988 string
eng = parseInt("088");//88
console.log(kor + eng);//187 number

console.log(parseInt("10"));//10

console.log(parseInt("10.123"));//10
console.log(parseFloat("10.123"));//10.123


