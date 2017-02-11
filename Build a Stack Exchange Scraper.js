function processData(input) {
  const re = /id\=\"question-summary-(\d+?)\"(?:\S|\s)*?\<h3\>(?:\[([^\[\]]+)\]\([^\(\)]+\)|\<[^\<]+\>([^\<\>]+)\<[^\<]+\>)<\/h3\>(?:\S|\s)*?class\=\"relativetime\"\>([^<]+)\</ig;
  let match = null;
  while ((match = re.exec(input)) !== null) {
    console.log(match[1].trim().replace(/\n/g, "") + ";" + match[3].trim().replace(/\n/g, "") + ";" + match[4].trim().replace(/\n/g, ""))
  }
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});
