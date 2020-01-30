package controllers;

import models.RoundedSum;
import play.libs.Json;
import play.mvc.*;
import services.BridgeClient;

import javax.inject.Inject;

/**
 * MyController.myMethod is called when requesting GET /mycontroller/myroute (see routes file)
 *
 * You can try it by running curl -X GET localhost:9000/mycontroller/myroute
 *
 * The BridgeClient has been injected and ready for use. Maybe the controller, method and route need some renaming?
 */

public class AccountsController extends Controller {

    private final BridgeClient bridgeClient;

    @Inject
    public AccountsController(BridgeClient bridgeClient) {
        this.bridgeClient = bridgeClient;
    }

    public Result getRoundedSum() {
        return ok(Json.toJson(new RoundedSum(bridgeClient.getSumOfBalances())));
    }
}
