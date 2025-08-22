package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XD-Enjoy device specifications for Android Compose previews.
 *
 * This extension provides XD-Enjoy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XDEnjoy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XDEnjoy: Any
  get() = object {
      /** XD-Enjoy XDDGM10 */
      val XDDGM10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** XD-Enjoy XDDGM11BS */
      val XDDGM11BS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** XD-Enjoy XDDGM99PM */
      val XDDGM99PM = "spec:width=800,height=1280,unit=px,dpi=213"

  }
