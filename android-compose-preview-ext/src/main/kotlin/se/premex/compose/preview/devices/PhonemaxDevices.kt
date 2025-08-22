package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PHONEMAX device specifications for Android Compose previews.
 *
 * This extension provides PHONEMAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Phonemax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Phonemax: Any
  get() = object {
      /** PHONEMAX M10 */
      val M10 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** PHONEMAX M3PRO */
      val M3PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** PHONEMAX P1000 */
      val P1000 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** PHONEMAX P20_Pro */
      val P20_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** PHONEMAX R4_GT */
      val R4_GT = "spec:width=540,height=1200,unit=px,dpi=280"

      /** PHONEMAX X1 */
      val X1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** PHONEMAX X1_Pro */
      val X1_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

  }
