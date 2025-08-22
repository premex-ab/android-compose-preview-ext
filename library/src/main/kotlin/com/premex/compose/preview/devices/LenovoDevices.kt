package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LENOVO device specifications for Android Compose previews.
 *
 * This extension provides LENOVO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lenovo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lenovo: Any
  get() = object {
      /** LENOVO aio_3m_otfp_m */
      val AIO_3M_OTFP_M = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
