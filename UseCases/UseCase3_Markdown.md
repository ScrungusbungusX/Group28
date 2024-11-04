SEM Group 28: Use Case \#3

| **USE CASE \#3**               | Language for Generated Reports                                                                                                                                                                                                                                        |                                                                                                                                       
|--------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Goal in Context**            | User selects a language from a set range and the information generated in the report is then displayed in that language.                                                                                                                                              |                                                                                                                                       
| **Scope & Level**              | Program, Subfunction.                                                                                                                                                                                                                                                 |                                                                                                                                       
| **Preconditions**              | User has a working computer, the program and its sup-components downloaded.                                                                                                                                                                                           |                                                                                                                                       
| **Success End Condition**      | A report is generated in the language chosen by the user.                                                                                                                                                                                                             |                                                                                                                                       
| **Failed End Condition**       | The program does not generate a report, the program generates an erroneous or incomplete report, the program does not display anything to the user, the report generated is in the wrong language, the report generated is in an amalgamation of different languages. |                                                                                                                                       
| **Primary, Secondary Actors**  | User, any human or computer that directly interacts with the program. The program, the application used to generate reports.                                                                                                                                          |                                                                                                                                       
| **Trigger**                    | User runs application.                                                                                                                                                                                                                                                |                                                                                                                                       
| **DESCRIPTION**                | **Action**                                                                                                                            |
| **Step No.1**                  | User starts up the program.                                                                                                           |
| **Step No.2**                  | The program displays to the user a list of possible languages for the report.                                                         |
| **Step No.3**                  | The user chooses one of the options.                                                                                                  |
| **Step No.4**                  | The program retrieves data from its database, selecting the datasets based on the language chosen.                                    |
| **Step No.5**                  | The program organises the data into a report format generated in the language chosen by the user.                                     |
| **Step No.6**                  | The program displays the list to the screen in a suitable report format.                                                              |
| **EXTENSIONS**                 | **Branching Action**                                                                                                                  |
| **5a**                         | The program flags that there is no data for that language and instead displays a message saying that no data was found to the screen. |
| **SUB-VARIATIONS**             | **Branching Action**                                                                                                                  |
| **1**                          | The language options given to the user are:  English,  Spanish,  Chinese,  Hindi,  Arabic                                             |

| **RELATED**  **INFORMATION**                     | Language for Generated Reports                  |
|--------------------------------------------------|-------------------------------------------------|
| **Priority:**                                    | Medium                                          |
| **Performance**                                  | 1-2 Minutes.                                    |
| **Frequency**                                    | Every five-ten minutes.                         |
| **Channels to actors**                           | Database integrated into the program. Computer. |
| **OPEN ISSUES**                                  | None.                                           |
| **Due Date**                                     | Code Review 3 (14/11/2024)                      |
| **...any other**  **management information...**  | None.                                           |
| **Superordinates**                               | Use Case \#1.                                   |
| **Subordinates**                                 | None.                                           |