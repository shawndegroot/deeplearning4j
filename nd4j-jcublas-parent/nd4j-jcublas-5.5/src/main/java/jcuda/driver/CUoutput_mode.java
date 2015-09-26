/*
 *
 *  * Copyright 2015 Skymind,Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 *
 */

package jcuda.driver;

/**
 * Profiler Output Modes.<br />
 * <br />
 * Most comments are taken from the CUDA reference manual.
 *
 * @see JCudaDriver#cuProfilerInitialize
 */
public class CUoutput_mode
{
    /** 
     * Output mode Key-Value pair format. 
     */
    public static final int CU_OUT_KEY_VALUE_PAIR  = 0x00; 
    
    /** 
     * Output mode Comma separated values format. 
     */
    public static final int CU_OUT_CSV             = 0x01; 


    /**
     * Returns the String identifying the given CUoutput_mode
     *
     * @param n The CUoutput_mode
     * @return The String identifying the given CUoutput_mode
     */
    public static String stringFor(int n)
    {
        switch (n)
        {
            case CU_OUT_KEY_VALUE_PAIR: return "CU_OUT_KEY_VALUE_PAIR";
            case CU_OUT_CSV: return "CU_OUT_CSV";
        }
        return "INVALID CUoutput_mode: "+n;
    }

    /**
     * Private constructor to prevent instantiation.
     */
    private CUoutput_mode()
    {
    }

}
