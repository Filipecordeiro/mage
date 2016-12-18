#Assignment 5

This final assignment gave us the chance to evolve the software we analysed during this semester. We went through the project
and chose a feature to develop. We also discuss software evolution and maintainability in this project.

__Software Maintainability__

__Evolution Process__

In this section we take a closer look at the feature we develop. The first thing we needed to know was what to evolve. Given
the fact that this is a card game, the answer was obvious: develop a new card. Of course one might ask why not implement another feature. The fact is that the project was built for contributors to create new cards. Making changes in the core of the game can be very complex in this project, because that was not the goal of the developers when they made it open source. Creating cards is, therefore, much simpler and straightforward. XMage has over 1000 unimplemented cards, so we
took a look at the list to see which card poped our interest. We ended up choosing [Dark Suspicions](http://gatherer.wizards.com/Pages/Card/Details.aspx?multiverseid=26414).
In order to properly create the card, we followed the instructions given by the developers. For starters, we used a Perl script
created by developers to generate the basic structure of the card and implement any needed dependencies in the project. All
the cards in the game are already within the databse, which allows for contributors to simply use the script, and therefore, only
have to implement the abilities. Developing the abilities is, of course, the tricky part. We looked at a lot of other cards with
similar effects to understand how one would create these abilities and in the end, we were able to properly implement the card.
We tested it in multiple game scenarios, and the results were very positive. We finished our assignment by creating a [pull request] (https://github.com/magefree/mage/pull/2695).

[Dark Suspicions Commit] (https://github.com/magefree/mage/pull/2695/commits/e31480cb21ada3c30c4ccb95ab7d89201972c5c5)

__Team Contribution__

Everyone worked together to report software evolution in the project and implement a new feature(in this case, a new card).
