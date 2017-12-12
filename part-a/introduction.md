## Introduction

### [Structure](#)
- A set of elements held together by a **relation** (How the elements relate to one another)
- Structures are **designed**

### [View](#)
- A **representation** of one or more structures
- Views are **documented**

### [Architecture](#)
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
