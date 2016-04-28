package de.swirtz.dropwizard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.escape;


/**
 * @author: Simon
 * created on 28.04.2016.
 */
@Path("wizards")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class WizardResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(WizardResource.class);

    private final WizardStore store;

    public WizardResource(WizardStore store) {
        this.store = store;
    }

    @POST
    public Response addWizard(final Wizard wizard) throws URISyntaxException {
        LOGGER.info("add {}", wizard);
        store.store(wizard);
        return Response.created(new URI("/wizards/" + escape(wizard.getName()))).build();
    }

    @GET @Path("{name}")
    public Wizard getWizard(@PathParam("name") String name){
        LOGGER.info("getWizard {}", name);
        return store.get(name);
    }
}
