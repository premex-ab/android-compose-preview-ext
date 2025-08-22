package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Lava device specifications for Android Compose previews.
 *
 * This extension provides Lava device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lava.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lava: Any
  get() = object {
      /** Lava A52 */
      val A52 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Lava A76Plus */
      val A76PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** Lava A77 */
      val A77 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Lava A97 */
      val A97 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Lava A97_2GB_PLUS */
      val A97_2GB_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** Lava Be_U */
      val BE_U = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Lava iris30 */
      val IRIS30 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Lava iris40 */
      val IRIS40 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Lava iris50 */
      val IRIS50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Lava iris702 */
      val IRIS702 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Lava iris820 */
      val IRIS820 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Lava iris821 */
      val IRIS821 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Lava iris870 */
      val IRIS870 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Lava LA79 */
      val LA79 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Lava LAVA_A3 */
      val LAVA_A3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Lava Lava_Aura_Plus */
      val LAVA_AURA_PLUS = "spec:width=600,height=1024,unit=px,dpi=213"

      /** Lava LAVA_R1 */
      val LAVA_R1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Lava LAVA_Z10 */
      val LAVA_Z10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Lava LE000Z93P */
      val LE000Z93P = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Lava LMG01 */
      val LMG01 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Lava LMG02 */
      val LMG02 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Lava LMX02 */
      val LMX02 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Lava LMX04 */
      val LMX04 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Lava LMX06 */
      val LMX06 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Lava LZG01 */
      val LZG01 = "spec:width=720,height=1640,unit=px,dpi=280"

      /** Lava LZG401 */
      val LZG401 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Lava P7 */
      val P7 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Lava V23GB */
      val V23GB = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Lava X10 */
      val X10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Lava X41_Plus */
      val X41_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Lava X50_Plus */
      val X50_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Lava X81 */
      val X81 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Lava Z100 */
      val Z100 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Lava Z25 */
      val Z25 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Lava Z40 */
      val Z40 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Lava Z61P */
      val Z61P = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Lava Z66 */
      val Z66 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Lava Z70 */
      val Z70 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Lava Z93P */
      val Z93P = "spec:width=720,height=1560,unit=px,dpi=320"

  }
