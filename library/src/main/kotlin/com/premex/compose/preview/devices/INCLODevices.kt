package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * INCLO device specifications for Android Compose previews.
 *
 * This extension provides INCLO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.INCLO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.INCLO: Any
  get() = object {
      /** INCLO khardi */
      val KHARDI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** INCLO pioneer */
      val PIONEER = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
