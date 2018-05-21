package org.rcpmail;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

    private static final String BUNDLE_NAME = "org.rcpmail.messages"; //$NON-NLS-1$

    public static String ApplicationActionBarAdvisor_File;

    public static String ApplicationActionBarAdvisor_Help;

    public static String ApplicationActionBarAdvisor_Open_Another_Message;

    public static String ApplicationActionBarAdvisor_Open_Message;

    public static String MessagePopupAction_Message;

    public static String MessagePopupAction_Titile;

    public static String NavigationView_another_account;

    public static String NavigationView_Drafts;

    public static String NavigationView_Inbox;

    public static String NavigationView_personnal_account;

    public static String NavigationView_Sent;

    public static String OpenViewAction_Message;

    public static String OpenViewAction_Title;

    public static String View_AddressBook_Dialog_Title;

    public static String View_AdressBook_Dialog_Text;

    public static String View_Date;

    public static String View_Date_Text;

    public static String View_From;

    public static String View_From_text;

    public static String View_Message_Body;

    public static String View_Subject;

    public static String View_Subject_Text;
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
