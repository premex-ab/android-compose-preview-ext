package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Viettel device specifications for Android Compose previews.
 *
 * This extension provides Viettel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Viettel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Viettel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Viettel, code=MediaBox_B866V2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Viettel, code=MediaBox_B866V2,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val MEDIABOX_B866V2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Viettel, code=VTTV-SD4K-20, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Viettel, code=VTTV-SD4K-20,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val VTTV_SD4K_20 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
