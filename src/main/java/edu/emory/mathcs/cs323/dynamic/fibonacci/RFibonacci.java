/**
 * Copyright 2014, Emory University
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.emory.mathcs.cs323.dynamic.fibonacci;

/**
 * @author Jinho D. Choi ({@code jinho.choi@emory.edu})
 */
public class RFibonacci extends AbstractFibonacci
{
	@Override
	protected int get2p(int k)
	{
		switch (k)
		{
			case 0 : return 0;
			case 1 : return 1;
			default: return get2p(k-1) + get2p(k-2);
		}
	}
}
