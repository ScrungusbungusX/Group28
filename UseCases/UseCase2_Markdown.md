SEM Group 28: Use Case \#2

| **USE CASE \#2**               | Generate People in vs Out of City Report                                                                                                                                                                      |                                                                                                                                                            
|--------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Goal in Context**            | User selects the ‘scope’ of the report to generate, then this program creates a structured report showing the name of people living in cities and the number of people living outside of them for that scope. |                                                                                                                                                            
| **Scope & Level**              | Program, Primary task                                                                                                                                                                                         |                                                                                                                                                            
| **Preconditions**              | User has a working computer, the program and its sup-components downloaded.                                                                                                                                   |                                                                                                                                                            
| **Success End Condition**      | A report showing the data stored in the program’s database, organised for the ‘scope’ chosen by the user is generated and displayed on-screen to the user.                                                    |                                                                                                                                                            
| **Failed End Condition**       | The program goes not generate a report, the program generates an erroneous or incomplete report, the program does not display anything to the user.                                                           |                                                                                                                                                            
| **Primary, Secondary Actors**  | User, any human or computer that directly interacts with the program. The program, the application used to generate reports.                                                                                  |                                                                                                                                                            
| **Trigger**                    | User runs application.                                                                                                                                                                                        |                                                                                                                                                            
| **DESCRIPTION**                | **Action**                                                                                                                                                 |
| **Step No.1**                  | User starts up the program.                                                                                                                                |
| **Step No.2**                  | The program displays to user the list of possible scopes for the report.                                                                                   |
| **Step No.3**                  | The user chooses one of the options.                                                                                                                       |
| **Step No.4**                  | The program retrieves data from its database.                                                                                                              |
| **Step No.5**                  | The program organises the data into two columns; one for population in cities and one for population outside of cities, over the scope chosen by the user. |
| **Step No.6**                  | The program displays the list to the screen in a suitable report format.                                                                                   |
| **EXTENSIONS**                 | **Branching Action**                                                                                                                                       |
| **5a**                         | The program flags that there is no data and instead displays a message saying that no data was found to the screen.                                        |
| **SUB-VARIATIONS**             | **Branching Action**                                                                                                                                       |
| **1**                          | The ‘scope’ options for the ‘type’ Countries given to the user are:  Continent.  Region.  Country.                                                         |

| **RELATED**  **INFORMATION**                     | Generate People in vs Out of City Report        |
|--------------------------------------------------|-------------------------------------------------|
| **Priority:**                                    | Top.                                            |
| **Performance**                                  | 1-2 Minutes.                                    |
| **Frequency**                                    | Every five-ten minutes.                         |
| **Channels to actors**                           | Database integrated into the program. Computer. |
| **OPEN ISSUES**                                  | None.                                           |
| **Due Date**                                     | Code Review 3 (14/11/2024)                      |
| **...any other**  **management information...**  | None.                                           |
| **Superordinates**                               | None.                                           |
| **Subordinates**                                 | None.                                           |
