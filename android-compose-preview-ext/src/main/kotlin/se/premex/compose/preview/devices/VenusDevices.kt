package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VENUS device specifications for Android Compose previews.
 *
 * This extension provides VENUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Venus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Venus: Any
  get() = object {
      /** VENUS V5_Plus_ */
      val V5_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

  }
