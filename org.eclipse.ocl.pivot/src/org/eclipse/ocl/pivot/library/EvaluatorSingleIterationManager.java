/*******************************************************************************
 * Copyright (c) 2011, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.library;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.CallExp;
import org.eclipse.ocl.pivot.OCLExpression;
import org.eclipse.ocl.pivot.TypedElement;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.evaluation.IterationManager;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.CollectionValue;

public class EvaluatorSingleIterationManager extends AbstractEvaluatorIterationManager
{
	class Nested extends EvaluatorSingleIterationManager
	{
		protected final @NonNull EvaluatorSingleIterationManager rootIterationManager;
		protected final int depth;

		protected Nested(@NonNull EvaluatorSingleIterationManager iterationManager, @NonNull CollectionValue value) {
			super(iterationManager, value);
			this.rootIterationManager = iterationManager.getRootIterationManager();
			this.depth = iterationManager.getDepth() + 1;
		}

		@Override
		public int getDepth() {
			return depth;
		}
		
		@Override
		public @NonNull EvaluatorSingleIterationManager getRootIterationManager() {
			return rootIterationManager;
		}

		@Override
		public @NonNull CollectionValue getSourceCollection() {
			return rootIterationManager.getSourceCollection();
		}
	}

	protected final @NonNull TypedElement referredIterator;
	protected final @NonNull ValueIterator iterator;

	/** @deprecated supply a callExp */
	@Deprecated
	public EvaluatorSingleIterationManager(@NonNull Evaluator invokingEvaluator,
			@NonNull OCLExpression body, @NonNull CollectionValue collectionValue,
			@Nullable TypedElement accumulator, @Nullable Object accumulatorValue,
			@NonNull TypedElement referredIterator) {
		this(ValueUtil.getExecutor(invokingEvaluator), null, body, collectionValue, accumulator, accumulatorValue, referredIterator);
	}

	/**
	 * @since 1.1
	 */
	public EvaluatorSingleIterationManager(@NonNull Executor invokingExecutor,
			/*@NonNull*/ CallExp callExp, @NonNull OCLExpression body, @NonNull CollectionValue collectionValue,
			@Nullable TypedElement accumulator, @Nullable Object accumulatorValue,
			@NonNull TypedElement referredIterator) {
		super(invokingExecutor, callExp, body, collectionValue, accumulator, accumulatorValue);
		this.referredIterator = referredIterator;
		this.iterator = new ValueIterator(executor, collectionValue, referredIterator);
	}

	protected EvaluatorSingleIterationManager(@NonNull EvaluatorSingleIterationManager iterationManager, @NonNull CollectionValue value) {
		super(iterationManager, value);
		this.referredIterator = iterationManager.referredIterator;
		this.iterator = new ValueIterator(executor, collectionValue, referredIterator);
	}

	@Override
	public boolean advanceIterators() {
		iterator.next();
		return hasCurrent();
	}

	@Override
	public @NonNull IterationManager createNestedIterationManager(@NonNull CollectionValue value) {
		return new Nested(this, value);
	}

	@Override
	public @Nullable Object get() {
		return iterator.get();
	}

	public int getDepth() {
		return 0;
	}
	
	public @NonNull EvaluatorSingleIterationManager getRootIterationManager() {
		return this;
	}

	@Override
	public boolean hasCurrent() {
		return iterator.hasCurrent();
	}
}