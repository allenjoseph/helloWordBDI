package org.example;

import jadex.bdiv3.features.IBDIAgentFeature;
import jadex.micro.annotation.Agent;
import jadex.micro.annotation.AgentBody;
import jadex.micro.annotation.AgentFeature;
import jadex.micro.annotation.Description;

// Jadex Active Components Documentation:
// https://github.com/actoron/jadex/blob/master/docs/index.md

// When you create a new component, you have to choose between different component types.
// For now, we will focus on Micro Agents, the most basic type of component.

// Micro agents are pojo (plain old java object) based Java classes with @Agent Annotation
// Optionally, it can provide a description using the @Description Annotation.
// The value is then shown inside the JCC.

// While implementing your component,
// keep in mind that components in Jadex are always Single-Threaded!

@Agent
@Description("My First Agent BDI")
public class AgentBDI {
    // All component functionalities are available via features.
    // By default, all components have a certain set of features,
    // which can be injected into fields by using an @AgentFeature Annotation
    // Each Jadex Active Component has a Parameter Guesser that is used for annotation-based injections,
    // e.g. when using @ServiceComponent inside Services or @AgentFeature inside Components.
    @AgentFeature
    protected IBDIAgentFeature bdiAgentFeature;
    // IBDIAgentFeature: Contains the API relevant for BDI Agent programming
    // (handling of goals, plans and belief listeners).

    // In order for you Agent to do something once it is started,
    // you can provide an Agent Body method.
    // This is an arbitrary named public method without parameters annotated with @AgentBody:
    // A method marked with this annotation will be called after creation of the agent is complete.
    @AgentBody
    public void body() {
        // At this point, all fields and required services are available and can be used.
        System.out.println("Welcome: " + "Allen Joseph");
    }
}
