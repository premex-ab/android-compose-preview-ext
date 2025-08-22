package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * OpelMobile device specifications for Android Compose previews.
 *
 * This extension provides OpelMobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Opelmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Opelmobile: Any
  get() = object {
      /** OpelMobile OMR60Q23O */
      val OMR60Q23O = "spec:width=480,height=960,unit=px,dpi=240"

      /** OpelMobile OMS60R24B */
      val OMS60R24B = "spec:width=480,height=960,unit=px,dpi=200"

      /** OpelMobile OpelMobile_OMSJ523B */
      val OPELMOBILE_OMSJ523B = "spec:width=540,height=960,unit=px,dpi=240"

      /** OpelMobile Smart55R */
      val SMART55R = "spec:width=480,height=960,unit=px,dpi=220"

      /** OpelMobile SmartJX */
      val SMARTJX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** OpelMobile SmartX1 */
      val SMARTX1 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
