package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Smarti device specifications for Android Compose previews.
 *
 * This extension provides Smarti device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Smarti.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Smarti: Any
  get() = object {
      /** Smarti Smarti_Gen_1 */
      val SMARTI_GEN_1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Smarti Smarti_Gen_2 */
      val SMARTI_GEN_2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Smarti Smarti_T2_plus */
      val SMARTI_T2_PLUS = "spec:width=800,height=1280,unit=px,dpi=220"

  }
