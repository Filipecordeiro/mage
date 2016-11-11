#Week 1

During this first week, we have contacted a project admin in order to find out what sort of 
software process models were used in the making of XMage. We established contact through a forum
in which developers talk about their game. The chat follows:

__What software process model did you use in the development of XMage?__

_We have no strict software process model we work according to. The developers turnover very often. 
A developer chooses a part he likes to improve and implements it. Best other developers review the 
code (that does not always happen). So it's more up to the skills of the single developer, what he 
can accomplish or not._

We decided to analyse the code and concluded that the project indeed doesn't follow any software process model.
Contributors come and go, and everytime someone joins, they just look at the code and try to build upon it.

However we were able to see that the entire project is always facing constant change. We consulted a
list of commits to determine what sort of updates the repository is getting. Most of the content updates consist of
new cards added to the game. They are generally just more content. However it is clear that the project
is constantly being put through refactoring. There are lots of commits related to refactoring code all the time.

[List of commits](https://github.com/PedroTav/mage/commits/master)

No strict software model is used during this project and this approach can significantly affect development.
The fact that no one follows any sort of software modelling pattern, makes it a lot more confusing for newcomers
as they have to look at how things were built in order to understand what the best way to contribute is.
If a specific software process model was taken by the owners of this project, then it would be easier for new
contributors to join and start developing. However, the constant refactoring done to the project allows it to
be always fresh. That is, if someone new joins the team, if they face a problem, it'll be easier to solve because
in the events of having to look at code to fix this issue, he will be looking at rather recent code. This is
important because looking at very old code would be painful, as that code would probably not fit the
current version of the application (that is, it would have an unfamiliar style of programming because it was made in
a previous build of the application).

During development, contributors make their changes, but they have to go through project admins to get them released(through pull requests).

The project includes a [Readme](https://github.com/PedroTav/mage/blob/master/readme.md) which has a section for new developers. This includes some developer notes regarding the architecture and structure behind Xmage. It has a useful guide containing information about the classes used in the making of the game, so that newcomers can know what they need to work on to implement a specific funcionality. They also explain how testing is made, stating they have a testing mode for contributors to use and clarifying how to use it.

The project also includes changelogs which helps development as contributors can look at these to find out what has changed and avoid making mistakes when creating something new.

[List of changelogs](https://github.com/magefree/mage/wiki/Release-changes)

As the admin above said, developers turnover very often. This has advantages and disadvantages. On one hand, the project is always fresh with people consistently motivated towards working on it. On the other hand, newcomers will face a harder time developing because they will have to build on something that wasn't made by them. Of course in this case, if contributors are making new cards to the game, they probably won't have to deal with much code other than their own. However, if a more serious issue happens (like in the core of the game), the people that once worked on that part of the project are probably not contributors any more and so it's up the to the newcomers to invest time and effort towards understanding what was done before.

Having such an open strategy for development is in the nature of open source projects and it does have its advantages. The fact that no strict model was taken makes new contributors feel less restricted, and this will highly motivate more people towards joining.

__Team Contribution__:

During this first week everyone sat down to discuss what software process models were used in the project. In this particular case, no clear software process model was taken, so we stated the main advantages and disadvantages of such approach.
