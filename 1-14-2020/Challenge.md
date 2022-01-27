Challenge Name: The Tic-Tac-Toe uprising

Note: This is a fairly hard problem, so I don’t expect you guys to knock this off in a single day…or even 4 days….or even a week. This is a really really nice challenge tho, because it teaches you a lot

Challenge Description: The year is 2049, Daniel’s arch-nemesis James Gosling (founder of Java, *still salty about the test about classes*) has taken over the world. His intelligence grew too big for anyone to handle, it’s up to you to stop him. You might be wondering…How did his brain become so massive? It’s simple really….he played a lot of Tic-Tac-Toe. He studied Tic-Tac-Toe theory even more than how Kush studies brawl stars and BTD theory, it's insane! It’s not just the classic Tic-Tac-Toe he is good at, but even the variants as well!!!!!! Your job, if you choose to accept it (which I am forcing you to do anyway), is to create a *general* (you’ll see what that means in a sec) tic-tac-toe solver that implements minimax (you’ll see soon). If you can make a program that can beat James Gosling’s younger self in tic-tac-toe, his pride will be ruined, and the future will be saved!

Challenge Specs:

First off…lets get this clear…tic-tac-toe is a **completed** game. This means that given that player one goes first, it is IMPOSSIBLE for player one to lose (unless he’s dumb dumb). We will be making a minimax algorithm of VARIANTS of tic-tac-toe (ill talk about that in a bit)…and the legit one if you want. How we plan to do all of this is through the minimax algorithm. So let’s talk about that.
Note this is a garbage explanation of mini-max…so if you don’t want to waste your time reading this…you could also watch this video: 

https://www.youtube.com/watch?v=cGN6LfnOPeo or https://www.youtube.com/watch?v=KU9Ch59-4vw 

Let’s call a state…the current configuration of a tic-tac-toe board. (‘.”, representing a free space, “X” representing x’s move, and “O” representing O’s move).

Example State:
X | . |  .
.   | . |  O
   | X |  .

From there we can determine that it is player O’s move (find which player has the smaller number of pieces on the board). From there, the player has many different options to go to…two such options are 

X | . |  .
.   | O |  O
   | X |  .
or
X | . |  O
.   | . |  O
   | X |  .

Each of these are new states that can come from a previous state. 

(Look at: https://images.squarespace-cdn.com/content/v1/5a0c6978bff2001ef7581170/1513544673859-RJ7F813HA0C9A45OME6C/a-move-tree-where-x-always-wins.png?format=1000w for a better picture).

Now lets just analyze states near a winning point. Say the state of the board is:

X | . |  O
X   | . |  O
   | X |  .

And its O’s move.  Out of the many posible states, we have a single state that gives us a win.

X | . |  O
X   | . |  O
   | X |  O

Now we can backtrack, knowing that its X’s move rn and that its a end position (we found 3 in a row)…we know that the previous boardis a winning board for O. Now we know that 

X | . |  O
X   | . |  O
   | X |  .

Is a winning board for O so if X was ever in the board

   | . |  O
X   | . |  O
   | X |  .

It would not make the move

 X  | . |  O
X   | . |  O
   | X |  .

Because it recgonizes that that state allows O to win. But another move like…

   | . |  O
X   | . |  O
   | X |  X
Ik its a little confusing…but try drawing some states out…or watch some vids, they explain it very well.

Before I continue, just note that the following algorithm described is just the formal way of saying a “complete search”, where we find all the possible states recursively. 

The minimax algorithm generates a tree, as shown in the image link above. Where the starting state (of no moves made), generates a list of all the possible moves. Whenever a winning state is reached…a value is given for the state depending on who wins. For simplicity, let's say if X wins we give the state a value 1, if O wins we give the state a value -1. If the state is a draw give it a value 0. Player X wants the maximum possible score (because that is a 1) and Player O wants the minimum possible score (because if he wins that is -1). This is where mini-max comes in.  At every move…pick the move that gives you the lowest possible score (if you are a O), or pick the highest possible score (if you are X). The score for undetermined states can be calculated recursively. 



This is a recursion solution to the problem. The function can be adapted to return the best move…so an bot can play. Again…the youtube videos explain the concept much better

The first challenge will be to create a mini-max algorithm for the normal tic-tac-toe.

Now let's discuss the variants….the variants we will be discussing will be nxn dimensional tic-tac-toe and Misere tic-tac-toe. N-dimensional tic tac toe is exactly what it sounds like. The board is NxN large, and the first person to get N in a row wins. Misere tic-tac-toe is the exact opposite for normal tic-tac-toe. In this variant, the first person to get 3 in a row loses. Basically, players try their best to avoid the 3 in a row. We can also generalize this to n dimensions).
Remember…as we increase dimensions…it's harder to go through every possible board configuration (and will take exponentially more time)…so it's up to you to determine…how many states your algo can look through.
Challenge: Create a minimax algorithm that solves the standard 3x3 tic-tac-toe problem. The bot should be able to play against you and NEVER lose.

New Challenge: Generalize your 3x3 tic-tac-toe solver to an 4x4 solver.

New New Challenge: Add an option for 3x3 misere tic tac toe (actually p easy, after you finish the normal 3x3 tic tac toe)

New New New Challenge: Generalize your 4x4 tic-tac-toe solver to an nxn solver. 

New New New New Challenge: Add an option for nxn misere tic tac toe.

New New New New New Challenge: Use the program to play the m,n,k game (described: https://en.wikipedia.org/wiki/M,n,k-game) 
