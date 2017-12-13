## Architecturally Significant Requirements (ASRs)

### [Introduction](#)
- Architectures exist to build systems that **satisfy requirements**
- All requirements are **not created equal**
- **ASR** is a requirement that will have a profound effect on the architecture
- ASRs can be **gathered** from
   1. [**Requirements documents**](#)
   2. [**Interviewing stakeholders**](#)
   3. [**Understanding business goals**](#)
   4. [**Utility tree**](#)

### [Quality Attribute Workshop (QAW)](#)
- A facilitated, **stakeholder-focused** method to **generate, prioritise and refine** quality attribute scenarios before the software architecture is completed
- Focused on system-level **concerns** and **role** of software in the system
- **Steps**
   1. [**Presentation and introductions**](#)
      - QAW facilitators describe **motivation** for QAW 
      - They explain each **step** of the method
   2. [**Business / Mission presentation**](#)
      - **Stakeholder** representing business concerns presents 
         1. System's business context
         2. Broad functional requirements 
         3. Constraints
         4. Known quality attribute requirements
   3. [**Architectural plan presentation**](#)
      - Architect presents system **architectural plans**
   4. [**Identification of architectural drivers**](#)
      - Facilitators share list of key **architectural drivers** assembled during Steps 2 and 3
      - They clarify and confirm with stakeholders to reach a **consensus**
   5. [**Scenario brainstorming**](#)
      - Stakeholder expresses **scenarios** representing their respective concerns with respect to the system
      - **Facilitator** ensures that 
         - Each scenario has an explicit stimulus and response
         - At least one representative scenario exists for each architectural driver listed in Step 4
   6. [**Scenario consolidation**](#)
      - **Similar scenarios** are consolidated to prevent votes from being spread across several scenarios expressing the same concern
   7. [**Scenario prioritisation**](#)
      - Allocate each stakeholder a number of **votes** to prioritise scenarios
   8. [**Scenario refinement**](#)
      - Refine and elaborate **top scenarios**
