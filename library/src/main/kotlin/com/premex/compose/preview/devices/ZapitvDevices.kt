package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZapiTV device specifications for Android Compose previews.
 *
 * This extension provides ZapiTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zapitv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zapitv: Any
  get() = object {
      /** ZapiTV SEI500PTV */
      val SEI500PTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ZapiTV SEI800ZAPI */
      val SEI800ZAPI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
