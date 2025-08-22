package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Doppio device specifications for Android Compose previews.
 *
 * This extension provides Doppio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Doppio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Doppio: Any
  get() = object {
      /** Doppio Doppio_SL558 */
      val DOPPIO_SL558 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Doppio U500 */
      val U500 = "spec:width=480,height=854,unit=px,dpi=240"

  }
