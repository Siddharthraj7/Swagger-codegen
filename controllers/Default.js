'use strict';

var utils = require('../utils/writer.js');
var Default = require('../service/DefaultService');

module.exports.studentGET = function studentGET (req, res, next, studentname) {
  Default.studentGET(studentname)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.studentPUT = function studentPUT (req, res, next, body) {
  Default.studentPUT(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.studentfindGET = function studentfindGET (req, res, next, find) {
  Default.studentfindGET(find)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.studentidDELETE = function studentidDELETE (req, res, next, id) {
  Default.studentidDELETE(id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
