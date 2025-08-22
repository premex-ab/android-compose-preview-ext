package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CityNetTV device specifications for Android Compose previews.
 *
 * This extension provides CityNetTV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Citynettv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Citynettv: Any
  get() = object {
      /** CityNetTV SEI900BUQC */
      val SEI900BUQC = "spec:width=720,height=1280,unit=px,dpi=320"

  }
