

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

package com.vulniq.client.securityanalyzer.oval.analyze.tests;

import com.vulniq.client.securityanalyzer.oval.OVALInterpreter;
import org.mitre.oval.xmlschema.oval_definitions_5.StateRefType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyTest;

import java.util.List;

public class FamilyTestImpl extends TestImplBase
{
    private FamilyTest familyTest;
    public FamilyTestImpl(OVALInterpreter interpreter, FamilyTest testType)
    {
        super(interpreter, testType);
        this.familyTest = testType;
    }

    @Override
    public String getObjectId()
    {
        return familyTest.getObject().getObjectRef();
    }

    @Override
    public List<StateRefType> getStateRefs()
    {
        return familyTest.getState();
    }

}