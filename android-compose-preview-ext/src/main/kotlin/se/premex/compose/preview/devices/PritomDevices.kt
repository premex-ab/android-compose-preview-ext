package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * pritom device specifications for Android Compose previews.
 *
 * This extension provides pritom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pritom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pritom: Any
  get() = object {
      /** pritom L8_B03 */
      val L8_B03 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
