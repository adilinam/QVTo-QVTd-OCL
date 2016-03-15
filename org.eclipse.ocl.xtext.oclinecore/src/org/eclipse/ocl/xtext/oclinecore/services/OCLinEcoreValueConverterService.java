/*******************************************************************************
 * Copyright (c) 2010, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.xtext.oclinecore.services;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.xtext.base.services.BaseValueConverterService;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

public class OCLinEcoreValueConverterService extends BaseValueConverterService
{
	protected static class EnumerationLiteralNameConverter extends AbstractIDConverter
	{
		private final Set<String> enumerationLiteralKeywords;

		protected static Set<String> computeEnumerationLiteralKeywords(Grammar grammar) {
			Set<String> keywords = new HashSet<String>(GrammarUtil.getAllKeywords(grammar));
			Set<String> enumerationLiteralNames = getAllKeywords(grammar, "EnumerationLiteralName", true);
			keywords.removeAll(enumerationLiteralNames);
			return keywords;
		}

		public EnumerationLiteralNameConverter(Grammar grammar) {
			enumerationLiteralKeywords = computeEnumerationLiteralKeywords(grammar);
		}
		
		@Override
		protected String internalToString(String value) {
			if (enumerationLiteralKeywords.contains(value)) {
				return escapeIdentifier(value);
			}
			else if (!PivotUtilInternal.isValidIdentifier(value)) {
				return escapeIdentifier(value);
			}
			else {
				return value;
			}
		}
	}

	protected static class IntegerConverter extends AbstractNullSafeConverter<Integer>
	{
		@Override
		public Integer internalToValue(String string, INode node) {
			if (Strings.isEmpty(string))
				throw new ValueConverterException("Couldn't convert empty string to integer", node, null);
			try {
				return Integer.valueOf(string);
			} catch (NumberFormatException e) {
				throw new ValueConverterException("Couldn't convert '"+string+"' to integer", node, e);
			}
		}

		@Override
		public String internalToString(Integer value) {
			return value.toString();
		}
	}
	
	protected static class PrimitiveTypeIdentifierConverter extends AbstractNullSafeConverter<String>
	{
		@Override
		public String internalToValue(String string, INode node) {
			return string;
		}

		@Override
		public String internalToString(String value) {
			return value;
		}
	}
	
	protected static class UpperConverter extends AbstractNullSafeConverter<Integer>
	{	
		@Override
		public Integer internalToValue(String string, INode node) {
			if (Strings.isEmpty(string))
				throw new ValueConverterException("Couldn't convert empty string to integer", node, null);
			try {
				if ("*".equals(string)) {
					return Integer.valueOf(-1);
				}
				return Integer.valueOf(string);
			} catch (NumberFormatException e) {
				throw new ValueConverterException("Couldn't convert '"+string+"' to integer", node, e);
			}
		}
		
		@Override
		public String internalToString(Integer value) {
			return value >= 0 ? value.toString() : "*";
		}
	}

	private static EnumerationLiteralNameConverter enumerationLiteralNameConverter = null;
	private static IntegerConverter integerConverter = null;
	private static PrimitiveTypeIdentifierConverter primitiveTypeIdentifier = null;
	private static UpperConverter upperConverter = null;

	@ValueConverter(rule = "EnumerationLiteralName")
	public IValueConverter<String> EnumerationLiteralName() {
		if (enumerationLiteralNameConverter == null) {
			enumerationLiteralNameConverter = new EnumerationLiteralNameConverter(getGrammar());
		}
		return enumerationLiteralNameConverter;
	}

	@ValueConverter(rule = "LOWER")
	public IValueConverter<Integer> LOWER() {
		if (integerConverter == null) {
			integerConverter = new IntegerConverter();
		}
		return integerConverter;
	}

	@ValueConverter(rule = "PrimitiveTypeIdentifier")
	public IValueConverter<String> PrimitiveTypeIdentifier() {
		if (primitiveTypeIdentifier == null) {
			primitiveTypeIdentifier = new PrimitiveTypeIdentifierConverter();
		}
		return primitiveTypeIdentifier;
	}
	
	@ValueConverter(rule = "UPPER")
	public IValueConverter<Integer> UPPER() {
		if (upperConverter == null) {
			upperConverter = new UpperConverter();
		}
		return upperConverter;
	}
}
