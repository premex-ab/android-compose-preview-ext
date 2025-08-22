package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sequel device specifications for Android Compose previews.
 *
 * This extension provides Sequel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sequel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sequel: Any
  get() = object {
      /** Sequel glowlight */
      val GLOWLIGHT = "spec:width=390,height=390,unit=px,dpi=320"

  }
