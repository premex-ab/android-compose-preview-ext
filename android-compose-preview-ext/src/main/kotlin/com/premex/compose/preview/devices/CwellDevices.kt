package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CWELL device specifications for Android Compose previews.
 *
 * This extension provides CWELL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cwell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cwell: Any
  get() = object {
      /** CWELL M10 */
      val M10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
