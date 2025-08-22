package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * bbox device specifications for Android Compose previews.
 *
 * This extension provides bbox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bbox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bbox: Any
  get() = object {
      /** bbox bbox-M752A */
      val BBOX_M752A = "spec:width=576,height=720,unit=px,dpi=320"

  }
