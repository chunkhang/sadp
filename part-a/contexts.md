## Contexts

### [Types](#)

1. [**Technical Context**](#)
   - Set of **quality attributes** the architecture can help to achieve
   - The architecture's current **technical environment**
      - Standard industry practices
      - Software engineering techniques
      - e.g. Web-based, object-oriented, service-oriented and cloud-based
2. [**Project Life-Cycle Context**](#)
   - **Software development processes** include design (Part of architecture) among their obligations
      - Waterfall
      - Iterative
      - Agile
      - Model-driven development
   - **Architecture activities** are used to realise a complete design, implement and manage the evolution of a system
      1. Make business case
      2. Understand architecturally significant requirements (ASR)
      3. Create or select architecture
      4. Document and communicate architecture
      5. Analyse or evaluate architecture
      6. Implement and test system based on architecture
      7. Ensure implementation conforms to architecture
3. [**Business Context**](#)
<br /><img src="business-goals.png" alt="Business Goals" width=350px /><br />
   - Architectures and systems serve some **business purposes** that may change over time
   - Systems are created to satisfy **business goals** of one or more organisations
      - Profit 
      - Market
      - Productivity 
   - Business goals have a profound **influence** on architecture
   - Every **quality attribute** should originate from some higher purpose that can be described in terms of added **value**
      - **Question**: Why do you want this system to have a really fast response time?
      - **Answer**: This differentiates the product from its competition and lets the developing organisation capture the market share
   - Some business goals **will not** show up in the form of requirements, and have **no effect** on architecture
      - e.g. A business goal to lower costs can be realised by asking employees to work from home
4. [**Professional Context**](#)
   - Architects perform many **duties beyond** directly producing architecture
      - Support management
      - Deal with customers
   - They need **more than** just technical skills
      - Explain to stakeholders how needs and expectations are prioritised
      - Communicate ideas clearly
      - Negotiate requirements
   - They need up-to-date **knowledge**
      - Patterns
      - Database platforms
      - Web services standards
      - Business considerations

### [Influence](#)
<img src="influence-cycle.png" alt="Influence Cycle" width=400px /><br />
- Architecture is not a product of a **dictator** developer or architect
- **Requirements** influence architecture
- Architecture is a result of **contexts**
- Architecture in turn affects these contexts that subsequently **influence** future architectures 
   1. [**Technical Context**](#)
      - Architecture can affect stakeholder **requirements** for the next system
      - Customers can receive a system in a more reliable, timely and **economical** manner when it is not built from scratch
      - Customers may **relax** some requirements to gain these economies
   2. [**Project Life-Cycle Context**](#)
      - Architecture affects the **structure** of the developing organisation
      - It presribes **units** of software that form the basis for the development project's structure
      - **Teams** become embedded in the organisational structure
   3. [**Business Context**](#)
      - Architecture affects the **business goals** of the developing organisation
      - A successful system enables a company to capture **market**
      - Architecture provides opportunities for **efficient** production of deployment of similiar systems
   4. [**Professional Context**](#)
      - System building affects the architect's **experience**
      - The architect will be more inclined to build systems using **simliar approaches** if the system is successful
      - Architectures that **fail** are less likely to be chosen for future projects