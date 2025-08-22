package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KEFEYA device specifications for Android Compose previews.
 *
 * This extension provides KEFEYA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kefeya.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kefeya: Any
  get() = object {
      /** KEFEYA G2 */
      val G2 = "spec:width=1080,height=1920,unit=px,dpi=216"

  }
