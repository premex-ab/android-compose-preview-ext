package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TazTag device specifications for Android Compose previews.
 *
 * This extension provides TazTag device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TazTag.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TazTag: Any
  get() = object {
      /** TazTag TazPad-FAP30 */
      val TAZPAD_FAP30 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TazTag Tazpad-FAP60 */
      val TAZPAD_FAP60 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
