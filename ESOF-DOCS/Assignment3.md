#Assignment 3

During this third assignement we were given the task of researching on the project's arquitectural view model. We discovered
what arquitectural patterns were followed and discussed their impact on the project itself.

__Arquitectural Patterns__

This project has a few patterns that are easily noticable when it comes to its arquitecture. For starters, the entire project is divided in several components that are built individually, but work together to have the entire game running. Instead of having a huge project with several different things in it, they separate what they feel is important to avoid confusion. Therefore, there are things like the Mage Client, the Mage Server or the Chat that interact with each other through several interfaces. However, all of these are subsystems of their own and have some sort of independence. Another important thing that can be noticed is the presence of a layered arquitecture. Each of the subsystems we've discussed below have different layers that are built on top of each other. This technique allows for developers to do something in their software without knowing exactly everything that is going on with that system. As long as they can understand the layer in which they are working, they won't need to know how lower level layers work to solve their problem.

__Logical View__

The Logical view for this project follows:

![alt text](http://i.imgur.com/9aBDE77.png "Logical View")

__Implementation View__

The implementation view is shown below:

![alt text](http://i.imgur.com/XOssgcg.png "Implementation View")

__Deployment View__

We now take a look at the Deployment View:

![alt text](http://i.imgur.com/yncv0pD.png "Deployment View")

__Process View__

Finally we present the Process View:

![alt text](http://i.imgur.com/nCz6tqd.png "Process View")

__Scenarios__

This project is not particularly complex when it comes to scenarios. The fact is, there are not many use cases in the project, and the relationships between them are somewhat repetitive. The goal is usually to start the game and play it. However, we will show a couple of scenarios to better demonstrate its use cases.

On our first scenario we start the game, find a server and play it against someone else. The resulting diagram will look like this:

![alt text](http://i.imgur.com/Mm280Gy.png "Scenario 1")

On our second scenario, a cliente starts the game, but instead goes to the library manager. Here he can create new libraries, add cards, remove cards, etc. In order for the player to check his/her cards, they need to connect to a server aswell, in this case, a database server. However, the client does not need to know about this, of course.

![alt text](http://i.imgur.com/3vDVXER.png "Scenario 2")

__Team contribution__

Everyone worked together to investigate the arquitectural patterns of the project and create diagrams that show the project components and behaviour.
