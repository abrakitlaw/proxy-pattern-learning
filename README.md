# Proxy Pattern 
Proxy Pattern is a structural design pattern that lets you provide a substitute or
placeholder for another object. A proxy control access to the original object allowing you to 
perform something either before or after the request gets through to the original object.

Why we need to control access to an object?

Because we have a massive object that consumes a vast amount of system resources.
We need it from time to time, but not always.

![Image of proxy problem](https://refactoring.guru/images/patterns/diagrams/proxy/problem-2x.png)

##### Solution!
The proxy pattern suggest that you create a new proxy class with the same interface
as an original service object. Then you update your app so that it passes the proxy object to all 
of the original object's clients. Upon receiving a request from a client, the proxy creates a real
service object and delegates all the work to it.

![Image of proxy problem](https://refactoring.guru/images/patterns/diagrams/proxy/solution-2x.png)

#### Structure
1. The Service Presenter declares the interface of the Service. The Proxy must follow this interface 
to be able to disguise itself as a service object.
2. The Service is a class that provides some useful business logic.
3. The Proxy class has a preference field that points to a service object.
4. The Client should work with both services and proxies via the same interface. This way you can pass a proxy into
any code that expects a service object.
![Image of proxy problem](https://refactoring.guru/images/patterns/diagrams/proxy/structure-2x.png)