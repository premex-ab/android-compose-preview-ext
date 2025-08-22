package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * easyteck device specifications for Android Compose previews.
 *
 * This extension provides easyteck device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Easyteck.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Easyteck: Any
  get() = object {
      /** easyteck EK12 */
      val EK12 = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
