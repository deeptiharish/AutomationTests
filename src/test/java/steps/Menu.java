package steps;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    public static final Map<String, String> MENU_ITEM_MAP = new HashMap<String, String>();
    private static final String TOP_LEVEL_MENU_CLASS = "menuItem";
    private static final String SECOND_LEVEL_MENU_CLASS = "subNavContainer";

    public static final String SALES = "Sales";
    public static final String SALES_PROSPECTS = "Sales Prospects";

    static {
        MENU_ITEM_MAP.put("Sales", "mobile_management_mobile_management_dynamic_data_forms");
        MENU_ITEM_MAP.put("Audit Event Viewer", "admin_admin_audit_events");

    }
}
