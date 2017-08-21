package controllers;

import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class ItemController extends Controller {

	public Result item() {
        return ok(views.html.form.item.render());
    }
}