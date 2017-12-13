## Publish-Subscribe

<img src="publish-subscribe.png" alt="Publish-Subscribe" width=500px />

### [Context](#)
- A number of independent **producers and consumers** of data that must interact
- Precise **number and nature** of produces and consumers are not predetermined or fixed
- **Data shared** is not predetermined or fixed

### [Problem](#)
- How can integration mechanisms be created to support **transmitting messages** among the produces and consumers so that they are **unaware** of each other's identity and potentially existence?

### [Solution](#)
- Components interact by publishing and subsribing to **events**
- **Publisher** components place events on the bus by announcing them
- **Connector** delivers those events to **subscriber** components that have registered interest in those events

### [Elements](#)
1. **C&C component**
   - With at least one **publish or subscribe** port
2. **Publish-subscribe connector**
   - **Announce and listen** roles for components that wish to publish and subscribe to events

### [Relations](#)
- **Attachment** relation associates components with publish-subsribe connector
- It **prescribes** which components announce events and which components are registered to receive events

### [Contraints](#)
- All components are connected to an **event distributor** that can viewed as a bus (Connector)
- **Publish ports** are attached to **announce** roles
- **Subscribe ports** are attached to **listen** roles

### [Weaknesses](#)
- Increases latency
- Reduces scalability
- Reduces predictability of message delivery time
- Reduces contol over message ordering
- Does not guarantee message delivery