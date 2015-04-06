Pattern Used
------------
1. Singleton : To store grid symbol
2. Factory Pattern : To create grid tile instance
3. FlyWeight Pattern : Symbol and Tile are repititive i grid. So used only once instance of Symbol and Tile and same is used across grid elements.

4.Builder Pattern : Since grid is combination of symbol and grid tile. Used Builder pattern to create Grid instance
5. Properties file : Defined properties file for storing grid properties. But as of now i have not used in the submitted project

Testing
---------
Created a demo class to test construction of the grid

Pending
-------
Repititively searching shortest grid element is not done
