package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * LT device specifications for Android Compose previews.
 *
 * This extension provides LT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lt: Any
  get() = object {
      /** LT HLTE227E */
      val HLTE227E = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** LT HS8909QC */
      val HS8909QC = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** LT HS8917QC */
      val HS8917QC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LT LT */
      val LT = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** LT LT971 */
      val LT971 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LT LT_6217 */
      val LT_6217 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LT LT_6509 */
      val LT_6509 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LT LT_8103 */
      val LT_8103 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** LT LT_8501 */
      val LT_8501 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LT LT_9701 */
      val LT_9701 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** LT LT_9902 */
      val LT_9902 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** LT LT_9906 */
      val LT_9906 = "spec:width=1080,height=2560,unit=px,dpi=480"

      /** LT LT_C1500 */
      val LT_C1500 = "spec:width=480,height=960,unit=px,dpi=240"

      /** LT LT_C2100 */
      val LT_C2100 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LT LT_C2200 */
      val LT_C2200 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LT LT_C3300 */
      val LT_C3300 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LT LT_C3500 */
      val LT_C3500 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** LT LT-NOTE-10S */
      val LT_NOTE_10S = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** LT LT_S10_Lite */
      val LT_S10_LITE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** LT LT_S9_NOTE */
      val LT_S9_NOTE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** LT Note_30 */
      val NOTE_30 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
