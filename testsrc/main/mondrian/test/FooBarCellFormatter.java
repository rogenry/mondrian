/*
// This software is subject to the terms of the Common Public License
// Agreement, available at the following URL:
// http://www.opensource.org/licenses/cpl.html.
// Copyright (C) 2007-2007 Julian Hyde
// All Rights Reserved.
// You must accept the terms of that agreement to use this software.
*/
package mondrian.test;

import mondrian.olap.CellFormatter;

/**
 * Cell formatter for test purposes. Returns value of the cell prefixed
 * with "foo" and suffixed with "bar".
 *
 * @author jhyde
 * @since 5 October, 2002
 * @version $Id$
 */
public class FooBarCellFormatter implements CellFormatter {

    public String formatCell(Object value) {
        return "foo" + value + "bar";
    }
}

// End FooBarCellFormatter.java