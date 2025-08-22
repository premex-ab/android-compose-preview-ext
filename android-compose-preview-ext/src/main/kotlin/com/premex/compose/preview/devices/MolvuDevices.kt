package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MOLVU device specifications for Android Compose previews.
 *
 * This extension provides MOLVU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Molvu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Molvu: Any
  get() = object {
      /** MOLVU M10PRO */
      val M10PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MOLVU V7S */
      val V7S = "spec:width=600,height=1024,unit=px,dpi=160"

  }
