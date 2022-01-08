Note: Idk if you guys like logic programming (where you only have to program a little but think of the logic), or "project" programming (where you make something cool, but takes a bit of code). Here is something I whipped up last night, its more on the "project" side, if you want more logic programming tell me...also if you don't get anything in the background section....don't be afraid to dm me or ask in the #aotd channel

POTD: (ill give more than a day)
Challenge Name: Poly wants a Trig
Challenge Description: You are going to make a program that fits a polynomial function into a trig function using taylor series (dw if you don't know what that means..ill explain soon). This is NOT AI, honestly I don't know a thing about AI, but I watched this one 3b1b video on taylor series and I found this really really cool.

Background:

Question 1: What do you mean by fitting?

Say I have the function y = cos(x), when I graph it I get a curvy looking graph. Trig is hard to work with, but polynomials are not. When we fit a function, we try to get an equation to look really really similar to another function. In this case y=1-(x^2/2)+(x^4/24)-(x^6/720) is a good fit for y=cos(x).

Question 2: What are the derivative rules I need to know (if you know calc...you can skip this question)

The first rule is the power rule...it says if you have a a polynomial (A\*x^4 + B\*x^2 + C). For each term in the form 
M\*(x^n) --> the derivative is M\*n\*(x^n-1). So in the example above:

(A\*x^4 + B\*x^2 + C\*x D) -->(A\*x^4 + B\*x^2 + C\*x^1 D\*x^0)
Taking the derivative we get
A\*4\*(x^3) + B\*2\*(x) + C\*1\*(x^0) + D\*0\*(x^-1) --> 4AX^3 + 2BX + C

The next thing to learn is...I won't show you the proof but just know that the derivative of something in the form of

ASin(Bx) is A\*B\*Cos(Bx)
and the derivative of something in the form
ACos(Bx) is A\*B\*(-Sin(Bx))

Remember you can take the derivative multiple times (if any of this is confusing please ask in aotd channel)
Background extended (cause discord typing limit):

What do taylor series do?

Say I want to fit a polynomial like y=sin(x)...where do I start (in this case I want a polynomial with 4 degrees). I am looking for a polynomial in the form

Goal --> y=sin(x)
Fitting Function --> y =A\*x^4 + B\*x^3 + C\*x^2 + D\*x^1 + E.

To solve for the coefficients we work downwards(starting at E). If I plug x=0 into both functions I get.

Goal --> y=0
Fitting function --> y =0 + 0 + 0 + 0 + E

Now equating the both I know that 0 = 0 + 0 + 0 + 0 + E or E=0

Bam one coefficient down. Now how to solve the rest?...this is where derivatives come in. If I take the derivative of both functions I get.

Goal --> y=cos(x)
Fitting Function --> 4\*A\*x^3 + 3\*B\*x^2 + 2\*C\*x + D

Now If I plug in 0 I get

Goal --> y=1
Fitting function --> 0 + 0 + 0 + D
Equating both I get 1 = 0 + 0 + 0 + D or D=1

Bam another coefficient done (if you get what is going on you can skip this part). Ill do some more.

Taking the derivative again I get:
Goal --> y=-sin(x)
Fitting Function --> 4\*3\*A\*x^2 + 3\*2\*B\*x + 2\*C

Plugging into 0 I get 

Goal --> y=0
Fitting function --> 0 + 0 + C.
Now we know C is equal to 0.

Derivative once more
Goal --> y=-cos(x)
Fitting function --> 4\*3\*2\*A\*x + 3\*2\*B

Plugging in 0 you get 
Goal --> y=-1
Fitting function = 0 + 3\*2\*B

3\*2\*B = -1 or B=-1/6

Final Derivative
Goal --> y=sin(x)
Fitting Function --> 4\*3\*2\*A

Plugging in 0 you get 0 = 4\*3\*2\*A or A=0.

Now we know all the coefficients A=0, B=-1/6, C=0, D=1, E=0. Plugging it into out original equation we get.
 y =A\*x^4 + B\*x^3 + C\*x^2 + D\*x^1 + E
 y =0\*x^4 + (-1/6)\*x^3 + 0\*x^2 + 1\*x^1 + 0
y=(-1/6)\*x^3 + x

And we just fit a 4 (technically 3) degree polynomial for sin(x)
---------------------
Challenge: Make a program that asks for 3 things...A,B, and d. Spit out the fitted polynomial with Degree (d) for the function y=A\*sin(B\*x) (you could also ask if you want the function to be sin or cosine). So it could be y=A\*cos(B\*x) if you want. 
---------------------
Extra Challenge: Instead of inputting A,B,and d...make the program parse a give string of a polynomial. 
So I enter: 4\*sin(4\*x) 
And it gives the result out
---------------------
Extra Extra Challenge: Have the string parser, be able to work for other functions than strictly trig functions. So like
y=sin(4\*x)+x^3
---------------------
Resources (If you got confused in the background section read/watch this articles/videos)

Power rule: https://www.youtube.com/watch?v=TgIl15Nlg_U
Derivative of Sine and Cosine: https://www.youtube.com/watch?v=QYJx-ztCrE4
Taylor Series (the 3b1b video I watched that inspired me): https://www.youtube.com/watch?v=3d6DsjIBzJ4 

