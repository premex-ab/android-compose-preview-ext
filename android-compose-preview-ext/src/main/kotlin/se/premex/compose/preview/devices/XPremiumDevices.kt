package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * X-PREMIUM device specifications for Android Compose previews.
 *
 * This extension provides X-PREMIUM device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XPremium.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XPremium: Any
  get() = object {
      /** X-PREMIUM X1 */
      val X1 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
