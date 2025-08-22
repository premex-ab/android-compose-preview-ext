package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TazTag device specifications for Android Compose previews.
 *
 * This extension provides TazTag device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Taztag.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Taztag: Any
  get() = object {
      /** TazTag TazPad-FAP30 */
      val TAZPAD_FAP30 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TazTag Tazpad-FAP60 */
      val TAZPAD_FAP60 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
