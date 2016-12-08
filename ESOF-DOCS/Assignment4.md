#Assignment 4

During this assignement we went through the testing phase of our project. We carefully analysed the testing tools created
by the developers in order to understand how this is done. Finally, we corrected a bug in the project.

__Software Testability and Reviews__

When it comes to testing, XMage has several features that help developers with their contributions. Testing can be done in 2 ways. For starters, as we stated previously in other assignements, the entire project is a set of other projects. This means that each big component of the game has its own project. Testing is no exception to that, in a way that a testing project was created, filled with tons of tests. These tests cover the entirety of the project, although they focus more on the Mage logic than other parts. However, this particular testing project is very complex. It is very well structured in a way that anyone can look up tests regarding a certain topic very easily. The separation of the different components in testing is also a concern, as the tests are very independent. There are specific tests for very particular parts of the project, so everything can be tested. However, as much as the Mage Test project is useful, we are always bound to run into other errors that don't get reported by the coded tests. Because of this, Mage has its own unique testing tool which allows for developers to test the multiple components involved in the game all together. Contributors can run the game in testing mode, which basicly gives them total control over a lot of things game related, enhancing testing experience. This allows for someone who is developing something very specific (and therefore, hard to test) to easily test it, given the amount of control the testing tool gives them.

__Test Statistics__

In order to understand just how good testing is in the project, we analysed the automated tests implemented by developers. We ran the tests and check their coverage.
The test coverage numbers are not very positive, as a mere 20% of all classes are actually tested. However, a lot of it has to do with the proportions of the project. For example, the package that contains all the cards has 20147 classes, from which only 3106 are tested. If we put this in contrast with the amount of classes in other packages such as the package that contains game logic (262 classes, from which 144 are tested) we see that the numbers reflected by the coverage results are strongly affected by the cards, not the game logic.
There is a total of 1732 tests across the project, which is a relatively low number considering the complexity of XMage.
This test results lead us to conclude that testing in XMage is mostly done manually. This comes as no surprise as, after all, the developers have created their own testing mode which allows contributors to play the game with that mode, which, in turn, gives them the chance to test pretty much everything. In fact, on the developer notes regarding testing, they actually encourage contributors to use their testing mode. They briefly mention the automated tests. However they also say that these tests cover mainly game logic and other core aspects of the game. This also doesn't come as a shock, considering that only 20% of the classes withing the project were tested, and the 80% that weren't were mainly cards.
Given all of this assessments, we were able to conclude that testing in XMage is mainly done with its own testing tool. However, automated tests come in handy to test if a new change to the software has any impact in the main mechanics of the game.

[Test coverage log](https://github.com/PedroTav/mage/blob/master/ESOF-DOCS/CoverageReport/index.html)

__Bugs__

__Team Contribution__

Everyone worked together to test the project and identify bugs. We analysed testing providing statistics regarding coverage
and other aspects and ended our assignment fixing a bug.
