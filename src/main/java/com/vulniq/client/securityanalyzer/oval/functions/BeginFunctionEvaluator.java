
/*
 *     VulnIQ Security Scanner, Terzi
 *     Copyright (C) 2021  SBOSoft A.S. and its affiliates
 *     Contact : info@vulniq.com www.vulniq.com
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.vulniq.client.securityanalyzer.oval.functions;

import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import com.vulniq.client.securityanalyzer.oval.error.UnexpectedOVALEvaluationError;
import org.mitre.oval.xmlschema.oval_common_5.SimpleDatatypeEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.*;

import java.util.ArrayList;
import java.util.List;

public class BeginFunctionEvaluator extends FunctionEvaluatorBase
{
    private final BeginFunctionType functionType;
    
    public BeginFunctionEvaluator(BeginFunctionType functionType, OVALInterpreter interpreter)
    {
        super(interpreter);
        this.functionType = functionType;
    }
    
    @Override
    public List<Object> getComponents()
    {
        ArithmeticFunctionType arithmetic = functionType.getArithmetic();
        BeginFunctionType begin = functionType.getBegin();
        ConcatFunctionType concat = functionType.getConcat();
        CountFunctionType count = functionType.getCount();
        EndFunctionType end = functionType.getEnd();
        EscapeRegexFunctionType escapeRegex = functionType.getEscapeRegex();
        GlobToRegexFunctionType globToRegex = functionType.getGlobToRegex();
        LiteralComponentType literalComponent = functionType.getLiteralComponent();
        ObjectComponentType objectComponent = functionType.getObjectComponent();
        RegexCaptureFunctionType regexCapture = functionType.getRegexCapture();
        SplitFunctionType split = functionType.getSplit();
        SubstringFunctionType substring = functionType.getSubstring();
        TimeDifferenceFunctionType timeDifference = functionType.getTimeDifference();
        UniqueFunctionType unique = functionType.getUnique();
        VariableComponentType variableComponent = functionType.getVariableComponent();
        
        List<Object> rv = new ArrayList<>();
        if (arithmetic != null)
        {
            rv.add(arithmetic);
        }
        else if (begin != null)
        {
            rv.add(begin);
        }
        else if (count != null)
        {
            rv.add(count);
        }
        else if (end != null)
        {
            rv.add(end);
        }
        else if (escapeRegex != null)
        {
            rv.add(escapeRegex);
        }
        else if (globToRegex != null)
        {
            rv.add(globToRegex);
        }
        else if (literalComponent != null)
        {
            rv.add(literalComponent);
        }
        else if (objectComponent != null)
        {
            rv.add(objectComponent);
        }
        else if (regexCapture != null)
        {
            rv.add(regexCapture);
        }
        else if (concat != null)
        {
            rv.add(concat);
        }
        else if (split != null)
        {
            rv.add(split);
        }
        else if (substring != null)
        {
            rv.add(substring);
        }
        else if (timeDifference != null)
        {
            rv.add(timeDifference);
        }
        else if (unique != null)
        {
            rv.add(unique);
        }
        else if (variableComponent != null)
        {
            rv.add(variableComponent);
        }
        return rv;
    }
    
    private List<ComponentGroup> evaluateBeginFunction(List<List<ComponentGroup>> cartesianProduct)
    {
        String beginChar = functionType.getCharacter();
        List<ComponentGroup> rv = new ArrayList<>();
        for (List<ComponentGroup> groups : cartesianProduct)
        {
            StringBuilder sb = new StringBuilder();
            for (ComponentGroup iteratorGroup : groups)
            {
                sb.append(iteratorGroup.getValue());
            }
            ComponentGroup group = new ComponentGroup();
            if (sb.toString().startsWith(beginChar))
            {
                group.setValue(sb.toString());
            }
            else
            {
                group.setValue(beginChar + sb.toString());
            }
            
            group.setDataType(SimpleDatatypeEnumeration.STRING);
            rv.add(group);
        }
        return rv;
    }
    
    @Override
    public List<ComponentGroup> evaluate() throws UnexpectedOVALEvaluationError
    {
        List<List<ComponentGroup>> componentGroups = resolveComponentGroups();
        List<List<ComponentGroup>> cartesianProduct = findCartesianProduct(componentGroups);
        
        if (childResults.isEmpty())
        {
            return evaluateBeginFunction(cartesianProduct);
        }
        else
        {
            List<List<ComponentGroup>> childGroups = new ArrayList<>();
            childGroups.add(childResults);
            if (componentGroups.size() > 0)
            {
                for (List<ComponentGroup> groups : cartesianProduct)
                {
                    childGroups.add(groups);
                }
            }
            List<List<ComponentGroup>> cartesianWithChildValues = findCartesianProduct(childGroups);
            return evaluateBeginFunction(cartesianWithChildValues);
        }
    }
}