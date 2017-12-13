## Tactics

### [Introduction](#)
- Architectural patterns solve specific problems, but have **weaknesses** with respect to other qualities
   - e.g. Broker may be a performance bottleneck and single point of failure
- Tactics can be used to **augment** patterns to alleviate the concerns
   - e.g. Increase resources and maintain multiple copies for broker
- Each tactic introduces new concerns, but eventually the **side effects** will become negligible

### [1. Ping/Echo](#)
- To detect **faults**
- **Side effects**
   - **Security**: How to prevent a ping flood attack?
   - **Performance**: How to ensure that performance overhead of ping/echo is small?
   - **Modifiability**: How to add ping/echo to existing architecture?

### [2. Increase available resources](#)
- To address **performance** side effect
- **Side effects**
   - **Cost**: How much will the incresed resources cost?
   - **Performance**: How to utilise the incresed resources efficiently?

### [3. Scheduling policy](#)
- To address **resources** side effect
- **Side effects**
   - **Modifiability**: How to add scheduling policy to existing architecture?
   - **Modifiability**: How to change sheduling policy in the future?

### [4. Use an intermediary](#)
- To address **scheduler** side effect
- **Side effect**
   - **Modifiability**: How to ensure all communication passes through intermediary?

### [5. Restrict communication paths](#)
- To address **intermediary** side effect
- **Side effect**
   - **Performance**: How to ensure performance overhead of intermediary is not excessive?