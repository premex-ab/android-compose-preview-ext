package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HAOQIN device specifications for Android Compose previews.
 *
 * This extension provides HAOQIN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HAOQIN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HAOQIN: Any
  get() = object {
      /** HAOQIN H10Pro */
      val H10PRO = "spec:width=800,height=1280,unit=px,dpi=160"

  }
