package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BLACKFOX device specifications for Android Compose previews.
 *
 * This extension provides BLACKFOX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Blackfox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Blackfox: Any
  get() = object {
      /** BLACKFOX BMM441B */
      val BMM441B = "spec:width=720,height=1560,unit=px,dpi=320"

  }
