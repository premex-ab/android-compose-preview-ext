package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * vernee device specifications for Android Compose previews.
 *
 * This extension provides vernee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vernee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vernee: Any
  get() = object {
      /** vernee M2 */
      val M2 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** vernee M2_PRO */
      val M2_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** vernee M3 */
      val M3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** vernee M6 */
      val M6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** vernee M7_EEA */
      val M7_EEA = "spec:width=600,height=1280,unit=px,dpi=240"

      /** vernee M8_Pro */
      val M8_PRO = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** vernee T3_Pro */
      val T3_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** vernee Thor_E */
      val THOR_E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** vernee Thor_Plus */
      val THOR_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** vernee V1 */
      val V1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** vernee V2_Pro */
      val V2_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** vernee vernee_M5 */
      val VERNEE_M5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** vernee X1 */
      val X1 = "spec:width=1080,height=2160,unit=px,dpi=400"

      /** vernee X1_PRO */
      val X1_PRO = "spec:width=1080,height=2160,unit=px,dpi=400"

      /** vernee X2_euro */
      val X2_EURO = "spec:width=720,height=1440,unit=px,dpi=320"

  }
