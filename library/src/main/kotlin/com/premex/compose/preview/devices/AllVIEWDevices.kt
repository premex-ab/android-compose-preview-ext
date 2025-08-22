package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AllVIEW device specifications for Android Compose previews.
 *
 * This extension provides AllVIEW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AllVIEW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AllVIEW: Any
  get() = object {
      /** AllVIEW X6_Soul_mini */
      val X6_SOUL_MINI = "spec:width=720,height=1520,unit=px,dpi=320"

  }
