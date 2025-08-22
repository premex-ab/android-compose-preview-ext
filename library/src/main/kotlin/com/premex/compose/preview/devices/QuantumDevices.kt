package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Quantum device specifications for Android Compose previews.
 *
 * This extension provides Quantum device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Quantum.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Quantum: Any
  get() = object {
      /** Quantum Q03 */
      val Q03 = "spec:width=480,height=1014,unit=px,dpi=200"

      /** Quantum Q11 */
      val Q11 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Quantum Q13 */
      val Q13 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Quantum Q17 */
      val Q17 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Quantum Q19 */
      val Q19 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Quantum Q2 */
      val Q2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Quantum Q3 */
      val Q3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Quantum Q3C */
      val Q3C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Quantum Q5 */
      val Q5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Quantum QC84 */
      val QC84 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Quantum QE83 */
      val QE83 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Quantum QM83 */
      val QM83 = "spec:width=720,height=1440,unit=px,dpi=260"

      /** Quantum QX1 */
      val QX1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Quantum QX2 */
      val QX2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Quantum S518AR */
      val S518AR = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Quantum S600AR */
      val S600AR = "spec:width=480,height=960,unit=px,dpi=200"

  }
