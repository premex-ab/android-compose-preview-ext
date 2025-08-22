package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Ayat device specifications for Android Compose previews.
 *
 * This extension provides Ayat device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ayat.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ayat: Any
  get() = object {
      /** Ayat Ayat101 */
      val AYAT101 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Ayat Ayat_101 */
      val AYAT_101 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
