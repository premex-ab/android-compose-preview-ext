package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KPN device specifications for Android Compose previews.
 *
 * This extension provides KPN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KPN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KPN: Any
  get() = object {
      /** DeviceSpec(manufacturer=KPN, code=m250_k, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KPN, code=m250_k, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val M250_K = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KPN, code=m393vsb_kpn, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KPN, code=m393vsb_kpn, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val M393VSB_KPN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
