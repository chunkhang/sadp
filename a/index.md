## [Basics](#)

### Structure
- A set of elements held together by a **relation** (How the elements relate to one another)
- Structures are **designed**

### View 
- A **representation** of one or more structures
- Views are **documented**

### Architecture
1. **A set of software structures**
   - **System** is composed of many structures
   - Architecture supports **reasoning** about the system and the system's **properties**
   - **Reasoning** is an attribute of the system important to stakeholders
      - Functionality
      - Fault tolerance
      - Responsiveness
2. **An abstraction**
   - Architecture allows the system to be **examined** in terms of
      - The elements
      - How they are arranged
      - How they interact
      - How they are composed
      - Their properties that support system reasoning
   - Architecture **omits** certain details
      - Not useful for reasoning about system
      - No ramifications outside of a single element
      - Private details (Internal implementation)
   - Abstraction tames the **complexity** of an architecture
3. **Includes behaviour**
   - **Behaviour** is how elements interact with each other
   - It can be used to **reason** about the system
   - Architecture only **considers** an elemtent's behaviour if it influences
      - Another element
      - The acceptability of the system as a whole

## [Categories of Structures](#)

### Module Structures
- System is structured as **a set of code or data units** that need to be constructed or procured
- Elements are **modules** or implementation units
   - Classes
   - Layers
   - Divisions of functionality
- Modules are assigned areas of **functional responsibility**
- There is **less emphasis** on how the software manifests at runtime
- **Answer** questions like
   - What is the primary functional responsibility assigned to each module?
   - What modules are related to other modules (e.g. Inheritance)?
- **Examples**
   1. **Decomposition structure**
      - Units are modules related by **is-a-submodule-of** relation
      - Modules are **decomposed** into smaller modules recursively until they are small enough to be easily understood
      - Determines the system's **modifiability** by assuring that likely changes are localised 
      - Basis for development project's **organisation**
   2. **Uses structure**
      - Units are modules related by **uses** relation
      - The correctness of a unit **requires** the presence of a correctly-functioning version of another unit
      - Used to engineer **extendable systems**
      - Basis for **incremental development** by creating system subsets
   3. **Layer structure**
      - Units are **layers** that provide a set of services through a managed interface
      - Layers use other layers in a **strictly-managed** fashion
      - Basis for **portability**
   4. **Class structure** (Generalisation)
      - Units are **classes** related by is-an-instance-of relation 
      - Used to reason about **collections** of simliar behaviour or capability
      - Basis for **reuse** and **incremental addition** of functionality
   5. **Data model**
      - Describe the static information structure in terms of **data entities** and their relationships
      - e.g. A banking system has Account, Customer and Loan, where Account has attributes such as account number, type, and balance

### Component-And-Connector Structures (C&C)
- System is structured as a set of elements with runtime **behaviour** (Components) and **interactions** (Connectors)
- Elements are runtime **components**
   - Services
   - Peers
   - Clients
   - Servers
   - Filters
- **Connectors** are communication vehicles among components
   - Call-return
   - Pipes
- Help examine **runtime** properties 
   - Performance
   - Security
   - Availability
- **Answer** questions like
   - What are the major executing components and how do they interact at runtime?
   - How does data progress through the system?
- **Examples**
   1. **Service structure**
      - Units are **services** that interoperate by service coordination mechanisms
      - Used to engineer a system of components developed **anonymously and independently** of each other
   2. **Concurrency structure**
      - Units are **components** arranged into logical threads
      - Used to determine opportunities for **parallelism** and locations where **resource contention** may occur

### Allocation Structures
- Relationship between software elements and elements in one or more external **environments** in which the software is created and executed
- Describe the **mapping** from structures to the system's environment
   - Organisational
   - Development
   - Installation
   - Execution
- **Answer** questions like
   - What processor does each software element execute on?
   - In what directories or files is each element stored during development, testing and system building?
- **Examples**
   1. **Deployment structure**
      - Shows how software is assigned to **hardware** processing and **communication** elements
      - Relations are **allocated-to** (Physical units where software elements reside) and **migrate-to** (If allocation is dynamic)
      - Used to **reason** about performance, data, integrity, security and availability
      - Basis for **distributed and parallel systems**
   2. **Implementation structure**
      - Shows how software elements are mapped to the **file structures** in system's development, integration or configuration control environments
      - Basis for management of **development** activities and **build** processes
   3. **Work assignment structure**
      - Assigns **responsibility** for implementing and integrating the modules to teams
      - Basis for clarifying **who does the work**
      - Determine major **communication pathways** among teams

## [Importance of Software Architecture](#)

