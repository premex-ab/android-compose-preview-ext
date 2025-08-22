package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MetroPCS device specifications for Android Compose previews.
 *
 * This extension provides MetroPCS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Metropcs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Metropcs: Any
  get() = object {
      /** MetroPCS c50 */
      val C50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** MetroPCS e2nam */
      val E2NAM = "spec:width=480,height=800,unit=px,dpi=240"

      /** MetroPCS g4stylusn */
      val G4STYLUSN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MetroPCS hwY301A1 */
      val HWY301A1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** MetroPCS lv3 */
      val LV3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MetroPCS lv517 */
      val LV517 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MetroPCS m1 */
      val M1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** MetroPCS m209n */
      val M209N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MetroPCS ph2n */
      val PH2N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MetroPCS sf340n */
      val SF340N = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** MetroPCS w5 */
      val W5 = "spec:width=480,height=800,unit=px,dpi=240"

  }
