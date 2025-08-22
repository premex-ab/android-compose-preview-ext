package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LARVAND device specifications for Android Compose previews.
 *
 * This extension provides LARVAND device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LARVAND.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LARVAND: Any
  get() = object {
      /** LARVAND M863TabH8 */
      val M863TABH8 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
