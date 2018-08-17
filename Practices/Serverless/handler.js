'use strict';

module.exports.hello = async (event, context) => {
  return {
    statusCode: 200,
    body: JSON.stringify({
      message: 'Version 1.0',
    }),
  };

  // Use this code if you don't use the http event with the LAMBDA-PROXY integration
  // return { message: 'Go Serverless v1.0! Your function executed successfully!', event };
};

module.exports.imageResize = async (event, context) => {
  return {
    statusCode: 200,
    body: JSON.stringify({
      message: 'Resize your image',
    }),
  };
};

module.exports.quiz1 = async (event, context) => {
  return {
    statusCode: 200,
    body: JSON.stringify([
      {
        question: "What do you use to operate the horn on the normal motorcycle?",
        option1: "Right forefinger",
        option2: "Right thumb",
        option3: "Left thumb",
        option4: "Left forefinger",
        answerNr: 3
      },
      {
        question: "When you are taking a curve, you should be focused on...?",
        option1: "The exit",
        option2: "The apex",
        option3: "The road in front of you",
        option4: "The centre line",
        answerNr: 1
      },
      {
        question: "Skipping a gear when downshifting risks...?",
        option1: "Loss of control",
        option2: "Excessive fuel consumption",
        option3: "Excessive chain wear",
        option4: "Broken clutch",
        answerNr: 1
      },
      {
        question: "For how long must a person hold a Quebec Class 6A motorcycle license before taking a test for a full license?",
        option1: "7 months",
        option2: "3 months",
        option3: "11 months",
        option4: "5 months",
        answerNr: 3
      },
      {
        question: "When you come to a stop, you should be in which gear?",
        option1: "1st",
        option2: "2nd",
        option3: "Neutral",
        option4: "5th",
        answerNr: 1
      },
      {
        question: "When making a turn at speeds below 25 kmh, you should lean...?",
        option1: "With your motorcycle",
        option2: "Opposite to your motorcycle",
        option3: "Further than your motorcycle",
        option4: "Any of these",
        answerNr: 2
      },
      {
        question: "What percentage of your braking capacity is provided by your front brake?",
        option1: "50%",
        option2: "90%",
        option3: "70%",
        option4: "40%",
        answerNr: 3
      },
      {
        question: "When pushing your motorcycle you should...?",
        option1: "Lean it 45° towards you",
        option2: "Keep it exactly upright",
        option3: "Lean it 15° away from you",
        option4: "Lean it 15° towards you",
        answerNr: 4
      },
      {
        question: "You're travelling at 50 kmh and need to slow down in a nonemergency situation. What's the first thing to do?",
        option1: "Release the throttle",
        option2: "Press the rear brake pedal",
        option3: "Squeeze the clutch lever",
        option4: "Squeeze the front brake lever",
        answerNr: 1
      },
      {
        question: "If a new driver accumulates four demerit points during the learner license period, how long will that license be suspended for (minimum)?",
        option1: "6 months",
        option2: "3 months",
        option3: "4 weeks",
        option4: "1 weeks",
        answerNr: 2
      },
    ]),
  };
};
module.exports.quiz2 = async (event, context) => {
  return {
    statusCode: 200,
    body: JSON.stringify({
      message: 'Resize your image',
    }),
  };
};
module.exports.quiz3 = async (event, context) => {
  return {
    statusCode: 200,
    body: JSON.stringify({
      message: 'Resize your image',
    }),
  };
};
module.exports.quiz4 = async (event, context) => {
  return {
    statusCode: 200,
    body: JSON.stringify({
      message: 'Resize your image',
    }),
  };
};
