package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CherryMobile device specifications for Android Compose previews.
 *
 * This extension provides CherryMobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cherrymobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cherrymobile: Any
  get() = object {
      /** CherryMobile Aqua_S10_Pro */
      val AQUA_S10_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** CherryMobile Aqua_S10_Pro_5G */
      val AQUA_S10_PRO_5G = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** CherryMobile Aqua_SV */
      val AQUA_SV = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
