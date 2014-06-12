/*
 * Hivemall: Hive scalable Machine Learning Library
 *
 * Copyright (C) 2013-2014
 *   National Institute of Advanced Industrial Science and Technology (AIST)
 *   Registration Number: H25PRO-1520
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package hivemall.utils;

import java.util.Arrays;
import java.util.List;

import org.apache.hadoop.hive.serde2.io.DoubleWritable;
import org.apache.hadoop.io.BooleanWritable;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

public final class WritableUtils {

    public static IntWritable val(final int v) {
        return new IntWritable(v);
    }

    public static FloatWritable val(final float v) {
        return new FloatWritable(v);
    }

    public static DoubleWritable val(final double v) {
        return new DoubleWritable(v);
    }

    public static BooleanWritable val(final boolean v) {
        return new BooleanWritable(v);
    }

    public static Text val(final String v) {
        return new Text(v);
    }

    public static List<Text> val(final String[] v) {
        final Text[] ret = new Text[v.length];
        for(int i = 0; i < v.length; i++) {
            String vi = v[i];
            ret[i] = (vi == null) ? null : new Text(vi);
        }
        return Arrays.asList(ret);
    }
}
