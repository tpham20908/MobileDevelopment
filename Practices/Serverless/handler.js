'use strict';

module.exports.hello = async (event, context) => {
  return {
    statusCode: 200,
    body: JSON.stringify({
      message: 'Version 1.0',
      author: "Tung Pham - IPD12"
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
    body: JSON.stringify([
      {
        question: "If your visibility is impaired or road conditions are bad, you should...?",
        option1: "Reduce your safety margin",
        option2: "Double your safety margin",
        option3: "Increase your safety margin by half",
        option4: "Maintain the same safety margin",
        answerNr: 2
      },
      {
        question: "An engine which is overheated can take how long to cool down?",
        option1: "More than quarter of an hour",
        option2: "More than an hour",
        option3: "More than 10 minutes",
        option4: "More than half an hour",
        answerNr: 2
      },
      {
        question: "At 100 kmh, your field of vision is reduced by approximately...?",
        option1: "10%",
        option2: "50%",
        option3: "25%",
        option4: "75%",
        answerNr: 2
      },
      {
        question: "A vehicle behind is following too closely for you to maintain your desired safety margin. What should you do?",
        option1: "Gesticulate that it should back off",
        option2: "Accelerate away from it",
        option3: "Sound your horn as a warning",
        option4: "Slow down and let it pass",
        answerNr: 4
      },
      {
        question: "Which of these lane positions is best for motorcycling?",
        option1: "The right-hand 3rd",
        option2: "Any depending on circumstances",
        option3: "The central 3rd",
        option4: "The left-hand 3rd",
        answerNr: 2
      },
      {
        question: "When you are negotiating a left-hand curve, your path of travel should be...?",
        option1: "Inside–outside–outside",
        option2: "Outside–outside–inside",
        option3: "Inside–outside–inside",
        option4: "Outside–inside–outside",
        answerNr: 4
      },
      {
        question: "Which of these is not a cause of shimmying or wobbling?",
        option1: "Uneven load",
        option2: "Excessive speed",
        option3: "Incorrect tire pressures",
        option4: "Engine overheating",
        answerNr: 4
      },
      {
        question: "Your safety margin to the rear should be what percentage of your safety margin to your front?",
        option1: "100%",
        option2: "75%",
        option3: "10%",
        option4: "25%",
        answerNr: 1
      },
      {
        question: "If you have to get off onto the shoulder, before you exit the roadway you should...?",
        option1: "Apply both brakes",
        option2: "Release both brakes",
        option3: "Release the rear brake",
        option4: "Release the front brake",
        answerNr: 2
      },
      {
        question: "The best way to let other road users know you are about to slow down is to...?",
        option1: "Flash your brake light",
        option2: "Wave your hand",
        option3: "Sound your horn",
        option4: "Rev your engine",
        answerNr: 1
      },
      {
        question: "An automobile in front of you passes a road sign. As soon as the rear bumper is clear of the sign, you should not arrive there for at least...?",
        option1: "1 second",
        option2: "2 seconds",
        option3: "3 seconds",
        option4: "1.5 seconds",
        answerNr: 2
      },
      {
        question: "If your engine temperature indicator goes into the 'H' zone or the oil pressure indicator lamp comes on, you should...?",
        option1: "Turn off the engine with the ignition key",
        option2: "Turn off the engine with the emergency cut-off switch",
        option3: "Keep riding until you reach a garage",
        option4: "Ride more slowly until things are back to normal",
        answerNr: 2
      },
      {
        question: "If your motorcycle starts hydroplane, you should avoid...?",
        option1: "Braking",
        option2: "All of these",
        option3: "Turning the handlebars",
        option4: "Applying the throttle",
        answerNr: 2
      },
      {
        question: "If your chain or belt should break, the first thing to do is...?",
        option1: "Squeeze the clutch lever",
        option2: "Turn off the engine",
        option3: "Shift into neutral",
        option4: "Apply the rear brake",
        answerNr: 1
      },
      {
        question: "If you have an anti-lock braking system on your motorcycle, it will reduce your stopping distance by...?",
        option1: "10%",
        option2: "0%",
        option3: "50%",
        option4: "25%",
        answerNr: 2
      },
      {
        question: "In which of these situations should you use your turn signals?",
        option1: "Turning in heavy traffic",
        option2: "In all of them",
        option3: "Turning into your driveway when no other cars are present",
        option4: "Switching lanes in light traffic",
        answerNr: 2
      },
      {
        question: "How much of the information you need for driving is provided for you by your eyes?",
        option1: "50%",
        option2: "35%",
        option3: "75%",
        option4: "90%",
        answerNr: 4
      },
      {
        question: "If the rear wheel locks and you go into a skid, you should release the rear brake pedal and...?",
        option1: "Keep the handlebars straight",
        option2: "Turn the handlebars away from the skid",
        option3: "Turn the handlebars in the direction of the skid",
        option4: "Put your feet down",
        answerNr: 3
      },
      {
        question: "You are forced to drive over a tree branch. Just before you hit it, you should...?",
        option1: "Pull your handlebars up",
        option2: "Apply the rear brake",
        option3: "Throw your weight forwards",
        option4: "Decelerate",
        answerNr: 1
      },
      {
        question: "If your throttle sticks and it is safe to do so, you can try to release it by...?",
        option1: "Changing up several gears",
        option2: "Twisting back and forth",
        option3: "Shutting it down completely",
        option4: "Turning it fully open",
        answerNr: 2
      },
      {
        question: "When scanning for hazards as you ride, you should be looking by...?",
        option1: "Moving your eyes only",
        option2: "Moving your head only",
        option3: "Moving your eyes and your head aggressively",
        option4: "Moving your eyes and your head slightly",
        answerNr: 4
      },
      {
        question: "Before you reach the entrance of a high-speed curve, you should...?",
        option1: "Smoothly accelerate",
        option2: "Sharply decelerate",
        option3: "Sharply accelerate",
        option4: "Smoothly decelerate",
        answerNr: 4
      },
      {
        question: "You see a vehicle behind you in your mirrors and when you look again it's not there. Most likely it has...?",
        option1: "Slowed down",
        option2: "Stopped",
        option3: "Switched lanes",
        option4: "Moved into your blind spot",
        answerNr: 4
      },
      {
        question: "In which of these circumstances should you reduce your speed?",
        option1: "At night",
        option2: "Heavy traffic",
        option3: "All of them",
        option4: "Rain",
        answerNr: 3
      },
      {
        question: "Which of these is not a good way of making yourself more visible to other road users?",
        option1: "Shouting warnings",
        option2: "Installing a headlight modulator",
        option3: "Travelling in the appropriate third of your lane",
        option4: "Wearing bright protective gear",
        answerNr: 1
      },
      {
        question: "If your motorcycle does start to wobble, what should you do with the handlebars?",
        option1: "Use them to fight the wobble",
        option2: "Grip them firmly",
        option3: "Hold them lightly",
        option4: "Grip them as tight as you can",
        answerNr: 2
      },
      {
        question: "In normal riding in perfect conditions with no other reason not to, most motorcyclists choose...?",
        option1: "The right-hand third of a lane",
        option2: "To ride along the centreline",
        option3: "The central third of a lane",
        option4: "The left-hand third of a lane",
        answerNr: 4
      },
      {
        question: "Your mirrors should be positioned so that you can see...?",
        option1: "All of the lane to your side",
        option2: "All of the lane behind",
        option3: "Half of the lane behind and as much as possible to the sides",
        option4: "Half of the lane to your side and as much as possible of your lane",
        answerNr: 3
      },
      {
        question: "If you're travelling in the middle lane of a three-lane highway, your best position will normally be...?",
        option1: "The centre of your lane",
        option2: "The left of your lane",
        option3: "Any of these, it will make no difference",
        option4: "The right of your lane",
        answerNr: 1
      },
      {
        question: "There is an obstacle ahead that you're going to have to swerve round. As you approach it, you should be looking...?",
        option1: "At where you want to be beyond the obstacle",
        option2: "At the road between you and the obstacle",
        option3: "At your front wheel",
        option4: "At the obstacle",
        answerNr: 1
      }
    ]),
  };
};
module.exports.quiz3 = async (event, context) => {
  return {
    statusCode: 200,
    body: JSON.stringify([
      {
        question: "When passing another vehicle, you should use your turn signals...?",
        option1: "Moving out only",
        option2: "Moving out and moving back in",
        option3: "Only if there is heavy traffic",
        option4: "Moving back in only",
        answerNr: 2
      },
      {
        question: "A driver approaching signals that it is safe for you to make your turn. You should...?",
        option1: "Thank them but make your own checks",
        option2: "Turn without thanking them",
        option3: "Stop and reprimand them",
        option4: "Thank them and turn",
        answerNr: 1
      },
      {
        question: "You should avoid using your horn when approaching...?",
        option1: "Cyclists",
        option2: "Large vehicles",
        option3: "Tractors",
        option4: "Pedestrians",
        answerNr: 1
      },
      {
        question: "You see an emergency vehicle coming up from behind in your mirrors when riding on a single lane highway. You should...?",
        option1: "Move over to the right side of the road",
        option2: "Accelerate to match their speed",
        option3: "Hold your position until its driver sounds the horn",
        option4: "Move over to the left side of the road",
        answerNr: 1
      },
      {
        question: "The right third of a lane is best for...?",
        option1: "All of these",
        option2: "Making right turns",
        option3: "Avoiding air turbulence",
        option4: "Coming over the top of a hill",
        answerNr: 1
      },
      {
        question: "If you're riding in a group, the odd-numbered riders should be riding...?",
        option1: "In the right of your lane",
        option2: "Over the centre line",
        option3: "In the left of your lane",
        option4: "In the centre of your lane",
        answerNr: 3
      },
      {
        question: "If you get tired when you're out on the road, you should...?",
        option1: "Open your faceshield and jacket",
        option2: "Stop for a break",
        option3: "Ride more slowly",
        option4: "Ride faster to get there quicker",
        answerNr: 2
      },
      {
        question: "Once you have joined the acceleration lane from an on ramp, you should position yourself...?",
        option1: "As close to the verge as possible",
        option2: "In the left-hand portion of the lane",
        option3: "In the right-hand portion of the lane",
        option4: "In the centre of the lane",
        answerNr: 2
      },
      {
        question: "When you're riding with friends, a way of making sure nobody pushes too hard is to...?",
        option1: "Have a prize for the fastest rider",
        option2: "Ride very close together",
        option3: "Have agreed rest points where everyone can meet",
        option4: "Put all the inexperienced riders in front",
        answerNr: 3
      },
      {
        question: "When exiting the highway, you should reach the speed indicated for the deceleration lane...?",
        option1: "Any of these",
        option2: "By the end of it",
        option3: "Around half way down it",
        option4: "Before you join it",
        answerNr: 3
      },
      {
        question: "When you join a highway from an on ramp, you should adapt your speed to...?",
        option1: "The general speed of vehicles on the highway",
        option2: "The speed of the fastest vehicle on the highway",
        option3: "The speed of the slowest vehicle on the highway",
        option4: "Exactly match the speed limit",
        answerNr: 1
      },
      {
        question: "Which of these groups commit the most traffic offences?",
        option1: "48-year-olds and upwards",
        option2: "32 to 48-year-olds",
        option3: "24 to 32-year-olds",
        option4: "16 to 24-year-olds",
        answerNr: 4
      },
      {
        question: "A driver coming towards you at an intersection is indicating that they will turn left. You can...?",
        option1: "Assume you can ignore them",
        option2: "Assume that they have seen you",
        option3: "Assume that they will wait for you to pass",
        option4: "Assume nothing at all",
        answerNr: 4
      },
      {
        question: "How should you tell the angle at which railway tracks are going to cross your path?",
        option1: "By looking at a map beforehand",
        option2: "By watching other cars cross",
        option3: "By looking at the warning sign",
        option4: "By watching trains cross",
        answerNr: 3
      },
      {
        question: "Where should you be keeping a special lookout for pedestrians?",
        option1: "On rural roads",
        option2: "In urban areas",
        option3: "Near parks",
        option4: "In school zones",
        answerNr: 4
      },
      {
        question: "As you turn through an intersection, you should be focusing on...?",
        option1: "The middle of the intersection",
        option2: "The exit of the turn",
        option3: "The oncoming traffic",
        option4: "The traffic behind you",
        answerNr: 2
      },
      {
        question: "Which of these is not a good motivation for wanting to learn to ride a motorcycle?",
        option1: "Enjoying a new skill",
        option2: "To be with friends",
        option3: "Needing transport",
        option4: "Loving speed",
        answerNr: 4
      },
      {
        question: "When riding down a street where vehicles are parked along the curb, what's usually your safest option in terms of lane position?",
        option1: "Any of these it makes no difference",
        option2: "Centre of the lane",
        option3: "Right portion of the lane",
        option4: "Left portion of the lane",
        answerNr: 4
      },
      {
        question: "Which of these is a good way of keeping your emotions in check when faced with heavy traffic?",
        option1: "Letting off steam by hooting",
        option2: "Knowing how to weave",
        option3: "Using an aggressive riding style",
        option4: "Leaving earlier",
        answerNr: 4
      },
      {
        question: "A heavy vehicle at an intersection is about to make a right turn, which you also want to make. You should...?",
        option1: "Drive around it to the right",
        option2: "Drive around it to the left",
        option3: "Use the sidewalk if it is clear",
        option4: "Hang back until its turn is completed",
        answerNr: 4
      },
      {
        question: "How should you park your motorcycle in a roadside parking space?",
        option1: "At 90° to the curb",
        option2: "At 45° to the curb, pointing towards the traffic flow",
        option3: "At 45° to the curb, pointing away from the traffic flow",
        option4: "Parallel to the curb",
        answerNr: 2
      },
      {
        question: "It's important that the leader of a group is...?",
        option1: "An experienced rider",
        option2: "The fastest rider",
        option3: "The least experienced rider",
        option4: "Owner of a large motorcycle",
        answerNr: 1
      },
      {
        question: "Which of these is the only thing you don't need to do when approaching an intersection?",
        option1: "Slow down",
        option2: "Sound your horn",
        option3: "Check in your mirrors",
        option4: "Scan ahead",
        answerNr: 2
      },
      {
        question: "Due to the nature of the vehicle, which of these road users will get tired more quickly than the others?",
        option1: "RV driver",
        option2: "Motorcyclist",
        option3: "Truck driver",
        option4: "Car driver",
        answerNr: 2
      },
      {
        question: "If you are travelling at 90 kmh and you take your eyes off the road for four seconds to look at a distraction, how far will you have travelled in that time?",
        option1: "100 m",
        option2: "25 m",
        option3: "15 m",
        option4: "50 m",
        answerNr: 1
      },
      {
        question: "If you're riding in a group, there should be no more than you and how many others?",
        option1: "4",
        option2: "3",
        option3: "6",
        option4: "5",
        answerNr: 1
      },
      {
        question: "If you have a sleep deficit of 5 hours, this is likely to affect your riding as badly as...?",
        option1: "Half a glass of wine",
        option2: "1 glass of wine",
        option3: "3 or more glasses of wine",
        option4: "2 glasses of wine",
        answerNr: 3
      },
      {
        question: "The last thing you should do before passing a car is...?",
        option1: "Check over your left shoulder",
        option2: "Turn on your left flasher",
        option3: "Check over your right shoulder",
        option4: "Sound your horn",
        answerNr: 1
      },
      {
        question: "Riding in a group, the gap between rider #2 and rider #4 should be no less than...?",
        option1: "1.5 seconds",
        option2: "0.5 seconds",
        option3: "2 seconds",
        option4: "3 seconds",
        answerNr: 3
      },
      {
        question: "There are workers ahead of you on a three lane highway by a vehicle with flashing lights. You should...?",
        option1: "Slow down and remain in your lane",
        option2: "Slow down and change lanes if possible",
        option3: "Keep your position and speed and sound your horn",
        option4: "Change lanes and speed up",
        answerNr: 2
      }
    ]),
  };
};
module.exports.quiz4 = async (event, context) => {
  return {
    statusCode: 200,
    body: JSON.stringify([
      {
        question: "Which of these materials is not suitable for your motorcycle jacket?",
        option1: "Fleece",
        option2: "Leather",
        option3: "Kevlar",
        option4: "Cordura",
        answerNr: 1
      },
      {
        question: "You're riding in fog and the tail lights of the vehicle ahead disappear. What should you do?",
        option1: "Pull off the road and wait for the fog to clear",
        option2: "Speed up until you see the tail lights again",
        option3: "Reduce your speed",
        option4: "Turn on your main beam to look for the car ahead",
        answerNr: 1
      },
      {
        question: "You're travelling on a road you know well in good conditions and low traffic at night. Your speed should be...?",
        option1: "Lower than in the daytime",
        option2: "Whichever of these you judge best",
        option3: "The same as in the daytime",
        option4: "Higher than in the daytime",
        answerNr: 1
      },
      {
        question: "Extra weight like a passenger or baggage will affect...?",
        option1: "Braking distance",
        option2: "Acceleration speed",
        option3: "Handling",
        option4: "All of these things",
        answerNr: 4
      },
      {
        question: "Incorrect tire pressures will effect...?",
        option1: "Tire wear",
        option2: "All of these",
        option3: "Braking distance",
        option4: "Handling",
        answerNr: 2
      },
      {
        question: "Roughly how many kilometres of riding should you have under your belt before you have enough experience to carry a passenger/heavy baggage?",
        option1: "1500 km",
        option2: "1000 km",
        option3: "500 km",
        option4: "2500 km",
        answerNr: 4
      },
      {
        question: "When loading baggage, as much as possible you should try to keep it...?",
        option1: "Low and central",
        option2: "Low and to the rear",
        option3: "High and forwards",
        option4: "High and central",
        answerNr: 1
      },
      {
        question: "When you're trying out a helmet in a store, how long is it recommended you should wear it for to check it remains properly adjusted without causing discomfort?",
        option1: "20 minutes",
        option2: "15 minutes",
        option3: "10 minutes",
        option4: "5 minutes",
        answerNr: 1
      },
      {
        question: "Which of these drugs will most seriously affect your riding?",
        option1: "Any of them, depending on the drug",
        option2: "Prescription drugs",
        option3: "Illegal drugs",
        option4: "Over-the counter drugs",
        answerNr: 1
      },
      {
        question: "The best way to secure a load to your motorcycle is to use...?",
        option1: "Rope",
        option2: "Twine",
        option3: "Chain",
        option4: "Bungee cords",
        answerNr: 4
      },
      {
        question: "Wearing eye protection is mandatory for motorcycling in 36 American states and in which Canadian province?",
        option1: "Nova Scotia",
        option2: "Prince Edward Island",
        option3: "Saskatchewan",
        option4: "Manitoba",
        answerNr: 3
      },
      {
        question: "What is the average safe lifespan of a motorcycle helmet?",
        option1: "5 to 9 years",
        option2: "3 to 7 years",
        option3: "9 to 12 years",
        option4: "2 to 5 years",
        answerNr: 2
      },
      {
        question: "Your motorcycle footwear should ideally give protection as high as...?",
        option1: "The patella",
        option2: "The tibia",
        option3: "The tarsals",
        option4: "The femur",
        answerNr: 2
      },
      {
        question: "If you're about to hit a pothole, the best place to put your weight is...?",
        option1: "To the right",
        option2: "To the left",
        option3: "To the front",
        option4: "To the rear",
        answerNr: 4
      },
      {
        question: "Which of these is not a good colour for visibility for a motorcycle helmet?",
        option1: "Navy blue",
        option2: "White",
        option3: "Yellow",
        option4: "Orange",
        answerNr: 1
      },
      {
        question: "Motorcycle gloves should cover at least...?",
        option1: "Your whole hand",
        option2: "Your whole hand and wrist",
        option3: "The palm of your hand",
        option4: "Your finger up to the second joint",
        answerNr: 2
      },
      {
        question: "A good way of drying off your brakes in constant rain is to...?",
        option1: "Gently apply the brakes",
        option2: "Make jerky stop start progress",
        option3: "Lean the motorcycle from side to side",
        option4: "Stop regularly to wipe them with a cloth",
        answerNr: 1
      },
      {
        question: "Which of these should make you think about leaving your motorcycle home?",
        option1: "Feeling angry",
        option2: "Feeling stressed",
        option3: "All of them",
        option4: "Feeling fatigued",
        answerNr: 3
      },
      {
        question: "When riding at night you should avoid...?",
        option1: "Looking directly at other vehicles",
        option2: "Using your high beam headlights",
        option3: "Wearing tinted lenses",
        option4: "All of these things",
        answerNr: 4
      },
      {
        question: "To have an abrasion resistance of 2.5 seconds in an accident, leather gloves need to be...?",
        option1: "0.5 mm thick",
        option2: "0.7 mm thick",
        option3: "1.2 mm thick",
        option4: "0.9 mm thick",
        answerNr: 4
      },
      {
        question: "Which of these items is it safe to leave off if you're going for a slow ride in hot sunny weather?",
        option1: "Helmet",
        option2: "Jacket",
        option3: "Gloves",
        option4: "None of them",
        answerNr: 4
      },
      {
        question: "Protective gear may become a hazard in high winds if it is...?",
        option1: "Not nylon",
        option2: "Too tight",
        option3: "Not leather",
        option4: "Too big for you",
        answerNr: 4
      },
      {
        question: "If your helmet has experienced a heavy impact or been in an accident, what should you do?",
        option1: "Only use it for passengers",
        option2: "Replace it",
        option3: "Wrap it with tape",
        option4: "Visually examine it",
        answerNr: 2
      },
      {
        question: "As well as having front and rear lights and turn signals, your motorcycle should have a light for...?",
        option1: "The clutch",
        option2: "The rear brake lever",
        option3: "The license plate",
        option4: "The ignition switch",
        answerNr: 3
      },
      {
        question: "Which of these can act against the effects of drinking alcohol when riding?",
        option1: "None of them",
        option2: "A cold shower",
        option3: "Black coffee",
        option4: "An energy drink",
        answerNr: 1
      },
      {
        question: "When crossing a dirt or gravel road, you should try to ride...?",
        option1: "Aggressively",
        option2: "Smoothly",
        option3: "Speedily",
        option4: "Timidly",
        answerNr: 2
      },
      {
        question: "Which of these visors should you avoid for your motorcycle helmet?",
        option1: "Tinted",
        option2: "Coloured",
        option3: "Iridescent",
        option4: "All of them",
        answerNr: 4
      },
      {
        question: "Which of these is the only one you don't have to check/adjust when carrying a passenger or baggage?",
        option1: "Headlight",
        option2: "Tire pressure",
        option3: "Suspension",
        option4: "Brake light",
        answerNr: 4
      },
      {
        question: "Roads can be particularly slippery...?",
        option1: "At the beginning of a rain shower",
        option2: "As rain starts to ease off",
        option3: "After half an hour of rain",
        option4: "As pavement starts to dry out after rain",
        answerNr: 1
      },
      {
        question: "Your physical and mental performance declines sharply after you have been awake for...?",
        option1: "17 hours",
        option2: "19 hours",
        option3: "21 hours",
        option4: "15 hours",
        answerNr: 1
      }
    ]),
  };
};
