# JPAssessment

JPAssessment
Programming challenge description: Credits: This problem appeared in the Facebook Hacker Cup 2013 Hackathon. 
Your friend John uses a lot of emoticons when you talk to him on Messenger. In addition to being a person who likes to express himself through emoticons, he hates unbalanced parenthesis so much that it makes him go :(. 
Sometimes he puts emoticons within parentheses, and you find it hard to tell if a parenthesis really is a parenthesis or part of an emoticon. A message has balanced parentheses if it consists of one of the following:
* An empty string "" 
* One or more of the following characters: 'a' to 'z', ' ' (a space) or ':' (a colon) 
* An open parenthesis '(', followed by a message with balanced parentheses, followed by a close parenthesis ')'. 
* A message with balanced parentheses followed by another message with balanced parentheses. 
* A smiley face ":)" or a frowny face ":("
Write a program that determines if there is a way to interpret his message while leaving the parentheses balanced. Input: Your program should read lines from standard input. Each line contains a message that you got from John. Output: Print out the string "YES"/"NO" (all quotes for clarity only) stating whether or not it is possible that the message had balanced parentheses.

Test 1 Test Input: i am sick today (:() Expected Output: YES

Test 2 Test Input: (:) Expected Output YES
