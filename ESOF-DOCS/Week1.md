#Week 1

During this first week, we have contacted a project admin in order to find out what sort of 
software process models were used in the making of XMage. We established contact through a forum
in which developers talk about their game. The response given to us by the admin was:

_We have no strict software process model we work according to. The developers turnover very often. 
A developer chooses a part he likes to improve and implements it. Best other developers review the 
code (that does not always happen). So it's more up to the skills of the single developer, what he 
can accomplish or not._

We decided to analyse the code and concluded that the project indeed doesn't follow any software process model.
Contributors come and go, and everytime someone joins, they just look at the code and try to build upon it.

However we were able to see that the entire project project is always facing constant change. We consulted a
list of commits to determine what sort of updates the repository is getting. Most of the content updates consist of
new cards added to the game. They are generally just more content. However it is clear that the project
is constantly being put through refactoring. There are lots of commits related to refactoring code all the time.

[List of commits](https://github.com/PedroTav/mage/commits/master)

No strict software model is used during this project and this aproach can significantly affect development.
The fact that no one follows any sort of software modelling pattern, makes it a lot more confusing for newcomers
as they have to look at how things were built in order to understand what the best way to contribute is.
If a specific software process model was taken by the owners of this project, then it would be easier for new
contributors to join and start developing. However, the constant refactoring done to the project allows it to
be always fresh. That is, if someone new joins the team, if they face a problem, it'll be easier to solve because
in the events of having to look at code to fix this issue, he will be looking at rather recent code. This is
important because looking at very old code would be painful, as that code would probably not fit the
current version of the application (that is, it would have an unfamiliar style of programming because it was made in
a previous build of the application).
