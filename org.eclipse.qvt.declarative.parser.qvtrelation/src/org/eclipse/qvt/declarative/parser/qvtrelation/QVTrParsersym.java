/**
* Essential OCL Grammar
* <copyright>
*
* Copyright (c) 2005, 2010 IBM Corporation and others.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   IBM - Initial API and implementation
*   E.D.Willink - Elimination of some shift-reduce conflicts
*   E.D.Willink - Remove unnecessary warning suppression
*   E.D.Willink - Bugs 184048, 225493, 243976, 259818, 282882, 287993, 288040, 292112, 295166
*   Borland - Bug 242880
*   Adolfo Sanchez-Barbudo Herrera (Open Canarias):
*        - 242153: LPG v 2.0.17 adoption.
*        - 299396: Introducing new LPG templates
*        - 300534: Removing the use of deprecated macros.
* </copyright>
*
* $Id: QVTrParsersym.java,v 1.17 2010/07/10 09:34:46 ewillink Exp $
*/

package org.eclipse.qvt.declarative.parser.qvtrelation;

public interface QVTrParsersym {
    public final static int
      TK_PLUS_PLUS = 75,
      TK_QUOTED_IDENTIFIER = 2,
      TK_INTEGER_LITERAL = 30,
      TK_REAL_LITERAL = 31,
      TK_STRING_LITERAL = 13,
      TK_PLUS = 38,
      TK_MINUS = 6,
      TK_MULTIPLY = 7,
      TK_DIVIDE = 41,
      TK_GREATER = 46,
      TK_LESS = 47,
      TK_EQUAL = 39,
      TK_GREATER_EQUAL = 48,
      TK_LESS_EQUAL = 49,
      TK_NOT_EQUAL = 65,
      TK_LPAREN = 3,
      TK_RPAREN = 8,
      TK_LBRACE = 12,
      TK_RBRACE = 10,
      TK_LBRACKET = 69,
      TK_RBRACKET = 73,
      TK_ARROW = 44,
      TK_BAR = 66,
      TK_COMMA = 11,
      TK_COLON = 5,
      TK_COLONCOLON = 28,
      TK_SEMICOLON = 42,
      TK_DOT = 43,
      TK_DOTDOT = 76,
      TK_self = 9,
      TK_if = 32,
      TK_then = 77,
      TK_else = 78,
      TK_endif = 74,
      TK_and = 67,
      TK_or = 68,
      TK_xor = 70,
      TK_not = 33,
      TK_implies = 71,
      TK_let = 40,
      TK_in = 79,
      TK_true = 34,
      TK_false = 35,
      TK_null = 36,
      TK_invalid = 37,
      TK_Set = 14,
      TK_Bag = 15,
      TK_Sequence = 16,
      TK_Collection = 17,
      TK_OrderedSet = 18,
      TK_String = 19,
      TK_Integer = 20,
      TK_UnlimitedNatural = 21,
      TK_Real = 22,
      TK_Boolean = 23,
      TK_Tuple = 24,
      TK_OclAny = 25,
      TK_OclVoid = 26,
      TK_OclInvalid = 27,
      TK_checkonly = 52,
      TK_default_values = 50,
      TK_domain = 29,
      TK_enforce = 53,
      TK_extends = 54,
      TK_implementedby = 55,
      TK_import = 56,
      TK_key = 57,
      TK_overrides = 58,
      TK_primitive = 59,
      TK_query = 60,
      TK_relation = 51,
      TK_replace = 61,
      TK_top = 62,
      TK_transformation = 45,
      TK_when = 63,
      TK_where = 64,
      TK_EOF_TOKEN = 72,
      TK_IDENTIFIER = 4,
      TK_SINGLE_LINE_COMMENT = 80,
      TK_MULTI_LINE_COMMENT = 81,
      TK_ERROR_TOKEN = 1;

    public final static String orderedTerminalSymbols[] = {
                 "",
                 "ERROR_TOKEN",
                 "QUOTED_IDENTIFIER",
                 "LPAREN",
                 "IDENTIFIER",
                 "COLON",
                 "MINUS",
                 "MULTIPLY",
                 "RPAREN",
                 "self",
                 "RBRACE",
                 "COMMA",
                 "LBRACE",
                 "STRING_LITERAL",
                 "Set",
                 "Bag",
                 "Sequence",
                 "Collection",
                 "OrderedSet",
                 "String",
                 "Integer",
                 "UnlimitedNatural",
                 "Real",
                 "Boolean",
                 "Tuple",
                 "OclAny",
                 "OclVoid",
                 "OclInvalid",
                 "COLONCOLON",
                 "domain",
                 "INTEGER_LITERAL",
                 "REAL_LITERAL",
                 "if",
                 "not",
                 "true",
                 "false",
                 "null",
                 "invalid",
                 "PLUS",
                 "EQUAL",
                 "let",
                 "DIVIDE",
                 "SEMICOLON",
                 "DOT",
                 "ARROW",
                 "transformation",
                 "GREATER",
                 "LESS",
                 "GREATER_EQUAL",
                 "LESS_EQUAL",
                 "default_values",
                 "relation",
                 "checkonly",
                 "enforce",
                 "extends",
                 "implementedby",
                 "import",
                 "key",
                 "overrides",
                 "primitive",
                 "query",
                 "replace",
                 "top",
                 "when",
                 "where",
                 "NOT_EQUAL",
                 "BAR",
                 "and",
                 "or",
                 "LBRACKET",
                 "xor",
                 "implies",
                 "EOF_TOKEN",
                 "RBRACKET",
                 "endif",
                 "PLUS_PLUS",
                 "DOTDOT",
                 "then",
                 "else",
                 "in",
                 "SINGLE_LINE_COMMENT",
                 "MULTI_LINE_COMMENT"
             };

    public final static int numTokenKinds = orderedTerminalSymbols.length;
    public final static boolean isValidForParser = true;
}
