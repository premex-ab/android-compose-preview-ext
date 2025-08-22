package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RiksTV device specifications for Android Compose previews.
 *
 * This extension provides RiksTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rikstv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rikstv: Any
  get() = object {
      /** RiksTV HP40A3 */
      val HP40A3 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
