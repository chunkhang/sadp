## Importance

### [1. Inhibit or enable quality attributes](#)
- Architecture determines whether a system can exhibit the desired **quality attributes**
   1. Performance
   2. Modifiability
   3. Security
   4. Scalability
   5. Incremental subset delivery
   6. Reusability

### [2. Reason about and manage change](#)
- Software **maintenance** includes
   - Accommodating new features
   - Adapting to new environments
   - Fixing bugs
- Possible **changes**
   1. [**Local change**](#): Requires modifying a single element
   2. [**Nonlocal change**](#): Requires modifiying multiple elements but leaves the underlying architecture intact
   3. [**Architectural change**](#): Affects the fundamental interaction between elements 

### [3. Predict system qualities](#)
- Certain architectural decisions lead to certain **quality attributes**
- They can be **predicted** to exibit the associated qualities

### [4. Enhance communication among stakeholders](#)
- Architecture is a common **abstraction** of system used to create mutual understanding, negotiation, consensus and communication between **stakeholders**
- Each stakeholder is **concerned** with different characteristics of the system
   - e.g. The user is concerned with speed and reliability, while the customer is concerned about schedule and budget
- It provides a common **language** to address different concerns even understandable by **nontechnical** people

### [5. Earliest design decisions](#)
- Architecture is a manifestation of the earliest **design decisions** about a system
- Each design **constraints** the many decisions that follow
   - Will the system run on one processor or be distributed across multiple processors?
   - Will the software be layered?
   - Will componenets communicate synchronously or asynchronously?

### [6. Define constraints on implementation](#)
- An **implementation** exhibits an architecture when it **conforms** to the design decisions **prescribed** by the architecture
   - Elements
   - Interaction
   - Responsbilities
- Element builders may not be aware of the architectural **tradeoffs**
   - e.g. The architect assigns performance budget to the units, but implementers of each unit only knows their own budget

### [7. Influence organisational structure](#)
- Architecture is typically used as the basis for the **work-breakdown** structure
   - Units of planning, scheduling and budget
   - Interteam communication channels
   - Configuration control and file-system organisation
   - Integration and test plans and procedures
- **Teams** are formed to maintain specific elements

### [8. Enable evolutionary prototyping](#)
- Architecture can be analysed and prototyped as a **skeletal system** (Infrastructure) after it is defined
- System is executable **early** in the product's life cycle
- Potential **performance problems** can be identified early with each replacement of prototype
- Overall project **risk** is reduced

### [9. Improve cost and schedule estimates](#)
- Architect helps the project manager create **cost and schedule estimates** early in the project life cycle
- **Top-down** (By architect and project manager) estimates help set goals and apportion budgets
- **Bottom-down** (By developers) are more accurate

### [10. Transferable and reusable model](#)
- **Reuse of architecture** provides tremendous leverage for systems with similiar requirements
   - Code
   - Requirements
   - Experience
   - Infrastructure
   - Decisions
- A software **product line or family** is a set of systems built using the same set of reusable assets

### [11. Use independently developed components](#)
- **Components** are likely to have been developed **separately and independently** from each other
   - Decreased time to market
   - Increased reliability
   - Lower cost
   - Flexibility
- Architecture defines how the elements can be **incorporated** into the system

### [12. Restrict design vocabulary](#)
- Architectural patterns see benefits in **voluntarily restricting** to a small number of choices of elements and interactions
   - Minimised complexity
   - Enhanced reusablilty 
   - Easy communication
   - Greater interoperability
- Restricting the **vocabulary** of design focuses the architect on desired quality attributes

### [13. Basis for training](#)
- Architecture can serve as first **introduction** to the system for new project members
   - e.g. Module views can show someone the project structure, how the teams are assigned to different parts of the system
   - e.g. Component-and-connector views can explain how the system is expected to work and accomplish its job
