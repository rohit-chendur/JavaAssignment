const fs = require('fs');
const path = require('path');

fs.readFile(path.join(__dirname,'/TrainingDetails','/student.txt'), 'utf8', (err, data)=>{
    if(err) throw err;
    console.log(data);
});