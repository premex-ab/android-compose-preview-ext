package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Babal device specifications for Android Compose previews.
 *
 * This extension provides Babal device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Babal.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Babal: Any
  get() = object {
      /** Babal Babal_1008 */
      val BABAL_1008 = "spec:width=720,height=1440,unit=px,dpi=240"

  }
