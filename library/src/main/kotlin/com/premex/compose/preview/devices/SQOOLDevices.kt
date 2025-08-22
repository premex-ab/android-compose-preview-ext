package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SQOOL device specifications for Android Compose previews.
 *
 * This extension provides SQOOL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SQOOL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SQOOL: Any
  get() = object {
      /** SQOOL SQOOL-V4 */
      val SQOOL_V4 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SQOOL SQOOL-V41 */
      val SQOOL_V41 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
