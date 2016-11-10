During this second assignement we were given the task of finding out how the project deals with requirements. How do developers decide on what to implement. We also analysed the whole project system in order to design Use Case diagrams and a Domain Model.

__Requirements__

This project is not the most active when it comes to requirements elicitation. XMage is based on the card game Magic: The Gathering. Games are usually well defined systems, as they don't face big enough changes for there to be huge shifts in requirements. The fact is that, in this case, developers are creating a card game and most of the time they contribute to the project, they are creating new cards(that is, adding new content), so the only requirements they have to follow are the ones they set for themselves(ex: what the new card should do) and base requirements(that is, the ones made when the game was created). Therefore, when someone decides they want to develop something new, they only need to make sure they follow the game specifications/rules. They do face new requirements every time they create something new. If someone is creating a new card, they should upfront know what the card should and should not do, and how users should be able to interact with it. However, so many contributions are basically new content that doesn't really change the game, therefore requirements don't change either. No matter how many cards they create, the game will in its core always be the same, because it follows a strict pattern given by Magic: The Gathering. This makes all requirements elicitation technices non existent in this project. Players can only have at best 7 cards in the hand. Decks must have a specific number of cards. These are the sort of requirements people have to deal with, but as we just mentioned, these are in the game's nature, so they won't change (because that would change the game!).

__Use cases__

The following actions can be taken within XMage:

1. Players can draw cards from their library.
2. Players can put cards on the board.
3. Players can activate the cards that are on the board. That is, they can either attack, block or have a special effect. This action may affect other players.

The resulting use case is shown below:

![alt text](http://i.imgur.com/1GjM3oE.png "Use case")

__Domain Model__

Regarding the domain model, we picked the most relevant parts of the game and discovered the relationships between them. The result follows:

![alt text](http://i.imgur.com/llfBvoF.png "Domain Model")

__Team contribution:__

Everyone worked together to investigate on requirements and create use case diagrams and the domain model.
