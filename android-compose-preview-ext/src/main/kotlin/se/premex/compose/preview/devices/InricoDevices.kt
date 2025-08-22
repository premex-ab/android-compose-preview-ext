package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Inrico device specifications for Android Compose previews.
 *
 * This extension provides Inrico device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Inrico.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Inrico: Any
  get() = object {
      /** Inrico S300Plus */
      val S300PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Inrico S350 */
      val S350 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
