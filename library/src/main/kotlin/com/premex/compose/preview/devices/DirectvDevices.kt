package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DIRECTV device specifications for Android Compose previews.
 *
 * This extension provides DIRECTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Directv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Directv: Any
  get() = object {
      /** DIRECTV HP40A */
      val HP40A = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DIRECTV HYS0A */
      val HYS0A = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DIRECTV p21kw500 */
      val P21KW500 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
