const fs = require('fs');
const path = require('path');



fs.writeFile(path.join(__dirname,'/TrainingDetails','/student.txt')
   ,'sahana'
   ,(err)=>{
    if(err) throw err;
    console.log('File written to...');
});
