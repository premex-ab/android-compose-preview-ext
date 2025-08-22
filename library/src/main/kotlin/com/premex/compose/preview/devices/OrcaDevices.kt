package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Orca device specifications for Android Compose previews.
 *
 * This extension provides Orca device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Orca.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Orca: Any
  get() = object {
      /** Orca Orca_Display_2 */
      val ORCA_DISPLAY_2 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
