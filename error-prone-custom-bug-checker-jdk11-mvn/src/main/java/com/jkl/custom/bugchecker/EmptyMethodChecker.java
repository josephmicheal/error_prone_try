package com.jkl.custom.bugchecker;

import com.google.auto.service.AutoService;
import com.google.errorprone.BugPattern;
import com.google.errorprone.VisitorState;
import com.google.errorprone.bugpatterns.BugChecker;
import com.google.errorprone.fixes.SuggestedFix;
import com.google.errorprone.matchers.Description;
import com.sun.source.tree.MethodTree;


@AutoService(BugChecker.class)
@BugPattern(name="EmptyMethod", summary="There should be no empty methods", severity = BugPattern.SeverityLevel.ERROR)
public class EmptyMethodChecker extends BugChecker implements BugChecker.MethodTreeMatcher{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Description matchMethod(MethodTree methodTree, VisitorState state) {
		if(methodTree.getBody().getStatements().isEmpty()) {
			return describeMatch(methodTree, SuggestedFix.delete(methodTree));
		}
		return Description.NO_MATCH;
	}

}
