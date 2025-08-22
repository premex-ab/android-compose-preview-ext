package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HemiltonPro device specifications for Android Compose previews.
 *
 * This extension provides HemiltonPro device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hemiltonpro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hemiltonpro: Any
  get() = object {
      /** HemiltonPro Tab1000 */
      val TAB1000 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
