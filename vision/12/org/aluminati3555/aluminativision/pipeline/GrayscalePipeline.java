/**
 * Copyright (c) 2019 Team 3555
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.aluminati3555.aluminativision.pipeline;

import org.aluminati3555.aluminativision.camera.VisionCamera;
import org.aluminati3555.aluminativision.net.VisionData;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

/**
 * This class implements a grayscale vision pipeline
 * 
 * @author Caleb Heydon
 */
public class GrayscalePipeline implements IVisionPipeline {
	private VisionData visionData;
	private Mat outputFrame;

	/**
	 * Does nothing
	 */
	public Mat process(Mat frame, double fps) {
		Imgproc.cvtColor(frame, outputFrame, Imgproc.COLOR_BGR2GRAY);
		
		return outputFrame;
	}

	/**
	 * Return empty vision data
	 */
	public VisionData getOutput() {
		return visionData;
	}
	
	/**
	 * Does nothing
	 */
	public void updateCamera(VisionCamera camera) {
		
	}

	public GrayscalePipeline() {
		visionData = new VisionData();
		outputFrame = new Mat();
	}
}
