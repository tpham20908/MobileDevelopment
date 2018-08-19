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
      {
        question: "When you're starting to learn to ride a motorcycle, the best way to become competent is...?",
        option1: "To take the advice of friends",
        option2: "To take proper training",
        option3: "To read books about it",
        option4: "To get on the road",
        answerNr: 2
      },
      {
        question: "On a normal five gear transmission, you will find neutral where?",
        option1: "Below 1st gear",
        option2: "Between 2nd and 3rd gear",
        option3: "Above 5th gear",
        option4: "Betwenn 1st and 2nd gear",
        answerNr: 4
      },
      {
        question: "As you put your transmission into higher gear, you should release your clutch...?",
        option1: "Simultaneously",
        option2: "Afterwards",
        option3: "Beforehand",
        option4: "Any of these",
        answerNr: 1
      },
      {
        question: "Holders of learner or probationary licenses in Quebec are not permitted to ride with a blood-alcohol concentration of more than...?",
        option1: ".02",
        option2: ".00",
        option3: ".01",
        option4: ".03",
        answerNr: 2
      },
      {
        question: "As you ride, your knees should be...?",
        option1: "Sticking out 45°",
        option2: "Hugging the gas tank",
        option3: "Kept as high up as possible",
        option4: "Sticking out 90°",
        answerNr: 2
      },
      {
        question: "The front brake lever on your motorcycle should be operated with...?",
        option1: "Forefinger and middle finger of your right hand",
        option2: "Forefinger and thumb of your right hand",
        option3: "All four fingers of your right hand",
        option4: "Forefinger, middle finger and ring finger of your right hand",
        answerNr: 3
      },
      {
        question: "Where would you usually find the engine emergency cut-off switch on your motorcycle?",
        option1: "Below the tank",
        option2: "On the right handlebar",
        option3: "On the left handlebar",
        option4: "Underneath the seat",
        answerNr: 2
      },
      {
        question: "When you're passing another vehicle, you shift from 3rd to 5th gear, missing out 4th. What effect will this have on the time it takes you to pass?",
        option1: "It will stay the same",
        option2: "Considerably increase",
        option3: "Any of these depending on conditions",
        option4: "Considerably decrease",
        answerNr: 2
      },
      {
        question: "In normal riding, the ball of your right hand should be where, in relation to the throttle?",
        option1: "Level with it",
        option2: "Slightly above it",
        option3: "Any of these",
        option4: "Slightly below it",
        answerNr: 4
      },
      {
        question: "Not allowing your motorcycle to warm up properly before you head out risks...?",
        option1: "Stalling",
        option2: "All of these",
        option3: "Engine damage",
        option4: "An accident",
        answerNr: 2
      },
      {
        question: "If you have to brake in a curve, your braking distance will be...?",
        option1: "Any of these depending on conditions",
        option2: "The same as in a straight line",
        option3: "Longer than in a straight line",
        option4: "Shorter than in a straight line",
        answerNr: 3
      },
      {
        question: "As you go through a sharp slow turn, you should...?",
        option1: "Decelerate gradually",
        option2: "Maintain a constant speed",
        option3: "Accelerate gradually",
        option4: "Accelerate rapidly",
        answerNr: 3
      },
      {
        question: "The choke on a motorcycle is used for what?",
        option1: "Improving fuel consumption",
        option2: "Starting from cold",
        option3: "Accelerating",
        option4: "Engine braking",
        answerNr: 2
      },
      {
        question: "Where should you be looking when riding in a straight line?",
        option1: "At your front wheel",
        option2: "As far into the distance as possible",
        option3: "At the road 10 metres ahead of you",
        option4: "Halfway between yourself and the horizon",
        answerNr: 2
      },
      {
        question: "When you make a turn on a motorcycle, what does centrifugal force do?",
        option1: "Tries to pull the motorcycle upright",
        option2: "Pushes the rider forward",
        option3: "Pushes down the back end",
        option4: "Tries to push the motorcycle over",
        answerNr: 1
      },
      {
        question: "You should release the clutch when changing gear...?",
        option1: "Gradually",
        option2: "Slowly",
        option3: "In jerks",
        option4: "Sharply",
        answerNr: 1
      },
      {
        question: "What part of your feet should rest on the footrests as you ride?",
        option1: "Your toes",
        option2: "The widest part",
        option3: "Your heels",
        option4: "The middle of your foot",
        answerNr: 2
      },
      {
        question: "A tachometer on your motorcycle will show...?",
        option1: "Total distance travelled since new",
        option2: "Total distance travelled that day",
        option3: "Speed",
        option4: "Engine revolutions",
        answerNr: 4
      },
      {
        question: "When pushing your motorcycle with the engine off, you should stand...?",
        option1: "Any of these",
        option2: "On the right side",
        option3: "At the back",
        option4: "On the left side",
        answerNr: 4
      },
      {
        question: "To negotiate a right-hand curve at speeds of more than 25 kmh, you should...?",
        option1: "Push forward on the right handlebar",
        option2: "Push forward on the left handlebar",
        option3: "Pull back on the right handlebar",
        option4: "Pull back on the left handlebar",
        answerNr: 1
      }
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
