package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Zucchetti device specifications for Android Compose previews.
 *
 * This extension provides Zucchetti device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zucchetti.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zucchetti: Any
  get() = object {
      /** Zucchetti Zpad_608 */
      val ZPAD_608 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
