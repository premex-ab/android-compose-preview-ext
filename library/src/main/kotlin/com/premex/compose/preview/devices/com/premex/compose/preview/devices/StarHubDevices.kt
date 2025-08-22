package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * StarHub device specifications for Android Compose previews.
 *
 * This extension provides StarHub device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.StarHub.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.StarHub: Any
  get() = object {
      /** DeviceSpec(manufacturer=StarHub, code=m393vsb_starhub, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=StarHub, code=m393vsb_starhub,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val M393VSB_STARHUB = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=StarHub, code=NVSH800H1, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=StarHub, code=NVSH800H1,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val NVSH800H1 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
