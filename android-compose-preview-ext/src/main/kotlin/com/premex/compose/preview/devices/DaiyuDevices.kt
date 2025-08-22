package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DAIYU device specifications for Android Compose previews.
 *
 * This extension provides DAIYU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Daiyu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Daiyu: Any
  get() = object {
      /** DAIYU Mediabox */
      val MEDIABOX = "spec:width=1080,height=1920,unit=px,dpi=213"

  }
