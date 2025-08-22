package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DishTV device specifications for Android Compose previews.
 *
 * This extension provides DishTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DishTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DishTV: Any
  get() = object {
      /** DishTV SEI110 */
      val SEI110 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DishTV STB */
      val STB = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
