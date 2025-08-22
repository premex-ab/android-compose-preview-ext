package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * unifi-TV device specifications for Android Compose previews.
 *
 * This extension provides unifi-TV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UnifiTv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UnifiTv: Any
  get() = object {
      /** unifi-TV HP40A3 */
      val HP40A3 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** unifi-TV HP43A */
      val HP43A = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
