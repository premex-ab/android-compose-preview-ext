package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * xl device specifications for Android Compose previews.
 *
 * This extension provides xl device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xl: Any
  get() = object {
      /** xl STI6xxx */
      val STI6XXX = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
