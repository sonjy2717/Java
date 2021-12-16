//<!DOCTYPE html>
//<html lang="en">
//<head>
//    <meta charset="UTF-8">
//    <meta http-equiv="X-UA-Compatible" content="IE=edge">
//    <meta name="viewport" content="width=device-width, initial-scale=1.0">
//    <title>Calculator.html</title>
//    <script>
//        var cal = "";
//        
//        function input(n){
//            cal += n;
//            document.getElementById("div2").innerHTML = cal;
//        }
//
//        function result(){
//            var result = eval(cal);
//            document.getElementById("div2").innerHTML = result;
//            cal = result;
//        }
//
//        function remove(clear){
//            if(clear == 'C'){
//                cal = "";
//            }
//            else if(clear == 'B'){
//                cal = cal.substr(0, cal.length-1);
//            }
//            document.getElementById("div2").innerHTML = cal;
//        }
//    </script>
//    <style>
//        #div1{
//            background-color: #DDDDDD;
//            width: 320px;
//            border-radius: 5px;
//            padding: 5px;
//            text-align: right;
//            font-weight: bold;
//            font-size: 20pt;
//        }
//        #div2{
//            background-color: #70C738;
//            border-radius: 5px;
//            padding: 10px;
//            height: 50px;
//        }
//        .btn {
//            background-color: #7B7B7B;
//            color: white;
//            border-radius: 5px;
//            padding: 10px;
//            font-weight: bold;
//            border: none;
//            font-size: 14pt;
//            width: 155px;
//        }
//        button {
//            color: white;
//            background-color: #373737;
//            border: none;
//            width: 75px;
//            padding: 10px;
//            border-radius: 5px;
//            font-weight: bold;
//            font-size: 12pt;            
//        }
//        .bt{
//            background-color: #FA9609;
//        }
//        button:hover{
//            cursor: pointer;
//        }
//        button:active{
//            background-color: white;
//        }
//    </style>
//</head>
//<body>
//    <div id="div1">
//        <div id="div2">
//            
//        </div>
//        <table>
//            <tr>
//                <th><button class="btn"
//                    onclick="remove('B');">BackSpace</button></th>
//                <th><button class="btn"
//                    onclick="remove('C');">C</button></th>
//            </tr>
//        </table>
//        <table>
//            <tr>
//                <th><button
//                    onclick="input('1');">1</button></th>
//                <th><button
//                    onclick="input('2');">2</button></th>
//                <th><button
//                    onclick="input('3');">3</button></th>
//                <th><button class="bt"
//                    onclick="input('/');">/</button></th>
//            </tr>
//            <tr>
//                <th><button
//                    onclick="input('4');">4</button></th>
//                <th><button
//                    onclick="input('5');">5</button></th>
//                <th><button
//                    onclick="input('6');">6</button></th>
//                <th><button class="bt"
//                    onclick="input('*');">x</button></th>
//            </tr>
//            <tr>
//                <th><button
//                    onclick="input('7');">7</button></th>
//                <th><button
//                    onclick="input('8');">8</button></th>
//                <th><button
//                    onclick="input('9');">9</button></th>
//                <th><button class="bt"
//                    onclick="input('+');">+</button></th>
//            </tr>
//            <tr>
//                <th><button
//                    onclick="result();">=</button></th>
//                <th><button
//                    onclick="input('0');">0</button></th>
//                <th><button
//                    onclick="input('.');">.</button></th>
//                <th><button class="bt"
//                    onclick="input('-');">-</button></th>
//            </tr>
//        </table>
//    </div>
//</body>
//</html>