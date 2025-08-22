package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * meizu device specifications for Android Compose previews.
 *
 * This extension provides meizu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Meizu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Meizu: Any
  get() = object {
      /** meizu meizu16sPro */
      val MEIZU16SPRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** meizu meizu16T */
      val MEIZU16T = "spec:width=720,height=1280,unit=px,dpi=320"

      /** meizu meizu16Xs */
      val MEIZU16XS = "spec:width=1080,height=2232,unit=px,dpi=480"

      /** meizu meizu17 */
      val MEIZU17 = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** meizu meizu17Pro */
      val MEIZU17PRO = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** meizu meizu18 */
      val MEIZU18 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** meizu meizu18Pro */
      val MEIZU18PRO = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** meizu meizu18s */
      val MEIZU18S = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** meizu meizu18sPro */
      val MEIZU18SPRO = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** meizu meizu18X */
      val MEIZU18X = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** meizu meizu20 */
      val MEIZU20 = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** meizu meizu20Inf */
      val MEIZU20INF = "spec:width=1368,height=3192,unit=px,dpi=560"

      /** meizu meizu20Pro */
      val MEIZU20PRO = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** meizu meizu21 */
      val MEIZU21 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** meizu Meizu21Note */
      val MEIZU21NOTE = "spec:width=1264,height=2780,unit=px,dpi=520"

      /** meizu meizu21Pro */
      val MEIZU21PRO = "spec:width=1368,height=3192,unit=px,dpi=480"

      /** meizu meizuM10 */
      val MEIZUM10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** meizu meizunote9 */
      val MEIZUNOTE9 = "spec:width=1080,height=2244,unit=px,dpi=480"

      /** meizu MEIZU_mblu */
      val MEIZU_MBLU = "spec:width=720,height=1640,unit=px,dpi=320"

      /** meizu MEIZU_Mblu22 */
      val MEIZU_MBLU22 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** meizu MEIZU_Mblu22Pro */
      val MEIZU_MBLU22PRO = "spec:width=720,height=1640,unit=px,dpi=320"

      /** meizu MEIZU_Note21 */
      val MEIZU_NOTE21 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** meizu MEIZU_Note21_Pro */
      val MEIZU_NOTE21_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** meizu Note9 */
      val NOTE9 = "spec:width=1080,height=2244,unit=px,dpi=480"

      /** meizu PolestarPhone */
      val POLESTARPHONE = "spec:width=1368,height=3192,unit=px,dpi=480"

      /** meizu 16s */
      val _16S = "spec:width=1080,height=2232,unit=px,dpi=480"

  }
