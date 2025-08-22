package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AVA device specifications for Android Compose previews.
 *
 * This extension provides AVA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ava.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ava: Any
  get() = object {
      /** AVA AVA-RM-RX1 */
      val AVA_RM_RX1 = "spec:width=480,height=1170,unit=px,dpi=240"

      /** AVA AVA-RM-RX2-US */
      val AVA_RM_RX2_US = "spec:width=540,height=1080,unit=px,dpi=260"

  }
