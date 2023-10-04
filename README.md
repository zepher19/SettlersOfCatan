Hello there!

I'm currently looking for a coding job, so I decided to create a Settlers of Catan android app to showcase my skils. 

Here's some pictures: (from left to right, icon on the homescreen, splash screen, empty game board, game in progress)

![catan1](https://github.com/zepher19/SettlersOfCatan/assets/108103331/6e412255-1f76-489b-9e1c-cb185119adfc) ![catan2](https://github.com/zepher19/SettlersOfCatan/assets/108103331/a29abe04-51ef-421a-a39c-cd0b7dddee5a) ![catan3](https://github.com/zepher19/SettlersOfCatan/assets/108103331/6804eb23-58e2-4a2d-aa1b-27781d0d0c62) ![catan4](https://github.com/zepher19/SettlersOfCatan/assets/108103331/77d82c51-8c32-4968-b57b-b7677a48e45c)

And here is the video link if you'd like to see the game in action: https://www.youtube.com/watch?v=JTZmHFVwSCA&ab_channel=Zepher319

Note: The app icon and splash screen art were taken from official Settlers of Catan sources. Furthermore, I do not own the rights to Settler's of Catan. This project was created purely for educational purposes. Please support the original copyright holders. '

How does the game work?
Again, as with my other board games, I used a BoardModel class to... well, model the board. In this case, the board model instantiates a number of different classes. Instances of the Tile class are used to represent the hexagonal game tiles. Each one has a roll number on it, as well as an array of Settlement objects which can be created during gameplay. When a settlement is built, the alpha of the settlement object is switched from 0 to 1 and a color is assigned depending on who did the building. When the dice are rolled, the game scans through the Tile array and finds tiles with the corresponding number. Then, it scans through the settlements located around those tiles, and if they are currently occupied, the owner of the settlment recieves a card. Each Player object possesses five Card objects, corresponding to the five possible resource cards. Each Card has an Integer amount and a View ID used to update it's count on the UI. 

And that's pretty much the central flow of gameplay. The greatest hurdle to adapting Settlers of Catan was designing the UI. There are 114 possible settlement positions and 114 possible road positions, meaning a total of 228 views that needed to be created and implemented to accept user input. It was difficult to fit every aspect of the game into such a tight space. Thanks for checking out my app!

