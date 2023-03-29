'use strict';


/**
 * Operation to fetch all the students
 *
 * studentname String 
 * returns students
 **/
exports.studentGET = function(studentname) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "Standard" : "Tenth",
  "Fees" : 10000,
  "StudentName" : "Shri",
  "StudentID" : 3
}, {
  "Standard" : "Tenth",
  "Fees" : 10000,
  "StudentName" : "Shri",
  "StudentID" : 3
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Updates an existing students
 *
 * body Student  (optional)
 * no response value expected for this operation
 **/
exports.studentPUT = function(body) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 *
 * find String 
 * returns students
 **/
exports.studentfindGET = function(find) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "Standard" : "Tenth",
  "Fees" : 10000,
  "StudentName" : "Shri",
  "StudentID" : 3
}, {
  "Standard" : "Tenth",
  "Fees" : 10000,
  "StudentName" : "Shri",
  "StudentID" : 3
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 *
 * id Integer 
 * returns student
 **/
exports.studentidDELETE = function(id) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "Standard" : "Sixth",
  "Fees" : 5000,
  "StudentName" : "Sid",
  "StudentID" : 3
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

