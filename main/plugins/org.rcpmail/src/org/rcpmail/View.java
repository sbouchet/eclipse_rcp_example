/*******************************************************************************
 * Copyright (c) 2008 Ketan Padegaonkar and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ketan Padegaonkar - initial API and implementation
 *******************************************************************************/
package org.rcpmail;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class View extends ViewPart {

    public static final String ID = "org.rcpmail.view"; //$NON-NLS-1$

    @Override
    public void createPartControl(Composite parent) {
        Composite top = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.marginHeight = 0;
        layout.marginWidth = 0;
        top.setLayout(layout);
        // top banner
        Composite banner = new Composite(top, SWT.NONE);
        banner.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL, GridData.VERTICAL_ALIGN_BEGINNING, true, false));
        layout = new GridLayout();
        layout.marginHeight = 5;
        layout.marginWidth = 10;
        layout.numColumns = 2;
        banner.setLayout(layout);

        // setup bold font
        Font boldFont = JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT);

        Label l = new Label(banner, SWT.WRAP);
        l.setText(Messages.View_Subject);
        l.setFont(boldFont);
        l = new Label(banner, SWT.WRAP);
        l.setText(Messages.View_Subject_Text);

        l = new Label(banner, SWT.WRAP);
        l.setText(Messages.View_From);
        l.setFont(boldFont);

        final Link link = new Link(banner, SWT.NONE);
        link.setText(Messages.View_From_text);
        link.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                MessageDialog.openInformation(getSite().getShell(), Messages.View_AddressBook_Dialog_Title,
                        Messages.View_AdressBook_Dialog_Text);
            }
        });

        l = new Label(banner, SWT.WRAP);
        l.setText(Messages.View_Date);
        l.setFont(boldFont);
        l = new Label(banner, SWT.WRAP);
        l.setText(Messages.View_Date_Text);
        // message contents
        Text text = new Text(top, SWT.MULTI | SWT.WRAP);
        text.setText(Messages.View_Message_Body);
        text.setLayoutData(new GridData(GridData.FILL_BOTH));
    }

    @Override
    public void setFocus() {
    }
}
