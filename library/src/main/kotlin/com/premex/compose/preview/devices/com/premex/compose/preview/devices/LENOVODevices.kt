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
 * @Preview(device = Devices.LENOVO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LENOVO: Any
  get() = object {
      /** DeviceSpec(manufacturer=LENOVO, code=aio_3m_otfp_m, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LENOVO, code=aio_3m_otfp_m,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val AIO_3M_OTFP_M = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
