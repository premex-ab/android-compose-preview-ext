package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GPELECTRONIC device specifications for Android Compose previews.
 *
 * This extension provides GPELECTRONIC device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GPELECTRONIC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GPELECTRONIC: Any
  get() = object {
      /** GPELECTRONIC YC-83P */
      val YC_83P = "spec:width=800,height=1280,unit=px,dpi=213"

      /** GPELECTRONIC YC-83T */
      val YC_83T = "spec:width=800,height=1280,unit=px,dpi=160"

  }
