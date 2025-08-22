package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * iDevice device specifications for Android Compose previews.
 *
 * This extension provides iDevice device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Idevice.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Idevice: Any
  get() = object {
      /** iDevice Uzbekistan */
      val UZBEKISTAN = "spec:width=720,height=1520,unit=px,dpi=320"

  }
